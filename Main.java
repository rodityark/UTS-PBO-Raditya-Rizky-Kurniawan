package com.mycompany.utspbo;
public class Main {
    public static void main(String[] args) {
        User u = new User();
        u.id = 1;
        u.email = "raditya.rkz@gmail.com";
        u.password = "12345";
        u.index();
        u.store();
        u.update();
        u.destroy();

        System.out.println();

        Penerbit p = new Penerbit();
        p.id = 10;
        p.namaPenerbit = "Gramedia";
        p.alamatPenerbit = "Jl.Perambaian III";
        p.index();
        p.store();
        p.update();
        p.destroy();

        System.out.println();

        Buku b = new Buku();
        b.id = 100;
        b.judul = "Pemrograman Java";
        b.penulis = "Raditya Rizky Kurniawan";
        b.tahun = 2024;
        b.penerbit = p;
        b.index();
        b.store();
        b.update();
        b.destroy();
    }
}
