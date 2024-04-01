package com.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Qes81 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            String res = "true";
            Set<String> set = new HashSet<>();
            for(int i=0;i<str2.length();i++){
                set.add(str2.substring(i,i+1));
            }
            for(int i=0;i<str1.length();i++){
                if(!set.contains(str1.substring(i,i+1))){
                    res="false";
                }

            }
            System.out.println(res);
        }
    }
}
