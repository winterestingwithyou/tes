/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemeninventaris.controller;

import manajemeninventaris.model.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
/**
 *
 * @author Acer
 */
public class TransaksiController extends Controller<Transaksi> {
    @Override //implementasi Overriding
    public void index(JComponent component) throws SQLException {
        //menampilkan data database kedalam tabel
        int no=1;
        Transaksi transaksi = new Transaksi();
        List<Transaksi> transaksis = transaksi.all();

        if (component instanceof JTable) {
            JTable table = (JTable) component;
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(new String[]{"No", "ID Transaksi", "Id Barang", "ID User", "Tipe Transaksi", "Jumlah", "Tanggal"});
            
            //Memasukkan data ke tabel untuk setiap baris
            for (Transaksi t : transaksis) {
                tableModel.addRow(new Object[]{no++, t.getId(), t.getIdBarang(), t.getIdUser(), t.getTipe(), t.getJumlah(), t.getTanggal()});
            }
            table.setModel(tableModel);
        } else {
            throw new IllegalArgumentException("Unsupported component type: " + component.getClass().getSimpleName());
        }
    }
    
    @Override //implementasi Overriding
    public Transaksi show(String id) throws SQLException{     
        return new Transaksi().find(id);
    }
    
    @Override //implementasi Overriding
    public void store(Transaksi obj) throws SQLException{
        obj.insert();
        
        //Mengupdate jumlah barang sesuai Tipe dan Jumlah Transaksi
        Barang barang = new BarangController().show(obj.getIdBarang());
        int stokbaru = ("Penambahan".equals(obj.getTipe())) ? barang.getStok() + obj.getJumlah() : barang.getStok() - obj.getJumlah();
        barang.setStok(stokbaru);
        new BarangController().update(barang);
    }
    
    @Override //implementasi Overriding
    public void update(Transaksi obj) throws SQLException{
        obj.update();
    }
    
    @Override //implementasi Overriding
    public void destroy(String id) throws SQLException{
        Transaksi transaksi = this.show(id);
        new Transaksi().delete(id);
        
        //Mengupdate jumlah barang sesuai Tipe dan Jumlah Transaksi
        Barang barang = new BarangController().show(transaksi.getIdBarang());
        int stokbaru = ("Penambahan".equals(transaksi.getTipe())) ? barang.getStok() - transaksi.getJumlah() : barang.getStok() + transaksi.getJumlah();
        barang.setStok(stokbaru);
        new BarangController().update(barang);
    }
}
