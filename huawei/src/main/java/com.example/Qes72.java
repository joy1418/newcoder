package com.example;

import java.util.Scanner;

public class Qes72 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            //x+y+z=100,5x+3y+z/3=100,=>y=(100-7x)/4>0,即x不能大于14
            for(int i=0;i<=14;i++){
                if((100-7*i)%4==0){
                    int y = (100-7*i)/4;
                    int z = 100-i-y;
                    System.out.println(i+" "+y+" "+z);
                }
            }
        }
    }
}
