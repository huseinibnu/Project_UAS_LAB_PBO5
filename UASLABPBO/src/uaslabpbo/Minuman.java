/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaslabpbo;

/**
 *
 * @author ASUS
 */

public class Minuman extends Produk 
{
    private String ukuran;

    public Minuman(String nama, int harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String toString() {
        return super.toString() + " (" + ukuran + ")";
    }
}
