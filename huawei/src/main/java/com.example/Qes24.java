package com.example;

import java.util.Scanner;

public class Qes24 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            String str = in.nextLine();
            if(str!=null && !str.equals("")){
                String[] arr = str.split(" ");
                int[] mems = new int[arr.length];
                for(int i=0;i<arr.length;i++){
                    mems[i]=Integer.parseInt(arr[i]);
                }
                int[] memLeft = new int[arr.length];  //存储每个数左边小于其的数的个数
                int[] memRight = new int[arr.length];  //存储每个数右边小于其的数的个数
                memLeft[0]=1;
                memRight[arr.length-1]=1;
                for(int i=1;i< arr.length;i++){  //计算位置i左侧的最长递增子序列长度，自身为1
                    memLeft[i]=1;
                    for(int j=0;j<i;j++){
                        if(mems[i]>mems[j]){
                            memLeft[i] = Math.max(memLeft[j]+1,memLeft[i]);
                        }
                    }
                }
                for(int i= arr.length-1;i>=0;i--){  //计算位置i右侧的最长递减子序列长度，自身为1
                    memRight[i]=1;
                    for(int j= arr.length-1;j>i;j--){
                        if(mems[i]>mems[j]){
                            memRight[i]=Math.max(memRight[j]+1,memRight[i]);
                        }
                    }
                }
                int[] res = new int[arr.length];
                for(int i=0;i<arr.length;i++){
                    res[i] = memLeft[i]+memRight[i]-1;
                }
                int max=0;
                for(int i=0;i<arr.length;i++){
                    max=Math.max(max,res[i]);
                }
                int out = arr.length-max;
                System.out.println(out);
            }
        }
    }
}
