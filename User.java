package com.mycompany.utspbo;
public class User {
    int id;
    String email;
    String password;

    public void index() {
        System.out.println("SELECT * FROM user");
    }

    public void create() {
    }

    public void store() {
        System.out.println("INSERT INTO user (email, password) VALUES ('" + email + "', '" + password + "')");
    }

    public void edit() {
    }

    public void update() {
        System.out.println("UPDATE user SET email='" + email + "', password='" + password + "' WHERE id=" + id);
    }

    public void destroy() {
        System.out.println("DELETE FROM user WHERE id=" + id);
    }
}