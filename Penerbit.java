package com.mycompany.utspbo;

public class Penerbit {
    int id;
    String namaPenerbit;
    String alamatPenerbit;

    public void index() {
        System.out.println("SELECT * FROM penerbit");
    }

    public void create() {
    }

    public void store() {
        System.out.println("INSERT INTO penerbit (namaPenerbit, alamatPenerbit) VALUES ('" + namaPenerbit + "', '" + alamatPenerbit + "')");
    }

    public void edit() {
    }

    public void update() {
        System.out.println("UPDATE penerbit SET namaPenerbit='" + namaPenerbit + "', alamatPenerbit='" + alamatPenerbit + "' WHERE id=" + id);
    }

    public void destroy() {
        System.out.println("DELETE FROM penerbit WHERE id=" + id);
    }
}
