package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qes63 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();        //基因序列
        int num = Integer.parseInt(in.nextLine());  //字串长度
        List<String> list = new ArrayList<>();
        for(int i=0;i<str.length()-num+1;i++){
            String tmp = str.substring(i,i+num);
            list.add(tmp);
        }
        double max = 0.0;
        String res = "";
        for(int i=0;i<list.size();i++){
            String tmp = list.get(i);
            int count = 0;
            for(char c:tmp.toCharArray()){
                if(c=='C'||c=='G'){
                    count++;
                }
            }

            double bili = (double)count/num;
            if(bili>max){
                max=bili;
                res=tmp;
            }
        }
        System.out.println(res);
    }
}
