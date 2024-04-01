package com.example;

import java.util.Scanner;

public class Qes42 {
    static String[] shuzi ={"","one","two","three","four","five","six","seven","eight","nine","ten",
            "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
    static String[] zhengsu = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long l = in.nextLong();
        StringBuilder sb = new StringBuilder();
        int baiwan = (int)l/1000000;
        int qian = (int)(l-baiwan*1000000)/1000;
        int ge = (int)(l-baiwan*1000000-qian*1000);
        if(baiwan!=0){
            sb.append(trans(baiwan)).append(" million ");
        }
        if(qian!=0){
            sb.append(trans(qian)).append(" thousand ");
        }
        if(ge!=0){
            sb.append(trans(ge));
        }
        System.out.println(sb.toString());
    }

    public static String trans(int num) {
        StringBuilder sb = new StringBuilder();
        int bai = (int)num/100;
        int shi = (int)(num-bai*100)/10;
        int ge = (int)(num-bai*10-shi*10);
        if(bai!=0){
            sb.append(bai).append(" hundred ");
        }
        if(shi!=0){
            if(bai!=0){
                sb.append("and ");
            }
            if(shi==1){
                if(ge==0){
                    sb.append(zhengsu[shi]);
                    return sb.toString();
                }else{
                    sb.append(shuzi[shi*10+ge]);
                }
            }else{
                sb.append(zhengsu[shi]);
            }
        }
        if(ge!=0&&(shi!=1||shi==0)){
            if(bai!=0&&shi==0){
                sb.append("and");
            }
            sb.append(" "+shuzi[ge]);
        }
        return sb.toString().trim();
    }
}
