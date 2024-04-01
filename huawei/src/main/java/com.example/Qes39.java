package com.example;

import java.util.Scanner;

public class Qes39 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String mask = in.nextLine();
            String ip1 = in.nextLine();
            String ip2 = in.nextLine();
            if (!isIp(ip1) || !isIp(ip2) || !isIp(mask) || !isYanMa(mask)) {
                System.out.println(1);
            } else {
                String strYan = toLongStr(mask);
                String strip1 = toLongStr(ip1);
                String strip2 = toLongStr(ip2);
                StringBuilder res1 = new StringBuilder();
                StringBuilder res2 = new StringBuilder();
                for(int i=0;i<strYan.length();i++){
                    String ss = strYan.substring(i,i+1);
                    if(ss.equals("1")&&ss.equals(strip1.substring(i,i+1))){
                        res1.append("1");
                    }else{
                        res1.append("0");
                    }
                    if(ss.equals("1")&&ss.equals(strip2.substring(i,i+1))){
                        res2.append("1");
                    }else{
                        res2.append("0");
                    }
                }
                if(res1.toString().equals(res2.toString())){
                    System.out.println(0);
                }else{
                    System.out.println(2);
                }
            }
        }
    }

    //ip转32位二进制
    public static String toLongStr(String s) {
        String[] arr = s.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String tmp = arr[i];
            int itmp = Integer.parseInt(tmp);
            String btmp = Integer.toBinaryString(itmp);
            while(btmp.length()<8){
                btmp="0"+btmp;
            }
            sb.append(btmp);
        }
        return sb.toString();
    }

    //检测掩码是否合法
    public static boolean isYanMa(String s) {
        boolean flag = true;
        if (isIp(s)) {
            String[] arr = s.split("\\.");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                String tmp = arr[i];
                int itmp = Integer.parseInt(tmp);
                String btmp = Integer.toBinaryString(itmp);
                while(btmp.length()<8){
                    btmp="0"+btmp;
                }
                sb.append(btmp);
            }
            String longstr = sb.toString();
            if(!longstr.matches("[1]{1,}[0]{1,}")){
                return false;
            }
        }
        return flag;
    }
    //检测ip是否合法
    public static boolean isIp(String s) {
        boolean flag = false;
        String[] arr = s.split("\\.");
        if (arr.length == 4) {        //4位
            if (Integer.parseInt(arr[0]) == 0) {
                return false;
            }
            for (int i = 0; i < arr.length; i++) {
                String tmp = arr[i];
                if (tmp.equals("") || tmp == null) {
                    return false;
                }
                int itmp = Integer.parseInt(tmp);
                if (itmp < 0 || itmp > 255) {
                    return false;
                }
                if (!tmp.equals(String.valueOf(itmp))) {
                    return false;
                }
                flag = true;
            }
        }
        return flag;
    }
}
