package com.rplbo.utsnota;

public class Kalkulator {
    private int bil2;
    private int bil1;
    private String op;
    private int pilihan;
    private int hasil ;

    public Kalkulator(BilanganString b1, BilanganString b2, Operator op) {
        String kata1 = "DuA BelaS";
        String kata2 = "tiga BELAS";
        String opnya = "TaMbah";
        BilanganString one = new BilanganString(kata1);
        BilanganString two = new BilanganString(kata2);
        Operator oog = new Operator(opnya);
        this.bil1 = one.getBilangan();
        this.bil2 = two.getBilangan();
        this.op = oog.getOperatorSimbol();
    }

    public void hitung() {
        if (op == "*") {
            this.hasil = bil1 * bil2;
            System.out.println("Hasil" + hasil + ".0");
        }
        if (op == "+") {
            this.hasil = bil1 + bil2;
            System.out.println("Hasil" + hasil + ".0");
        }
        if (op == "/") {
            this.hasil = bil1 / bil2;
            System.out.println("Hasil" + hasil + ".0");
        }
        if (op == "-") {
            this.hasil = bil1 - bil2;
            System.out.println("Hasil" + hasil + ".0");
        }
        if (op == "^") {
            this.hasil = (int) Math.pow(bil1, bil2);
            System.out.println("Hasil" + hasil + ".0");
        }
        System.out.println("Hasil: " + hasil + ".0");
    }
}
