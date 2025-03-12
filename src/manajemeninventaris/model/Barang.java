/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemeninventaris.model;

import java.sql.*;
import manajemeninventaris.config;

/**
 *
 * @author Acer
 */
public class Barang extends Model<Barang> {
    //Pendeklarasian properti untuk menyimpan nilai dari tabel barang
    private String id;
    private String nama;
    private String sku;
    private String kategori;
    private int harga;
    private int stok;
    
    // Konstruktor Kosong 
    public Barang() {}
    
    // Konstruktor dengan Parameter (Overloading)
    public Barang(String id, String nama, String sku, String kategori, int harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.sku = sku;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }
    
    // Getter dan Setter untuk ID Barang
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    // Getter dan Setter untuk Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Getter dan Setter untuk SKU
    public String getSKU() {
        return sku;
    }

    public void setSKU(String sku) {
        this.sku = sku;
    }
    
    // Getter dan Setter untuk Kategori
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    // Getter dan Setter untuk Harga
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    // Getter dan Setter untuk Stok
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    @Override //Implementasi Overriding
    protected String getTableName() {
        return "barang"; // Nama tabel barang di database
    }
    
    @Override //Implementasi Overriding
    protected Barang mapResultSet(ResultSet rs) throws SQLException {
        // Menyimpn Data Dari Tabel Barang
        return new Barang (
            rs.getString("Id_barang"),
            rs.getString("Nama_barang"),
            rs.getString("Sku"),
            rs.getString("Kategori"),
            rs.getInt("Harga"),
            rs.getInt("Jml_stok")
        );
    }
    
    @Override //Implementasi Overriding
    public void insert() throws SQLException {
        // Menyimpan Data Baru
        String query = "INSERT INTO barang VALUES (?,?,?,?,?,?)";
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, this.id);
            stmt.setString(2, this.nama);
            stmt.setString(3, this.sku);
            stmt.setString(4, this.kategori);
            stmt.setInt(5, this.harga);
            stmt.setInt(6, this.stok);
            stmt.executeUpdate();
        }
    }
    
    @Override //Implementasi Overriding
    public void update() throws SQLException {
        // Mengubah data yang sudah ada
        String query = "UPDATE barang SET Id_barang = ?, Nama_barang = ?, Sku = ?,Kategori= ?,Harga= ?,Jml_stok = ? WHERE Id_barang = ?";
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, this.id);
            stmt.setString(2, this.nama);
            stmt.setString(3, this.sku);
            stmt.setString(4, this.kategori);
            stmt.setInt(5, this.harga);
            stmt.setInt(6, this.stok);
            stmt.setString(7, this.id);
            stmt.executeUpdate();
        }
    }   
}
