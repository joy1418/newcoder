package com.example;

import java.util.Scanner;

public class Qes105 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count1=0;
        int count2=0;
        int sum=0;
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            int num = Integer.parseInt(str);
            if(num<0){
                count1++;
            }else{
                count2++;
                sum+=num;
            }
        }
        double d = 0.0;
        if(count2!=0){
            d=1.0*sum/count2;
        }
        System.out.println(count1);
        System.out.println(String.format("%.1f",d));
    }
}
