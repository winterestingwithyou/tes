/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemeninventaris;

/**
 *
 * @author Acer
 */
public class Session {
    private static Session instance;
    private String iduser;
    private String username;
    private String role;
    private String contact;
    private String created_at;

    private Session() { }

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public String getID() {
        return iduser;
    }

    public void setID(String iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        if(contact == null){
            this.contact = "Tidak Ada";
        } else {
            this.contact = contact;
        }
    }

    public String getCreated() {
        return created_at;
    }

    public void setCreated(String created_at) {
        this.created_at = created_at;
    }

    public void clear() {
        iduser = null;
        username = null;
        role = null;
        contact = null;
        created_at = null;
    }
}
