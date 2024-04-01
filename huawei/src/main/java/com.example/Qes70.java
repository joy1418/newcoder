package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Qes70 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            map.put((char)('A' + i), in.nextLine());
        }
        //in.nextLine();
        String regx = in.nextLine();
        Stack<Character> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < regx.length(); i++) {
            String s = regx.substring(i, i + 1);
            if (s.equals(")")) {
                char b = stack.pop();  //B
                char a = stack.pop();   //A
                String stra = map.get(a);
                String strb = map.get(b);
                String[] arra = stra.split(" ");
                String[] arrb = strb.split(" ");
                sum += Integer.parseInt(arra[0]) * Integer.parseInt(arra[1]) * Integer.parseInt(
                        arrb[1]);
                stack.pop();   //弹出）
                map.put(a, arra[0] + " " + arrb[1]);
                stack.push(a);
            } else {
                stack.push(s.charAt(0));
            }
        }
        System.out.println(sum);
    }

}
