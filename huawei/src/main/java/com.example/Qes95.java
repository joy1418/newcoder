package com.example;

import java.util.Scanner;

public class Qes95 {
    static String[] hanzi = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾"};

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()) { // 注意 while 处理多个 case
            double d = in.nextDouble();
            String str = String.valueOf(d);
            String[] arr = str.split("\\.");
            String res = "人民币";
            StringBuilder sb = new StringBuilder();
            sb.append(res);
            String ss = arr[0];
            int zhengnum = Integer.parseInt(ss);
            int yi = zhengnum / 100000000;
            int wan = (zhengnum - yi * 100000000) / 10000;
            int ge = zhengnum - yi * 100000000 - wan * 10000;
            if (yi != 0) {
                sb.append(zhengshu(yi) + "亿");
            }
            if (wan != 0) {
                sb.append(zhengshu(wan) + "万");
            }
            if (ge != 0) {
                sb.append(zhengshu(ge) + "元");
            }
            sb.append(xiaoshu(arr[1]));
            System.out.println(sb.toString());
        }
    }

    //4位整数
    public static String zhengshu(int num) {
        StringBuilder sb = new StringBuilder();
        int qian = num / 1000;
        int bai = (num - qian * 1000) / 100;
        int shi = (num - qian * 1000 - bai * 100) / 10;
        int ge = num - qian * 1000 - bai * 100 - shi * 10;
        if (qian != 0) {
            sb.append(hanzi[qian] + "仟");
        }
        if (bai != 0) {
            sb.append(hanzi[bai] + "佰");
        } else if (qian != 0 && bai == 0 && (shi != 0 || ge != 0)) {
            sb.append("零");
        }
        if (shi != 0 && shi != 1) {
            sb.append(hanzi[shi] + "拾");
        } else if (bai != 0 && ge != 0) {
            sb.append("零");
        }
        if (shi == 1 && qian == 0 && bai == 0) {
            sb.append("拾");
        }
        if (ge != 0) {
            sb.append(hanzi[ge]);
        }
        return sb.toString();
    }

    //返回小数
    public static String xiaoshu(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.equals("00")) {
            sb.append("整");
        }
        if (s.charAt(0) != '0') {
            sb.append(hanzi[Integer.parseInt(s.charAt(0) + "")] + "角");
        }
        if (s.length() == 2) {
            if (s.charAt(1) != '0') {
                sb.append(hanzi[Integer.parseInt(s.charAt(1) + "")] + "分");
            }
        }

        return sb.toString();
    }
}
