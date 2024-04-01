package com.example;

import java.util.Scanner;

public class Qes71 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str1 = in.nextLine().toLowerCase();
            String str2 = in.nextLine().toLowerCase();
            String regx = str1.replaceAll("\\*{2,}","\\*");
            regx = regx.replaceAll("\\?","[0-9a-z]{1}");
            regx = regx.replaceAll("\\*","[0-9a-z]{0,}");
            System.out.println(str2.matches(regx));
        }
    }
}
