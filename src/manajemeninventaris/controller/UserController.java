/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemeninventaris.controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manajemeninventaris.model.*;

/**
 *
 * @author Acer
 */
public class UserController extends Controller<User> {
    @Override //implementasi Overriding
    public void index(JComponent component) throws SQLException {
        int no=1;
        User user = new User();
        List<User> users = user.all();

        if (component instanceof JTable) {
            //menampilkan data database kedalam tabel
            JTable table = (JTable) component;
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(new String[]{"No", "Id Pengguna", "Nama Pengguna", "Peran", "No.Telepon", "Tanggal Dibuat"});

            for (User u : users) {
                tableModel.addRow(new Object[]{no++, u.getId(), u.getUsername(), u.getRole(), u.getKontak(), u.getTanggal()});
            }
            table.setModel(tableModel);
        } else {
            throw new IllegalArgumentException("Unsupported component type: " + component.getClass().getSimpleName());
        }
    }
    
    @Override //implementasi Overriding
    public User show(String id) throws SQLException{
        return new User().find(id);
    }
    
    @Override //implementasi Overriding
    public void store(User obj) throws SQLException{
        obj.insert();
    }
    
    @Override //implementasi Overriding
    public void update(User obj) throws SQLException{
        obj.update();
    }
    
    @Override //implementasi Overriding
    public void destroy(String id) throws SQLException{
        //Menghapus Transaksi yang dibuat User
        new Transaksi().deleteByField("Id_user", id);
        
        //Menghapus Laporan yang dibuat User
        new Laporan().deleteByField("Id_user", id);
        
        //Menghapus Data User
        new User().delete(id);
    }
}
