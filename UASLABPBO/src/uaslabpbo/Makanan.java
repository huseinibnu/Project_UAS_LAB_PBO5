/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaslabpbo;

/**
 *
 * @author ASUS
 */
public class Makanan extends Produk {
    private String jenis;

    public Makanan(String nama, int harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public String toString() {
        return super.toString() + " (" + jenis + ")";
    }
}
