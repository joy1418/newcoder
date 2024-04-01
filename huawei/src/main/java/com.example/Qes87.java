package com.example;

import java.util.Scanner;

public class Qes87 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            int code = 0;
            int len = str.length();
            if(len<=4){
                code += 5;
            }else if(len<=7){
                code+=10;
            }else{
                code+=25;
            }
            // System.out.println(code);
            int count1=0;//字母个数
            int counta=0;
            int countA=0;
            int count2=0;//数字个数
            int count3=0;//符号个数
            for(int i=0;i<str.length();i++){
                String s = str.substring(i,i+1);
                if(s.matches("[a-z]")){
                    count1++;
                    counta++;
                }else
                if(s.matches("[A-Z]")){
                    count1++;
                    countA++;
                }else
                if(s.matches("[0-9]")){
                    count2++;
                }else{
                    char c = s.charAt(0);
                    if((c>=33&&c<=47)||(c>=58&&c<=64)||(c>=80&&c<=96)||(c>=124&&c<=127)){
                        count3++;
                    }
                }
            }
            //System.out.println(count1+" "+count2+" "+count3);
            if((counta>0&&countA==0)||(counta==0&&countA>0)){
                code+=10;
            }else if(count1>=2&&counta>0&&countA>0){
                code+=20;
            }
            //System.out.println(code);
            if(count2==1){
                code+=10;
            }else if(count2>=2){
                code+=20;
            }
            //System.out.println(code);
            if(count3==1){
                code+=10;
            }else if(count3>=2){
                code+=25;
            }
            //System.out.println(code);
            if(count1>0&&count2>0&&count3==0){
                code+=2;
            }else if(counta>0&&countA>0&&count2>0&&count3>0){
                code+=5;
            }else if(count2>0&&count3>0&&(countA==0&&counta>0||countA>0&&counta==0)){
                code+=3;
            }
            //System.out.println(code);
            System.out.println(out(code));
        }
    }

    public static String out(int code){
        if(code>=90){
            return "VERY_SECURE";
        }else if(code>=80){
            return "SECURE";
        }else if(code>=70){
            return "VERY_STRONG";
        }else if(code>=60){
            return "STRONG";
        }else if(code>=50){
            return "AVERAGE";
        }else if(code>=25){
            return "WEAK";
        }else{
            return "VERY_WEAK";
        }

    }
}
