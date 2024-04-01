package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Qes78 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num1 = Integer.parseInt(in.nextLine());
            String str1 = in.nextLine();
            int num2 = Integer.parseInt(in.nextLine());
            String str2 = in.nextLine();
            List<Integer> list = new ArrayList<>();
            String[] arr1 = str1.split(" ");
            for (String s : arr1) {
                if (!list.contains(Integer.parseInt(s))) {
                    list.add(Integer.parseInt(s));
                }
            }
            String[] arr2 = str2.split(" ");
            for (String s : arr2) {
                if (!list.contains(Integer.parseInt(s))) {
                    list.add(Integer.parseInt(s));
                }
            }


            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
        }
    }
}
