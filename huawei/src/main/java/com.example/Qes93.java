package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qes93 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int num = Integer.parseInt(in.nextLine());
            String str = in.nextLine();
            String[ ] arr = str.split(" ");
            int sum3 = 0;
            int sum5 = 0;
            int sum = 0;
            int sumother = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                int ii = Integer.parseInt(arr[i]);
                if (ii % 5 == 0) {
                    sum5 += ii;
                } else if (ii % 3 == 0) {
                    sum3 += ii;
                } else {
                    sumother += ii;
                    list.add(ii);
                }
                sum += ii;
            }

            int target = sum / 2 - sum3;
            boolean flag = dfs(list, target, 0);
            if (sum % 2 != 0) {
                System.out.println("false");
            } else {
                if (flag) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }
    }
    public static boolean dfs(List<Integer> list, int target, int start) {
        if (start == list.size()) return target == 0;

        return dfs(list, target - list.get(start), start + 1) ||
                dfs(list, target, start + 1);
    }

}
