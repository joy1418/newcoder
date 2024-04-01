package com.example;

import java.util.Scanner;

public class Qes88 {

    static String[] arrs = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "joker", "JOKER"};
    static int[] types = {0, 1, 2, 3, 4, 5};
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String[] strarr = str.split("-");
        String  str1 = strarr[0];
        String str2 = strarr[1];
        int type1 = getType(str1);
        int type2 = getType(str2);
        if (type1 == type2) {
            if (type1 == types[1] || type1 == types[2] || type1 == types[3] ||
                    type1 == types[5]) {
                int begin1 = getBegin(str1);
                int begin2 = getBegin(str2);
                if (begin1 < begin2) {
                    System.out.println(str2);
                } else {
                    System.out.println(str1);
                }
            }
            if (type1 == types[4]) {
                if (str1.startsWith("joker")) {  //对王
                    System.out.println(str1);
                } else if (str2.startsWith("joker")) { //对王
                    System.out.println(str2);
                } else {  //炸弹（四个）
                    int begin1 = getBegin(str1);
                    int begin2 = getBegin(str2);
                    if (begin1 < begin2) {
                        System.out.println(str2);
                    } else {
                        System.out.println(str1);
                    }
                }
            }

        } else {  //不同类型
            if (type1 == types[4]) {
                System.out.println(str1);
            } else if (type2 == types[4]) {
                System.out.println(str2);
            } else {
                System.out.println("ERROR");
            }
        }
    }

    public static int getType(String s) {
        String[] arr = s.split(" ");
        int len = arr.length;
        if (len == 1) {
            return types[1];
        } else if (len == 2 && arr[0].equals(arr[1])) {
            return types[2];
        } else if (len == 3 && arr[0].equals(arr[1]) && arr[0].equals(arr[2])) {
            return types[3];
        } else if (len == 4 && arr[0].equals(arr[1]) && arr[0].equals(arr[2]) &&
                arr[0].equals(arr[3])) {
            return types[4];
        } else if (len == 2 && ((arr[0].equals("joker") && arr[1].equals("JOKER")) ||
                (arr[1].equals("joker") && arr[0].equals("JOKER")))) {
            return types[4];
        } else if (len == 5 && isShunzi(arr)) {
            return types[5];
        }
        return 0;
    }

    public static boolean isShunzi(String[] arr) {
        int index = getBegin(arr);
        if (index != -1) {
            if (arr[1].equals(arrs[index + 1]) && arr[2].equals(arrs[index + 2]) &&
                    arr[3].equals(arrs[index + 3]) && arr[4].equals(arrs[index + 4])) {
                return true;
            }
        }
        return false;
    }

    public static int getBegin(String[] arr) {
        int index = -1;
        for (int i = 0; i < arrs.length; i++) {
            if (arr[0].equals(arrs[i])) {
                index = i;
            }
        }
        return index;
    }

    public static int getBegin(String s) {
        int index = -1;
        String[] arrstr = s.split(" ");
        for (int i = 0; i < arrs.length; i++) {
            if (arrstr[0].equals(arrs[i])) {
                index = i;
            }
        }
        return index;
    }
}
