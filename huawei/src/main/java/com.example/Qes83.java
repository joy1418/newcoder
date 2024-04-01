package com.example;

import java.util.Scanner;

public class Qes83 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            String str3 = in.nextLine();
            String str4 = in.nextLine();
            String str5 = in.nextLine();
            String[] arr1 = str1.split(" ");
            int m = Integer.parseInt(arr1[0]);
            int n = Integer.parseInt(arr1[1]);
            if (m > 0 && m <= 9 && n > 0 && n <= 9) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
            String[] arr2 = str2.split(" ");
            if (Integer.parseInt(arr2[0]) < m && Integer.parseInt(arr2[1]) < n
                    && Integer.parseInt(arr2[2]) < m && Integer.parseInt(arr2[3]) < n) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
            if (Integer.parseInt(str3) < m) {
                if(m+1>9){
                    System.out.println(-1);
                }else{
                    System.out.println(0);
                }

            } else {
                System.out.println(-1);
            }
            if (Integer.parseInt(str4) < n) {
                if(n+1>9){
                    System.out.println(-1);
                }else{
                    System.out.println(0);
                }

            } else {
                System.out.println(-1);
            }
            String[] arr5 = str5.split(" ");
            if(Integer.parseInt(arr5[0])<m&&Integer.parseInt(arr5[1])<n){
                System.out.println(0);
            }else{
                System.out.println(-1);
            }
        }
    }
}
