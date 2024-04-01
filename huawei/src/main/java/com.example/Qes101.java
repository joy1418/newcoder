package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Qes101 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            String str = in.nextLine();
            int flag = Integer.parseInt(in.nextLine());
            int[] arr = new int[num];
            List<Integer> list = new ArrayList<>();
            String[] strarr = str.split(" ");
            for(int i=0;i<strarr.length;i++){
                list.add(Integer.parseInt(strarr[i]));
                arr[i] = Integer.parseInt(strarr[i]);
            }
            if(flag==1){
                Collections.sort(list, Collections.reverseOrder());
            }else{
                Collections.sort(list);
            }
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
