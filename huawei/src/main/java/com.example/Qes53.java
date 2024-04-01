package com.example;

import java.util.Scanner;

public class Qes53 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int num = in.nextInt();
            if(num<3){
                System.out.println(-1);
            }else{
                if(num%4==1||num%4==3){
                    System.out.println(2);
                }
                if(num%4==0){
                    System.out.println(3);
                }
                if(num%4==2){
                    System.out.println(4);
                }
            }
        }
    }
}
