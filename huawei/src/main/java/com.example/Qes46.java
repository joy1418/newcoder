package com.example;

import java.util.Scanner;

public class Qes46 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String num = in.nextLine();
            System.out.println(str.substring(0,Integer.parseInt(num)));
        }
    }
}
