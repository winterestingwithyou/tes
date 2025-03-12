/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemeninventaris.controller;
import java.sql.SQLException;
import javax.swing.JComponent;
import java.util.List;

/**
 *
 * @author Acer
 * @param <T>
 */
public abstract class Controller<T> {
    // Mendapatkan semua data
    protected abstract void index(JComponent component) throws SQLException;

    // Mendapatkan data berdasarkan ID
    protected abstract T show(String id) throws SQLException;

    // Menyimpan data baru
    protected abstract void store(T obj) throws SQLException;

    // Memperbarui data yang ada
    protected abstract void update(T obj) throws SQLException;

    // Menghapus data berdasarkan ID
    protected abstract void destroy(String id) throws SQLException;
}