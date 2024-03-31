package com.example;

import java.util.Scanner;

public class Qes4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            int len = str.length();
            int times = len/8;
            for(int i=0;i<times;i++){
                System.out.println(str.substring(8*i,8*(i+1)));
            }
            int yu = len%8;
            String res = str.substring(8*times);
            while (yu<8){
                res+="0";
                yu++;
            }
            System.out.println(res);
        }
    }
}
