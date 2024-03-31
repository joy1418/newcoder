package com.example;

import java.util.Scanner;

public class Qes1{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str =in.nextLine();
            String[] arr =str.split(" ");
            System.out.println(arr[arr.length-1].length());
        }
    }
}