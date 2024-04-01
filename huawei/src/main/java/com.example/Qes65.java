package com.example;

import java.util.*;

public class Qes65 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String s1 = str1.length() < str2.length() ? str1 : str2;
        String s2 = str1.length() < str2.length() ? str2 : str1;

        List<Map<String, Integer>> list = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = s1.length(); j > i; j--) {
                String tmp = s1.substring(i, j);
                if (s2.contains(tmp)) {
                    max = j - i > max ? j - i : max;
                    Map<String, Integer> map = new HashMap<>();
                    map.put(tmp, max);
                    list.add(map);
                    break;
                }
            }
        }
        boolean flag = true;
        for (Map<String, Integer> m : list) {
            if (flag) {
                for (String ss : m.keySet()) {
                    if (m.get(ss) == max) {
                        System.out.println(ss);
                        flag=false;
                        break;
                    }
                }
            }
        }
    }
}
