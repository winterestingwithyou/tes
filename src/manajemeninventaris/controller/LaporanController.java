/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemeninventaris.controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.Box;
import javax.swing.*;
import manajemeninventaris.model.*;
import manajemeninventaris.view.pnl_daftarLaporan;
import manajemeninventaris.view.pnl_dtlaporan;

/**
 *
 * @author Acer
 */
public class LaporanController extends Controller<Laporan> {
    
    @Override //implementasi Overriding
    public void index(JComponent component) throws SQLException {
        //menampilkan data database kedalam Panel Scrollpane
        Laporan laporan = new Laporan();
        List<Laporan> laporans = laporan.all();

        if (component instanceof JPanel) {
            JPanel panel = (JPanel) component;
            pnl_dtlaporan mainpanel = (pnl_dtlaporan) SwingUtilities.getAncestorOfClass(pnl_dtlaporan.class, panel);
            panel.removeAll();
            
            //Membuat panel baru dengan data
            for (Laporan l : laporans) {
                panel.add(new pnl_daftarLaporan(mainpanel, l.getId(), l.getTipe(), l.getTanggal(), l.getIdUser(), l.getFile(), l.getCatatan()));
                panel.add(Box.createVerticalStrut(10));
            }
            panel.revalidate();
            panel.repaint();
        } else {
            throw new IllegalArgumentException("Unsupported component type: " + component.getClass().getSimpleName());
        }
    }
    
    @Override //implementasi Overriding
    public Laporan show(String id) throws SQLException{
        return new Laporan().find(id);
    }
    
    @Override //implementasi Overriding
    public void store(Laporan obj) throws SQLException{
        obj.insert();
    }
    
    @Override //implementasi Overriding
    protected void update(Laporan obj) throws SQLException{
        //Tidak dapat mengubah laporan
    }
    
    @Override //implementasi Overriding
    public void destroy(String id) throws SQLException{
        new Laporan().delete(id);
    }
}
