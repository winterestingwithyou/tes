/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemeninventaris.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import manajemeninventaris.config;

/**
 *
 * @author Acer
 * @param <T>
 */
public abstract class Model<T> {
    protected abstract String getTableName(); // Nama tabel
    protected abstract T mapResultSet(ResultSet rs) throws SQLException; // Map hasil query ke objek

    // Mendapatkan Semua Kolom dan Baris
    public List<T> all() throws SQLException {
        List<T> results = new ArrayList<>();
        try (Connection conn=(Connection)config.configDB()) {
            String query = "SELECT * FROM " + getTableName();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                results.add(mapResultSet(rs));
            }
        }
        return results;
    }

    // Mendaoatkan baris berdasarkan ID
    public T find(String id) throws SQLException {
        try (Connection conn=(Connection)config.configDB()){
            String query = "SELECT * FROM " + getTableName() + " WHERE " + getPrimaryKey() + " = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return mapResultSet(rs);
                }
            }
        }
        return null;
    }

    // Menghapus baris berdasarkan ID
    public void delete(String id) throws SQLException {
        String query = "DELETE FROM " + getTableName() + " WHERE " + getPrimaryKey() + " = ?";
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
        }
    }
    
    // Hapus data berdasarkan field tertentu
    public void deleteByField(String fieldName, Object value) throws SQLException {
        String query = "DELETE FROM " + getTableName() + " WHERE " + fieldName + " = ?";
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setObject(1, value); // Parameter dinamis
            stmt.executeUpdate();
        }
    }
    
    // Mencari data berdasarkan lebih dari satu kondisi (field dan nilai)
    public List<T> findByConditions(Map<String, Object> conditions) throws SQLException {
        StringBuilder query = new StringBuilder("SELECT * FROM " + getTableName() + " WHERE ");

        // Membangun klausa WHERE berdasarkan kondisi yang diberikan
        boolean first = true;
        for (String field : conditions.keySet()) {
            if (!first) {
                query.append(" AND ");
            }
            query.append(field).append(" = ?");
            first = false;
        }

        // Menyiapkan query dan parameter
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query.toString())) {

            // Mengatur nilai parameter berdasarkan kondisi
            int index = 1;
            for (Object value : conditions.values()) {
                stmt.setObject(index++, value);
            }

            // Eksekusi query dan ambil hasil
            try (ResultSet rs = stmt.executeQuery()) {
                List<T> results = new ArrayList<>();
                while (rs.next()) {
                    T obj = mapResultSet(rs); // Pemetaan data ke objek
                    results.add(obj);
                }
                return results;
            }
        }
    }
    
    // Method abstract untuk Insert
    public abstract void insert() throws SQLException;
    
    // Method abstract untuk Update
    public abstract void update() throws SQLException;
    
    // Method untuk mengecek ID pada tabel
    protected boolean isIdExists(String id) throws SQLException {
        String query = "SELECT COUNT(*) FROM "+ getTableName() +" WHERE id = ?";
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }
    
    // Method untuk mendapatkan nama dari Primary Key
    protected String getPrimaryKey() throws SQLException {
        String Primary = "";
        String query = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE WHERE TABLE_NAME = '" + getTableName() + "' AND CONSTRAINT_NAME = 'PRIMARY' AND TABLE_SCHEMA = 'si_inventaris'";
        try (Connection conn=(Connection)config.configDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Primary = rs.getString("COLUMN_NAME");
                }
            }
        }
        return Primary;
    }
}
