package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Qes14 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            String[] arr = new String[num];
            for(int i=0;i<num;i++){
                arr[i] = in.nextLine();
            }
            Arrays.sort(arr);
            for(int j=0;j<num;j++){
                System.out.println(arr[j]);
            }

        }
    }

}
