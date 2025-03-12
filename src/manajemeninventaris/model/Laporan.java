/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemeninventaris.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import manajemeninventaris.config;

/**
 *
 * @author Acer
 */
public class Laporan extends Model<Laporan> {
    //Pendeklarasian properti untuk menyimpan nilai dari tabel User
    private String id;
    private String tipe;
    private String tanggal;
    private String idUser;
    private String file;
    private String catatan;
    
    // Konstruktor Kosong 
    public Laporan () {}
    
    // Konstruktor dengan Parameter (Overloading)
    public Laporan(String id, String tipe, String tanggal, String idUser, String file, String catatan) {
        this.id = id;
        this.tipe = tipe;
        this.tanggal = tanggal;
        this.idUser = idUser;
        this.file = file;
        this.catatan = catatan;
    }

    // Getter dan Setter untuk ID Laporan
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter dan Setter untuk Tipe
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    // Getter dan Setter untuk Tanggal
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    // Getter dan Setter untuk ID User
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    // Getter dan Setter untuk File
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    // Getter dan Setter untuk Catatan
    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
    
    @Override //Implementasi Overriding
    protected String getTableName() {
        return "laporan"; // Nama tabel laporan di database
    }
    
    @Override //Implementasi Overriding
    protected Laporan mapResultSet(ResultSet rs) throws SQLException {
        // Menyimpn Data Dari Tabel Laporan
        return new Laporan (
            rs.getString("Id_laporan"),
            rs.getString("Tipe_laporan"),
            rs.getString("Generated_at"),
            rs.getString("Id_user"),
            rs.getString("Report_file"),
            rs.getString("Remarks")
        );
    }
    
    @Override //Implementasi Overriding
    public void insert() throws SQLException {
        // Menyimpan Data Baru
        String query = "INSERT INTO laporan VALUES (?,?, now(),?,?,?)";
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, this.id);
            stmt.setString(2, this.tipe);
            stmt.setString(3, this.idUser);
            stmt.setString(4, this.file);
            stmt.setString(5, this.catatan);
            stmt.executeUpdate();
        }
    }
    
    @Override //Implementasi Overriding
    public void update() throws SQLException {
        //Tidak dapat melakukan Update
    }
}
