package com.hambatanresistor;

public abstract class Paralel {
    public static double  toParalel(double R1, double R2, double R3){
        return 1/R1+1/R2+1/R3;
    }

}