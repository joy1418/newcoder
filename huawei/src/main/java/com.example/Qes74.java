package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qes74 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            List<String> list =  new ArrayList<>();
            int start = 0; //记录参数字符起始位置
            boolean flag = false; //是否出现过引号
            boolean ff = false;
            if (str.contains("\"")) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    String ss = str.substring(i, i + 1);
                    //System.out.println(i+"="+ss);
                    if (ss.equals("\"")) {
                        if (flag) {
                            list.add(str.substring(start, i));
                            //   System.out.println(str.substring(start,i));
                            start = i + 2;
                            flag = false;
                            ff = true;
                        } else {
                            start = i + 1;
                            flag = true;
                        }
                    } else {
                        if (ss.equals(" ") && !flag) {
                            if (!ff) {
                                list.add(str.substring(start, i));
                                //        System.out.println(str.substring(start,i));
                                start = i + 1;
                            }
                            ff = false;
                        }

                    }
                    if (start <= i && i == length - 1) {
                        list.add(str.substring(start));
                    }
                }
                System.out.println(list.size());
                for (int a = 0; a < list.size(); a++) {
                    System.out.println(list.get(a));
                }
            } else {
                String[] arr = str.split(" ");
                System.out.println(arr.length);
                for (String s : arr) {
                    System.out.println(s);
                }
            }
        }
    }
}
