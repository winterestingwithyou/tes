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
public class Transaksi extends Model<Transaksi> {
    //Pendeklarasian properti untuk menyimpan nilai dari tabel Transaksi
    private String id;
    private String idBarang;
    private String idUser;
    private String tipe;
    private int jumlah;
    private String tanggal;
    
    // Konstruktor Kosong 
    public Transaksi () {}
    
    // Konstruktor dengan Parameter (Overloading)
    public Transaksi (String id, String idBarang, String idUser, String tipe, int jumlah, String tanggal) {
        this.id = id;
        this.idBarang = idBarang;
        this.idUser = idUser;
        this.tipe = tipe;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }
    
    // Getter dan Setter untuk ID Transaksi
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter dan Setter untuk ID Barang
    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    // Getter dan Setter untuk ID User
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    // Getter dan Setter untuk Tipe
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    // Getter dan Setter untuk Jumlah
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Getter dan Setter untuk Tanggal
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    @Override //Implementasi Overriding
    protected String getTableName() {
        return "transaksi"; // Nama tabel transaksi di database
    }
    
    @Override //Implementasi Overriding
    protected Transaksi mapResultSet(ResultSet rs) throws SQLException {
        // Menyimpn Data Dari Tabel Transaksi
        return new Transaksi (
            rs.getString("Id_transaksi"),
            rs.getString("Id_barang"),
            rs.getString("Id_user"),
            rs.getString("Tipe_transaksi"),
            rs.getInt("quantity"),
            rs.getString("Tanggal")
        );
    }
    
    @Override //Implementasi Overriding
    public void insert() throws SQLException {
        // Menyimpan Data Baru
        String query = "INSERT INTO "+ getTableName() +" VALUES (?,?,?,?,?, now())";
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, this.id);
            stmt.setString(2, this.idBarang);
            stmt.setString(3, this.idUser);
            stmt.setString(4, this.tipe);
            stmt.setInt(5, this.jumlah);
            stmt.executeUpdate();
        }
    }
    
    @Override //Implementasi Overriding
    public void update() throws SQLException {
        // Mengubah data yang sudah ada
        String query = "UPDATE "+ getTableName() +" SET id_transaksi = ?, Id_barang = ?, Id_user = ?, Tipe_transaksi= ?, quantity= ? WHERE Id_transaksi = ?";
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, this.id);
            stmt.setString(2, this.idBarang);
            stmt.setString(3, this.idUser);
            stmt.setString(4, this.tipe);
            stmt.setInt(5, this.jumlah);
            stmt.setString(6, this.id);
            stmt.executeUpdate();
        }
    }
}
