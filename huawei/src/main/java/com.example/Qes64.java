package com.example;

import java.util.Scanner;

public class Qes64 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());  //歌曲总数
            int[] nums = new int[num];
            for(int i=0;i<num;i++){
                nums[i]=i+1;
            }
            String str = in.nextLine();     //所有操作命令
            char[] opts = new char[str.length()];   //操作命令数组
            for(int i=0;i<str.length();i++){
                opts[i]=str.charAt(i);
            }
            int index = 1;   //当前屏幕第一首歌的序号
            int flag = 1;    //光标位置，取值范围1，2，3，4，因为只显示4个
            if(num<5){     //歌曲总数小于5时，不翻页
                for(char c:opts){
                    if(c=='U'){
                        if(flag==1){
                            flag=num;
                        }else{
                            flag--;
                        }
                    }
                    if(c=='D'){
                        if(flag==num){
                            flag=1;
                        }else{
                            flag++;
                        }
                    }
                }
                for(int i=0;i<num;i++){
                    System.out.print(nums[i]+" ");
                }
                System.out.println();
                System.out.println(nums[index-1+flag-1]);
            }else{
                for(char c:opts){
                    if(c=='U'){
                        if(flag==1){
                            if(index==1){
                                index = num-3;
                                flag = 4;
                            }else{
                                index--;
                            }

                        }else{
                            flag--;
                        }
                    }
                    if(c=='D'){
                        if(flag==4){
                            if(index==num-3){
                                index = 1;
                                flag=1;
                            }else{
                                index++;
                            }
                        }else{
                            flag++;
                        }
                    }
                }
                System.out.println(nums[index-1]+" "+nums[index]+" "+nums[index+1]+" "+nums[index+2]);
                System.out.println(nums[index-1+flag-1]);
            }
        }
    }
}
