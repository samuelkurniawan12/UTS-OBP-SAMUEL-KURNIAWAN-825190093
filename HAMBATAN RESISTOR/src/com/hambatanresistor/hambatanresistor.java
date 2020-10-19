package com.hambatanresistor;

import java.util.Scanner;

public class hambatanresistor {
    public static void main(String[] args) {
        double R1, R2, R3;
        int jenis;

        Scanner input = new Scanner(System.in);

        System.out.println(" HAMBATAN RESISTOR ");
        System.out.println("1. SERI");
        System.out.println("2. PARALEL");
        System.out.print("Pilihan = ");
        jenis = input.nextInt();
        System.out.print("R1 = ");
        R1 = input.nextDouble();
        System.out.print("R2 = ");
        R2 = input.nextDouble();
        System.out.print("R3 = ");
        R3 = input.nextDouble();

        switch (jenis) {
            case 1:

                System.out.println("Seri = " + Seri.toSeri(R1, R2, R3));

                break;
            case 2:

                System.out.println("Paralel = " + 1 / Paralel.toParalel(R1, R2, R3));

                break;
            default:
                System.out.println("Masukkan Jenis Dengan Benar [1/2] : ");
        }
    }
}