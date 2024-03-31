package com.example;

import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()){
            double num = in.nextDouble();
            System.out.println(Math.round(num));
        }
    }
}
