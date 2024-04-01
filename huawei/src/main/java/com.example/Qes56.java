package com.example;

import java.util.Scanner;

public class Qes56 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int num = in.nextInt();
            int sum = 0;
            for(int i=1;i<=num;i++){
                int tmp=0;
                for(int j=1;j<i;j++){
                    if(i%j==0){
                        tmp+=j;

                    }
                }
                if(i==tmp){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
