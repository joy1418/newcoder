package com.example;

import java.util.Scanner;

public class Qes15 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int num = in.nextInt();
            String str = Integer.toBinaryString(num);
            int count = 0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
