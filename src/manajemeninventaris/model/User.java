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
public class User extends Model<User> {
    //Pendeklarasian properti untuk menyimpan nilai dari tabel User
    private String id;
    private String username;
    private String password;
    private String role;
    private String kontak;
    private String tanggal;
    
    // Konstruktor Kosong 
    public User () {}
    
    // Konstruktor dengan Parameter (Overloading)
    public User(String id, String username, String password, String role, String kontak, String tanggal) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.kontak = kontak;
        this.tanggal = tanggal;
    }

    // Getter dan Setter untuk ID User
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter dan Setter untuk Username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter dan Setter untuk Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter dan Setter untuk Role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Getter dan Setter untuk kontak
    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
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
        return "user"; // Nama tabel user di database
    }
    
    @Override //Implementasi Overriding
    protected User mapResultSet(ResultSet rs) throws SQLException {
        // Menyimpn Data Dari Tabel User
        return new User (
            rs.getString("Id_user"),
            rs.getString("Username"),
            rs.getString("Password"),
            rs.getString("Role"),
            rs.getString("Contact_Info"),
            rs.getString("Created_At")
        );
    }
    
    @Override //Implementasi Overriding
    public void insert() throws SQLException {
        // Menyimpan Data Baru
        String query = "INSERT INTO user VALUES (?,?,?,?,?, now())";
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, this.id);
            stmt.setString(2, this.username);
            stmt.setString(3, this.password);
            stmt.setString(4, this.role);
            stmt.setString(5, this.kontak);
            stmt.executeUpdate();
        }
    }
    
    @Override //Implementasi Overriding
    public void update() throws SQLException {
        // Mengubah data yang sudah ada
        String query = "UPDATE user SET Id_user = ?, Username = ?, Role = ?, Contact_Info= ? WHERE Id_user = ?";
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, this.id);
            stmt.setString(2, this.username);
            stmt.setString(3, this.role);
            stmt.setString(4, this.kontak);
            stmt.setString(5, this.id);
            stmt.executeUpdate();
        }
    }
}
