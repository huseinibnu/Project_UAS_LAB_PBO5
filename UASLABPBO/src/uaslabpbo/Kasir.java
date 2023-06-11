/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaslabpbo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Kasir {
    public ArrayList<Produk> daftarProduk, keranjang;
    int totalItem;
    
    public Kasir() {
        daftarProduk = new ArrayList<>();
        keranjang = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public void tampilkanDaftarProduk() {
        System.out.println("Daftar Produk:");
        for (int i = 0; i < daftarProduk.size(); i++) {
            System.out.println((i+1) + ". " + daftarProduk.get(i));
        }
    }

    public void tambahProdukKeKeranjang(int nomorProduk) {
        if (nomorProduk >= 1 && nomorProduk <= daftarProduk.size()) {
            Produk produk = daftarProduk.get(nomorProduk - 1);
            keranjang.add(produk);
            System.out.println("Anda telah menambahkan " + produk.getNama() + " ke keranjang.");
        } else {
            System.out.println("Nomor produk tidak valid.");
        }
    }
    
    public void hapusProdukKeranjang(int nomorProduk) {
        if (nomorProduk >= 0 && nomorProduk < daftarProduk.size()) {
            Produk produk = daftarProduk.get(nomorProduk);
            keranjang.remove(produk);
            System.out.println("Produk " + produk.getNama() + " berhasil dihapus dari daftar keranjang anda.");
        } else {
            System.out.println("Nomor produk tidak valid.");
        }
    }

    public void tampilkanKeranjang() {
        System.out.println("Isi Keranjang:");
        if (keranjang.isEmpty()) {
            System.out.println("Keranjang kosong.");
        } else {
            for (int i = 0; i < keranjang.size(); i++) {
                System.out.println((i+1) + ". " + keranjang.get(i));
            }
        }
    }

    public int hitungTotalBelanja() {
        int total = 0;
        for (Produk produk : keranjang) {
            total += produk.getHarga();
        }
        return total;
    }

    public void jalankan() {
        Scanner scanner = new Scanner(System.in);
        boolean selesai = false;

        while (!selesai) {
            System.out.println();
            System.out.println("Selamat datang di halaman kasir!");
            System.out.println("Pilih opsi:");
            System.out.println("1. Tampilkan daftar produk");
            System.out.println("2. Tambah produk ke keranjang");
            System.out.println("3. Tampilkan isi keranjang");
            System.out.println("4. Menghapus isi belanjaan");
            System.out.println("5. Hitung total belanja");
            System.out.println("6. Keluar");
            System.out.print("Pilihan anda : ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan \n dari buffer
            System.out.println();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarProduk();
                    break;
                case 2:
                    System.out.print("Berapa barang yang ingin anda pesan : ");
                    totalItem = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan \n dari buffer
                    for (int i = 1; i <= totalItem; i++){
                        System.out.print("Masukkan nomor produk: ");
                        int nomorProduk = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan \n dari buffer
                        tambahProdukKeKeranjang(nomorProduk);
                    }
                    break;
                case 3:
                    tampilkanKeranjang();
                    break;
                case 4:
                    tampilkanKeranjang();
                    System.out.print("Berapa barang yang ingin anda hapus : ");
                    totalItem = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan \n dari buffer
                    for (int i = 1; i <= totalItem; i++){
                        System.out.print("Masukkan nomor produk: ");
                        int nomorProduk = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan \n dari buffer
                        hapusProdukKeranjang(nomorProduk);
                    }
                case 5:
                    int totalBelanja = hitungTotalBelanja();
                    tampilkanKeranjang();
                    System.out.println("Total belanja: Rp" + totalBelanja);
                    break;
                case 6:
                    selesai = true;
                    System.out.println("Terima kasih telah menggunakan kasir.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
