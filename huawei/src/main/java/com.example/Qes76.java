package com.example;

import java.util.Scanner;

public class Qes76 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            String res = "";
            if(a>0){
                if(a%2==0){  //偶数
                    int times = (a-2)/2;
                    int min = a*a-1-2*times;
                    for(int i=0;i<a;i++){
                        res = res+(min+2*i)+"+";
                    }
                    res = res.substring(0,res.length()-1);
                }else{  //奇数
                    int times = (a-1)/2;
                    int min = a*a-2*times;
                    int max= a*a+2*times;
                    for(int i=0;i<a;i++){
                        res = res+(min+2*i)+"+";
                    }
                    res = res.substring(0,res.length()-1);
                }
            }
            System.out.println(res);
        }
    }

}
