package com.rplbo.utsnota;

public class Operator{
    private String operatorString;
    private String operatorSimbol;

    public Operator(String operatornya){
        this.operatorString = operatornya;
        if (operatornya.equalsIgnoreCase("kali")){
            this.operatorString = "*";
            this.operatorSimbol = operatornya;
        }
        if (operatornya.equalsIgnoreCase("tambah")){
            this.operatorString = "+";
            this.operatorSimbol = operatornya;
        }
        if (operatornya.equalsIgnoreCase("bagi")){
            this.operatorString = "/";
            this.operatorSimbol = operatornya;
        }
        if (operatornya.equalsIgnoreCase("kurang")){
            this.operatorString = "-";
            this.operatorSimbol = operatornya;
        }
        if (operatornya.equalsIgnoreCase("Pangkat")){
            this.operatorString = "^";
            this.operatorSimbol = operatornya;
        }
    }

    public String getOperatorSimbol() {
        return operatorSimbol;
    }
}
