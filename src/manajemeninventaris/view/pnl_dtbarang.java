/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package manajemeninventaris.view;

import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import manajemeninventaris.config;
import manajemeninventaris.model.Barang;
import manajemeninventaris.controller.BarangController;

/**
 *
 * @author Acer
 */
public class pnl_dtbarang extends javax.swing.JPanel {
    /**
     * Creates new form pnl_dtbarang
     */
    public pnl_dtbarang() {
        initComponents();
        
        read();
        kosong();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbKategori = new javax.swing.JComboBox<>();
        txtIdBarang = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtSku = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtJumlahStok = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1114, 420));

        jPanel1.setBackground(new java.awt.Color(214, 192, 179));
        jPanel1.setPreferredSize(new java.awt.Dimension(526, 330));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("ID Barang   ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("SKU              ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Kategori         ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Harga             ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Jumlah Stok    ");

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peralatan Rmh Tangga", "Peralatan Kantor", "Perangkat Komunikasi" }));
        cmbKategori.setSelectedIndex(-1);
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });

        txtIdBarang.setPreferredSize(new java.awt.Dimension(105, 22));
        txtIdBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBarangActionPerformed(evt);
            }
        });

        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nama Barang ");

        btnTambah.setBackground(new java.awt.Color(73, 54, 40));
        btnTambah.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(73, 54, 40));
        btnEdit.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(73, 54, 40));
        btnHapus.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(73, 54, 40));
        btnBatal.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal)
                        .addGap(98, 98, 98))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHarga)
                            .addComponent(cmbKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtJumlahStok)
                            .addComponent(txtIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaBarang)
                            .addComponent(txtSku))
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJumlahStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal))
                .addGap(28, 28, 28))
        );

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.setPreferredSize(new java.awt.Dimension(531, 330));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("Form Barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1034, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jLabel1))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void load_table(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Sku");
        model.addColumn("Kategori");
        model.addColumn("Harga");
        model.addColumn("Jumlah Stok");
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "select * from barang";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            tblData.setModel(model);
        } catch (Exception e) {
        }
    }
    
    private void read(){
        try {
            new BarangController().index(tblData);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal : " + e.getMessage(), "Gagal menampilkan Barang", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    private void kosong(){
        txtIdBarang.setText(null);
        txtNamaBarang.setText(null);
        txtSku.setText(null);
        cmbKategori.setSelectedItem(null);
        txtHarga.setText(null);
        txtJumlahStok.setText(null);
    }
    
    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKategoriActionPerformed

    private void txtIdBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBarangActionPerformed

    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        //Mengambil data dari komponen
        String id = txtIdBarang.getText();
        String nama = txtNamaBarang.getText();
        String sku = txtSku.getText();
        String kategori = cmbKategori.getSelectedItem().toString();
        int harga = Integer.parseInt(txtHarga.getText());
        int stok = Integer.parseInt(txtJumlahStok.getText());
        
        try {
            //Menambah data ke database
            Barang barang = new Barang(id, nama, sku, kategori, harga, stok);
            new BarangController().store(barang);
            
            //Pesan jika berhasil
            JOptionPane.showMessageDialog(null, "Berhasil menambahkan Barang");
        } catch(Exception e) {
            //Pesan jika gagal
            JOptionPane.showMessageDialog(null, "Gagal : " + e.getMessage(), "Gagal menambahkan Barang", JOptionPane.ERROR_MESSAGE);
        }
        read();
        kosong();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void create() {
        try {
            String sql = "INSERT INTO barang VALUES ('"+txtIdBarang.getText()+"','"+txtNamaBarang.getText()+"','"+txtSku.getText()+"','"+cmbKategori.getSelectedItem()+"','"+txtHarga.getText()+"','"+txtJumlahStok.getText()+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        read();
    }
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // Edit Data
        try {
            String sql ="UPDATE barang SET Id_barang = '"+txtIdBarang.getText()+"', Nama_barang = '"+txtNamaBarang.getText()+"', Sku = '"+txtSku.getText()+"',Kategori= '"+cmbKategori.getSelectedItem()+"',Harga= '"+txtHarga.getText()+"',Jml_stok = '"+txtJumlahStok.getText()+"'WHERE Id_barang = '"+txtIdBarang.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        read();
        kosong();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            String sql ="delete from barang where Id_barang='"+txtIdBarang.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        read();
        kosong();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        kosong();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int baris = tblData.rowAtPoint(evt.getPoint());
        String Id_Barang =tblData.getValueAt(baris, 1).toString();
        txtIdBarang.setText(Id_Barang);
        String Nama_Barang = tblData.getValueAt(baris,2).toString();
        txtNamaBarang.setText(Nama_Barang);

        String Sku=tblData.getValueAt(baris, 3).toString();
        txtSku.setText(Sku);
        String Kategori = tblData.getValueAt(baris, 4).toString();
        cmbKategori.setSelectedItem(Kategori);
        String Harga=tblData.getValueAt(baris, 5).toString();
        txtHarga.setText(Harga);
        String Jumlah_Stok = tblData.getValueAt(baris, 6).toString();
        txtJumlahStok.setText(Jumlah_Stok);

    }//GEN-LAST:event_tblDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdBarang;
    private javax.swing.JTextField txtJumlahStok;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtSku;
    // End of variables declaration//GEN-END:variables
}
