package com.example;

import java.util.Scanner;

public class Qes13 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr = str.split(" ");
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
