package com.example;

import java.util.Scanner;

public class Qes60 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int num = in.nextInt();
            int a = num/2;
            int b = num/2;
            while(!isSu(a)||!isSu(b)){
                a--;
                b++;
            }
            System.out.println(a);
            System.out.println(b);
        }
    }

    public static boolean isSu(int num){
        boolean flag = true;
        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0&&i!=1&&i!=num){
                    flag=false;
                }
            }
        }
        return flag;
    }
}
