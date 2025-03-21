/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package manajemeninventaris.view;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.*;
import manajemeninventaris.model.User;
import manajemeninventaris.controller.LaporanController;

/**
 *
 * @author Acer
 */
public class pnl_daftarLaporan extends javax.swing.JPanel {
    private pnl_dtlaporan pnl;
    private String IDLaporan;
    private String tipe;
    private String tanggaldibuat;
    private String IDUser;
    private String file;
    private String catatan;
    /**
     * Creates new form pnl_daftarLaporan
     */
    
    public pnl_daftarLaporan(pnl_dtlaporan panel, String IDLaporan, String tipe, String tanggaldibuat, String IDUser, String file, String catatan) {
        this.pnl = panel;
        this.IDLaporan = IDLaporan;
        this.tipe = tipe;
        this.tanggaldibuat = tanggaldibuat;
        this.IDUser = IDUser;
        this.file = file;
        this.catatan = catatan;
        
        initComponents();
        tampil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbID = new javax.swing.JLabel();
        lbTipe = new javax.swing.JLabel();
        lbCatatan = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnFile = new javax.swing.JButton();
        lbTanggalDibuat = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 5, 10, 5));
        setMaximumSize(new java.awt.Dimension(32767, 100));
        setPreferredSize(new java.awt.Dimension(531, 100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbID.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        lbID.setText("IDL");
        add(lbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 16, -1, -1));

        lbTipe.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lbTipe.setText("Laporan Pengguna");
        add(lbTipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 24, -1, -1));

        lbCatatan.setText("Laporan Pengguna Bulan Juli");
        add(lbCatatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 63, -1, -1));

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 67, -1, -1));

        btnFile.setBackground(new java.awt.Color(153, 255, 255));
        btnFile.setText("File");
        add(btnFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 29, -1, -1));

        lbTanggalDibuat.setText("12 Desember 2024");
        add(lbTanggalDibuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 35, -1, -1));

        lbUser.setText("oleh");
        add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 57, 86, -1));
    }// </editor-fold>//GEN-END:initComponents

    //Method untuk menghapus Data Laporan
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            //menghapus data dari database
            new LaporanController().destroy(IDLaporan);
            
            //Pesan jika berhasil
            JOptionPane.showMessageDialog(null, "Berhasil menghapus Data Laporan");
        } catch(HeadlessException | SQLException e) {
            //Pesan jika gagal
            JOptionPane.showMessageDialog(null, "Gagal : " + e.getMessage(), "Gagal menghapus Data Laporan", JOptionPane.ERROR_MESSAGE);
        }
        pnl.read();
    }//GEN-LAST:event_btnHapusActionPerformed
    
    //Method untuk mengubah tampilan panel berdasarkan data dari database
    private void tampil() {
        try{
            String nama =  new User().find(this.IDUser).getUsername();
            
            lbID.setText(this.IDLaporan);
            lbTipe.setText("Laporan " + this.tipe);
            lbTanggalDibuat.setText(this.tanggaldibuat);
            lbUser.setText("oleh " + nama);
            lbCatatan.setText(this.catatan);
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal : " + e.getMessage(), "Gagal menampilkan Data Laporan", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFile;
    private javax.swing.JButton btnHapus;
    private javax.swing.JLabel lbCatatan;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbTanggalDibuat;
    private javax.swing.JLabel lbTipe;
    private javax.swing.JLabel lbUser;
    // End of variables declaration//GEN-END:variables
}
