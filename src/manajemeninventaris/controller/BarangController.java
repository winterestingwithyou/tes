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
public class BarangController extends Controller<Barang> {
    @Override //implementasi Overriding
    public void index(JComponent component) throws SQLException {
        //menampilkan data database kedalam tabel
        int no=1;
        Barang barang = new Barang();
        List<Barang> barangs = barang.all();

        if (component instanceof JTable) {
            JTable table = (JTable) component;
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(new String[]{"No", "Id Barang", "Nama Barang", "Sku", "Kategori", "Harga", "Jumlah Stok"});
            
            //Memasukkan data ke tabel untuk setiap baris
            for (Barang b : barangs) {
                tableModel.addRow(new Object[]{no++, b.getId(), b.getNama(), b.getSKU(), b.getKategori(), b.getHarga(), b.getStok()});
            }
            table.setModel(tableModel);
        } else {
            throw new IllegalArgumentException("Unsupported component type: " + component.getClass().getSimpleName());
        }
    }
    
    @Override //implementasi Overriding
    public Barang show(String id) throws SQLException{
        return new Barang().find(id);
    }
    
    @Override //implementasi Overriding
    public void store(Barang obj) throws SQLException{
        obj.insert();
    }
    
    @Override //implementasi Overriding
    public void update(Barang obj) throws SQLException{
        obj.update();
    }
    
    @Override //implementasi Overriding
    public void destroy(String id) throws SQLException{
        new Barang().delete(id);
        
        //Menghapus Transaksi yang sesuai Barang
        new Transaksi().deleteByField("Id_user", id);
    }
}
 