package com.example;

import java.util.Scanner;

public class Qes57 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            /*
            BigInteger bigint1= BigInteger.valueOf(Long.parseLong(str1));
            BigInteger bigint2 = BigInteger.valueOf(Long.parseLong(str2));
            bigint1=bigint1.add(bigint2);
            System.out.println(bigint1.toString());
            */
            StringBuilder sb1 = new StringBuilder(str1);
            StringBuilder sb2 = new StringBuilder(str2);
            StringBuilder sb = new StringBuilder();
            String num1 = sb1.reverse().toString();
            String num2 = sb2.reverse().toString();
            int len1 = num1.length();
            int len2 = num2.length();
            int len = len1;
            if(len1<len2){
                len = len2;
            }
            int flag=0;//是否进位
            for(int i=0;i<len;i++){
                int a =0;
                if(i<len1){
                    a = Integer.parseInt(num1.substring(i,i+1));
                }
                int b = 0;
                if(i<len2){
                    b = Integer.parseInt(num2.substring(i,i+1));
                }

                int sum = a+b+flag;
                flag = sum/10;

                sb.append(sum%10+"");
            }
            if(flag!=0){
                sb.append(flag);
            }
            System.out.println(sb.reverse().toString());
        }
    }

}
