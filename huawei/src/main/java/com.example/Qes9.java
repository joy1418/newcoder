package com.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Qes9 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String num = in.nextLine();
            Set<Character> set = new HashSet<>();
            int len = num.length();
            for(int i=len-1;i>=0;i--){
                char cc = num.charAt(i);
                if(!set.contains(cc)) {
                    System.out.print(cc);
                    set.add(cc);
                }
            }
        }
    }
}
