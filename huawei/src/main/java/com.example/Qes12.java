package com.example;

import java.util.Scanner;

public class Qes12 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            for(int i=str.length()-1;i>=0;i--){
                System.out.print(str.charAt(i));
            }
        }
    }

}
