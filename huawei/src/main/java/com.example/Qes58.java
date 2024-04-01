package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Qes58 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            String[] arr1 = str1.split(" ");
            int num = Integer.parseInt(arr1[1]);
            String[] arr2 = str2.split(" ");
            List<Integer> list =  new ArrayList<>();
            for(String s:arr2){
                list.add(Integer.parseInt(s));
            }
            Collections.sort(list);
            for(int i=0;i<num;i++){
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
