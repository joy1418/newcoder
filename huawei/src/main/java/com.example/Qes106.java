package com.example;

import java.util.Scanner;

public class Qes106 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            if(str.contains(" ")){
                String[] arr = str.split(" ");
                for(int i=arr.length-1;i>=0;i--){
                    String s = arr[i];
                    out(s);
                    System.out.print(" ");
                }
            }else{
                out(str);
            }
        }
    }
    public static void out(String str){
        char[] charr = str.toCharArray();
        for(int i=charr.length-1;i>=0;i--){
            System.out.print(charr[i]);
        }
    }

}
