/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaslabpbo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Admin {
    private String nama, jenis;
    private int harga;
    public Kasir kasir;

    public Admin(Kasir kasir) {
        this.kasir = kasir;
    }

    public void tambahMakanan(String nama, int harga, String jenis) {
        Makanan makanan = new Makanan(nama, harga, jenis);
        kasir.tambahProduk(makanan);
        System.out.println("Makanan " + makanan.getNama() + " berhasil ditambahkan.");
    }

    public void tambahMinuman(String nama, int harga, String jenis) {
        Minuman minuman = new Minuman(nama, harga, jenis);
        kasir.tambahProduk(minuman);
        System.out.println("Minuman " + minuman.getNama() + " berhasil ditambahkan.");
    }
    
    public boolean adminLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan password admin: ");
        String password = scanner.nextLine();

        // Cek password admin
        // Contoh sederhana: Password adalah "admin123"
        return password.equals("admin123");
    }
    
    public void jalankan() {
        Scanner scanner = new Scanner(System.in);
        boolean selesai = false;

        while (!selesai) {
            System.out.println();
            System.out.println("Selamat datang di halaman admin!");
            System.out.println("Pilih opsi:");
            System.out.println("1. Tambah makanan ke daftar produk");
            System.out.println("2. Tambah minuman ke daftar produk");
            System.out.println("3. Masuk ke halaman kasir");
            System.out.print("Pilihan anda : ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan \n dari buffer
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama makanan: ");
                    nama = scanner.nextLine();
                    System.out.print("Masukkan harga makanan: ");
                    harga = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan \n dari buffer
                    System.out.print("Masukkan jenis makanan: ");
                    jenis = scanner.nextLine();
                    tambahMakanan(nama, harga, jenis);
                    break;
                case 2:
                    System.out.print("Masukkan nama minuman: ");
                    nama = scanner.nextLine();
                    System.out.print("Masukkan harga minuman: ");
                    harga = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan \n dari buffer
                    System.out.print("Masukkan ukuran minuman: ");
                    jenis = scanner.nextLine();
                    tambahMinuman(nama, harga, jenis);
                    break;
                case 3:
                    selesai = true;
                    kasir.jalankan();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

