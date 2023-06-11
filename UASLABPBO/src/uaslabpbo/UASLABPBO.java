/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uaslabpbo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UASLABPBO {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Kasir kasir = new Kasir();
        Admin admin = new Admin(kasir);
        
        System.out.println("Selamat datang di manajemen Rumah Makan Nusantara");
        System.out.print("Apakah anda admin(1) atau kasir(2) ? ");
        Scanner scanner = new Scanner(System.in);
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        
        // Menambahkan beberapa produk
        kasir.tambahProduk(new Makanan("Nasi Goreng", 15000, "Makanan Berat"));
        kasir.tambahProduk(new Makanan("Bakso", 10000, "Makanan Sedang"));
        kasir.tambahProduk(new Makanan("Chiki", 20000, "Makanan Ringan"));
        kasir.tambahProduk(new Minuman("Teh Manis Jumbo", 15000, "Besar"));
        kasir.tambahProduk(new Minuman("Es Teh", 5000, "Sedang"));
        kasir.tambahProduk(new Minuman("Air Mineral", 3000, "Kecil"));
        
        switch (pilihan) {
            case 1:
                if (admin.adminLogin()) {
                    admin.jalankan();
                } else {
                    System.out.println("Login admin gagal.");
                }   
                break;
            case 2:
                kasir.jalankan();
                break;
            default:
                System.out.println("Kode yang anda masukkan tidak valid");
                break;
        }

    }
    
}
