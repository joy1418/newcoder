package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Qes34 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            for(char c:chars){
                System.out.print(c);
            }
        }
    }
}
