/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package manajemeninventaris.view;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import manajemeninventaris.auth.PasswordUtils;
import manajemeninventaris.config;
import manajemeninventaris.model.User;
import manajemeninventaris.controller.UserController;

/**
 *
 * @author Acer
 */
public class pnl_pengguna extends javax.swing.JPanel {

    /**
     * Creates new form pnl_pengguna
     */
    public pnl_pengguna() {
        initComponents();
        
        read();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblPengguna = new javax.swing.JLabel();
        lblPeran = new javax.swing.JLabel();
        lblNo = new javax.swing.JLabel();
        cmbPeran = new javax.swing.JComboBox<>();
        txtIdPengguna = new javax.swing.JTextField();
        txtNamaPengguna = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1144, 420));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("Form Pengguna");

        jPanel1.setBackground(new java.awt.Color(214, 192, 179));
        jPanel1.setPreferredSize(new java.awt.Dimension(526, 330));

        lblPengguna.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPengguna.setText("ID Pengguna ");

        lblPeran.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPeran.setText("Peran");

        lblNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNo.setText("No.Telepon");

        cmbPeran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supervisor", "Karyawan", "Pengelola Barang", "Admin Gudang" }));
        cmbPeran.setSelectedIndex(-1);
        cmbPeran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPeranActionPerformed(evt);
            }
        });

        txtIdPengguna.setPreferredSize(new java.awt.Dimension(105, 22));
        txtIdPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPenggunaActionPerformed(evt);
            }
        });

        txtNamaPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaPenggunaActionPerformed(evt);
            }
        });

        lblNama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNama.setText("Nama Pengguna ");

        btnTambah.setBackground(new java.awt.Color(73, 54, 40));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(73, 54, 40));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(73, 54, 40));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(73, 54, 40));
        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnTambah)
                        .addGap(33, 33, 33)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(27, 27, 27)
                        .addComponent(btnBatal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPeran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNo)
                            .addComponent(cmbPeran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdPengguna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNamaPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeran, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPeran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal))
                .addGap(56, 56, 56))
        );

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.setPreferredSize(new java.awt.Dimension(557, 330));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPeranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPeranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPeranActionPerformed

    private void txtIdPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPenggunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPenggunaActionPerformed

    private void txtNamaPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPenggunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaPenggunaActionPerformed

    //Menambah Data Pengguna Baru
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        //Mengambil data dari komponen
        String id = txtIdPengguna.getText();
        String nama = txtNamaPengguna.getText();
        String hashedPassword = PasswordUtils.hashPassword("Admin#1234"); //Password Awal
        String role = cmbPeran.getSelectedItem().toString();
        String kontak = txtNo.getText();
        
        try {
            //Menambah data ke database
            User user = new User();
            user.setId(id);
            user.setUsername(nama);
            user.setPassword(hashedPassword);
            user.setRole(role);
            user.setKontak(kontak);
            new UserController().store(user);
            
            //Pesan jika berhasil
            JOptionPane.showMessageDialog(null, "Berhasil menambahkan Data Pengguna");
        } catch (Exception e) {
            //Pesan jika gagal
            JOptionPane.showMessageDialog(null, "Gagal : " + e.getMessage(), "Gagal menambahkan Data Pengguna", JOptionPane.ERROR_MESSAGE);
        }

        read();
        kosong();
    }//GEN-LAST:event_btnTambahActionPerformed

    //Menampilkan Data Pengguna ke Tabel
    private void read() {
        try {
            new UserController().index(tblData);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal : " + e.getMessage(), "Gagal menampilkan Data User", JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    //Mengedit Data Pengguna
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        //Mengambil data dari komponen
        String id = txtIdPengguna.getText();
        String nama = txtNamaPengguna.getText();
        String role = cmbPeran.getSelectedItem().toString();
        String kontak = txtNo.getText();
        
        try {
            //Mengubah data di database
            User user = new User();
            user.setId(id);
            user.setUsername(nama);
            user.setRole(role);
            user.setKontak(kontak);
            new UserController().update(user);
            
            //Pesan jika berhasil
            JOptionPane.showMessageDialog(null, "Berhasil mengubah Data Pengguna");
        } catch (Exception e) {
            //Pesan jika gagal
            JOptionPane.showMessageDialog(null, "Gagal : " + e.getMessage(), "Gagal mengubah Data Pengguna", JOptionPane.ERROR_MESSAGE);
        }

        read();
        kosong();
    }//GEN-LAST:event_btnEditActionPerformed

    //Menghapus Data Pengguna
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        //Mengambil data dari komponen
        String id = txtIdPengguna.getText();
        
        try {
            //Mengubah data dari database
            new UserController().destroy(id);
            
            //Pesan jika berhasil
            JOptionPane.showMessageDialog(null, "Berhasil menghapus Data Pengguna");
        } catch (Exception e) {
            //Pesan jika gagal
            JOptionPane.showMessageDialog(null, "Gagal : " + e.getMessage(), "Gagal menghapus Data Pengguna", JOptionPane.ERROR_MESSAGE);
        }
        
        read();
        kosong();
    }//GEN-LAST:event_btnHapusActionPerformed

    //Mengosongkan Komponen Form
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        read();
        kosong();
    }//GEN-LAST:event_btnBatalActionPerformed

    // Menampilkan Data ke Komponen Form
    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int baris = tblData.rowAtPoint(evt.getPoint());
        String Id_Pengguna =tblData.getValueAt(baris, 1).toString();
        txtIdPengguna.setText(Id_Pengguna);
        
        String Nama_Pengguna = tblData.getValueAt(baris,2).toString();
        txtNamaPengguna.setText(Nama_Pengguna);
        
        String Peran = tblData.getValueAt(baris, 3).toString();
        cmbPeran.setSelectedItem(Peran);
        
        Object No_Telepon=tblData.getValueAt(baris, 4);
        if(No_Telepon == null) {
            txtNo.setText("");
        } else {
            txtNo.setText(No_Telepon.toString());
        }
    }//GEN-LAST:event_tblDataMouseClicked
    
    //Fungsi mengosongkan Komponen Form
    private void kosong(){
        txtIdPengguna.setText(null);
        txtNamaPengguna.setText(null);
        cmbPeran.setSelectedItem(null);
        txtNo.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbPeran;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblPengguna;
    private javax.swing.JLabel lblPeran;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtIdPengguna;
    private javax.swing.JTextField txtNamaPengguna;
    private javax.swing.JTextField txtNo;
    // End of variables declaration//GEN-END:variables
}
