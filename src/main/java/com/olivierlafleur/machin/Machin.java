package com.olivierlafleur.machin;

public class Machin {
    public static void main(String[] args) {
        Machin machin = new Machin();

        machin.truc();
    }

    public void truc() {
        Truc truc = new Truc(4);

        System.out.println(truc.gne());

        Truc.bonjour();
    }

    public int yoyo() {
        return 3;
    }
}
