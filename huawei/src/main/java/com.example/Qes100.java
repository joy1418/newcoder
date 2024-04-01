package com.example;

import java.util.Scanner;

public class Qes100 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int sum=0;
            if(a>1){
                sum=2;
                int max = 2+3*(a-1);
                for(int i=1;i<a;i++){
                    sum+=2+3*i;
                }

            }else{
                sum=2;
            }
            System.out.println(sum);
        }
    }
}
