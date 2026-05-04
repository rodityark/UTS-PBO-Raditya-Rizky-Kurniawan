package com.mycompany.utspbo;

public class Buku {
    int id;
    String judul;
    String penulis;
    int tahun;
    Penerbit penerbit;

    public void index() {
        System.out.println("SELECT * FROM buku");
    }

    public void create() {
    }

    public void store() {
        System.out.println("INSERT INTO buku (judul, penulis, tahun, id_penerbit) VALUES ('" + judul + "', '" + penulis + "', " + tahun + ", " + (penerbit != null ? penerbit.id : "NULL") + ")");
    }

    public void edit() {
    }

    public void update() {
        System.out.println("UPDATE buku SET judul='" + judul + "', penulis='" + penulis + "', tahun=" + tahun + " WHERE id=" + id);
    }

    public void destroy() {
        System.out.println("DELETE FROM buku WHERE id=" + id);
    }
}