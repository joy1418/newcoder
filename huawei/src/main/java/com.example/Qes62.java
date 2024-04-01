package com.example;

import java.util.Scanner;

public class Qes62 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            int num = Integer.parseInt(str);
            String numstr = Integer.toBinaryString(num);
            char[] arr = numstr.toCharArray();
            int sum = 0;
            for(char c:arr){
                if(c=='1'){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
