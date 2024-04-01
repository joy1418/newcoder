package com.example;

import java.util.Scanner;

public class Qes99 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int count=0;
            for(int i=0;i<=a;i++){
                String s = String.valueOf(i);
                int len = s.length();
                String ss = String.valueOf(i*i);
                if(ss.substring(ss.length()-len,ss.length()).equals(s)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
