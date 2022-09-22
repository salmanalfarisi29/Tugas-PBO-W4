/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus1w4;

/**
 *
 * @author Salman Alfarisi
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public int getstok() {
        return stok;
    }
    
    public void setstok(int stok) {
        this.stok += stok;
    }
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}
