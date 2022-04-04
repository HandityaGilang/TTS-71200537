package com.rplbo.utsnota;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String bilangannya ){
        this.bilanganstring = bilangannya;
        if (this.bilanganstring.equalsIgnoreCase("satu") == Boolean.parseBoolean("satu")){
            this.bilanganstring = "1";
            int konversi = Integer.valueOf(this.bilanganstring);
            this.bilangan = konversi;}
        if (this.bilanganstring.equalsIgnoreCase("dua") == Boolean.parseBoolean("dua")){
            this.bilanganstring = "2";
            int konversi = Integer.valueOf(this.bilanganstring);
            this.bilangan = konversi;}
        if (this.bilanganstring.equalsIgnoreCase("tiga") == Boolean.parseBoolean("tiga")){
            this.bilanganstring = "3";
            int konversi = Integer.valueOf(this.bilanganstring);
            this.bilangan = konversi;}
        if (this.bilanganstring.equalsIgnoreCase("DuA BelaS") == Boolean.parseBoolean("dua belas")){
            this.bilanganstring = "12";
            int konversi = Integer.valueOf(this.bilanganstring);
            this.bilangan = konversi;}
        if (this.bilanganstring.equalsIgnoreCase("tiga belas") == Boolean.parseBoolean("tiga belas")){
            this.bilanganstring = "13";
            int konversi = Integer.valueOf(this.bilanganstring);
            this.bilangan = konversi;}
    }

    public int getBilangan() {
        return bilangan;
    }

    public boolean apakahDuaDigit(){
        int x = this.bilangan;
        if ((x > 9 && x < 100) || (x < -9 && x > -100)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean apakahLebihDari10(){
        int x = this.bilangan;
        if (x > 10){
            return true;
        } else {
            return false;
        }
    }
}


