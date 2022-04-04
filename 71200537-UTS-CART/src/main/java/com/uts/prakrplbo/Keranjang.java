package com.uts.prakrplbo;

import java.util.List;

public class Keranjang {
    private List<Buah> daftarbuah;
    private int mangganya=0;
    private int apelnya=0;
    private int hargamangga =2000;
    private int hargaapel = 3000;

    public void tambahProduk(Mangga buah){
        mangganya += 1;
        System.out.println("Mangga berhasil ditambahkan ke dalam keranjang!\n");

    }
    public void tambahProduk(Apel buahh){
        apelnya +=1;
        System.out.println("Apel berhasil ditambahkan ke dalam keranjang!\n");
    }
    public void hapusProduk(Mangga buah){
        mangganya -= 1;
        System.out.println("Mangga berhasil dikeluarkan dari dalam keranjang!\n");
    }
    public void hapusProduk(Apel buah){
        apelnya -=1;
        System.out.println("Apel berhasil dikeluarkan dari dalam keranjang!\n");

    }
    public void getKeranjang(){
        int hasilmangga = mangganya*hargamangga;
        int hasilapel = apelnya*hargaapel;
        int hasilsmua = hasilmangga+hasilapel;
        System.out.println("Mangga [Rp."+hargamangga+"] x"+mangganya);
        System.out.println("Mangga [Rp."+hargaapel+"] x"+apelnya);
        System.out.println("Total : Rp."+hasilsmua+",00");
    }
}
