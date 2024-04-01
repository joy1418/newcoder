package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qes28 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int[] tempArray = new int[n];
            for (int i = 0; i < n; i++) {
                tempArray[i] = in.nextInt();
            }
            ArrayList<Integer> evens = new ArrayList<Integer>();
            ArrayList<Integer> odds = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if ((tempArray[i] & 1) != 1) {
                    evens.add(tempArray[i]);
                } else {
                    odds.add(tempArray[i]);
                }
            }
            //下面开始才是重头戏
            //用于标记那个奇数匹配了偶数,直接记录奇数的值，而不是奇数在奇数数组中的下标
            int[] evensMatch = new int[evens.size()];
            int result = 0;
            //遍历奇数去匹配偶数
            for (int i = 0; i < odds.size(); i++) {
                //每一步重新创建，也就是相当于清空
                //used数组用于标记某个某数位置是否
                int[] used = new int[evens.size()];
                //这里采用了匈牙利算法，先到先得
                if (find(odds.get(i), evens, used, evensMatch)) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }

    public static boolean find(int val, List<Integer> evens, int[] used,
                               int[] evensMatch) {
        for (int i = 0; i < evens.size(); i++) {
            if (isPrime(evens.get(i) + val) && used[i] == 0) {
                used[i] = 1;
                if (evensMatch[i] == 0 || find(evensMatch[i], evens, used, evensMatch)) {
                    evensMatch[i] = val;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
