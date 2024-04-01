package com.example;

import java.util.Scanner;

public class Qes73 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr = str.split(" ");
            int year = Integer.parseInt(arr[0]);
            int month = Integer.parseInt(arr[1]);
            int day = Integer.parseInt(arr[2]);
            int days = 0;
            switch(month){
                case 1:
                    days = day;
                    break;
                case 2:
                    days = 31+day;
                    break;
                case 3:
                    days = 31+28+day;
                    break;
                case 4:
                    days = 31+28+31+day;
                    break;
                case 5:
                    days = 31+28+31+30+day;
                    break;
                case 6:
                    days = 31+28+31+30+31+day;
                    break;
                case 7:
                    days = 31+28+31+30+31+30+day;
                    break;
                case 8:
                    days = 31+28+31+30+31+30+31+day;
                    break;
                case 9:
                    days = 31+28+31+30+31+30+31+31+day;
                    break;
                case 10:
                    days = 31+28+31+30+31+30+31+31+30+day;
                    break;
                case 11:
                    days = 31+28+31+30+31+30+31+31+30+31+day;
                    break;
                case 12:
                    days = 31+28+31+30+31+30+31+31+30+31+30+day;
                    break;


            }
            if(year%4==0&&year%100!=0||year%400==0){  //闰年2月有29天
                if(month>2){
                    days++;
                }
            }
            System.out.println(days);
        }
    }
}
