package com.example;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Qes102 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            Map<Character, Integer> map = new TreeMap<>();
            char[] arr = str.toCharArray();
            for (char c : arr) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int max = 0;
            for (int val : map.values()) {
                if (val > max) {
                    max = val;
                }
            }
            while (max > 0) {
                for (char c : map.keySet()) {
                    if (max == map.get(c)) {
                        System.out.print(c);
                    }
                }
                max--;
            }
        }
    }

}
