package com.example;

import java.util.Scanner;

public class Qes16 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr = str.split(" ");
            int n = Integer.parseInt(arr[0]);   //总钱数
            int m = Integer.parseInt(arr[1]);   //总物品数
            Good[] goods = new Good[m+1];
            for(int i=1;i<=m;i++){
                goods[i] = new Good();
            }
            for(int i=1;i<=m;i++){
                String str1 = in.nextLine();
                String[] arr1 = str1.split(" ");
                int v = Integer.parseInt(arr1[0]);
                int p = Integer.parseInt(arr1[1]);
                int q = Integer.parseInt(arr1[2]);
                goods[i].v = v;
                goods[i].p = p;
                goods[i].q = q;
                if(q>0){
                    if(goods[q].f1!=0){
                        goods[q].f1 = i;
                    }else{
                        goods[q].f2 = i;
                    }
                }
            }
            int[][] dp = new int[m+1][n+1];
            for(int i=1;i<=m;i++){
                int v=0,v1=0,v2=0,v3=0,tempdp=0,tempdp1=0,tempdp2=0,tempdp3=0;
                v = goods[i].v;
                tempdp = v*goods[i].p;
                if(goods[i].f1!=0){            //只选附件1
                    v1 = v+ goods[goods[i].f1].v;
                    tempdp1 = tempdp+goods[goods[i].f1].v*goods[goods[i].f1].p;
                }
                if(goods[i].f2!=0){           //只选附件2
                    v2 = v+goods[goods[i].f2].v;
                    tempdp2 = tempdp+goods[goods[i].f2].v*goods[goods[i].f2].p;
                }
                if(goods[i].f1!=0&&goods[i].f2!=0){      //选附件1和附件2
                    v3 = v+goods[goods[i].f1].v+goods[goods[i].f2].v;
                    tempdp3 = tempdp3+goods[goods[i].f1].v*goods[goods[i].f1].p+goods[goods[i].f2].v*goods[goods[i].f2].p;
                }
                for(int j=1;j<=n;j++){
                    if(goods[i].q>0){
                        dp[i][j] = dp[i-1][j];   //跳过附件
                    }else{
                        dp[i][j] =dp[i-1][j];
                        if(j>=v&&v!=0) dp[i][j] = Math.max(dp[i][j],dp[i-1][j-v]+tempdp);
                        if(j>=v1 && v1!=0) dp[i][j] = Math.max(dp[i][j],dp[i-1][j-v1]+tempdp1);
                        if(j>=v2 && v2!=0) dp[i][j] = Math.max(dp[i][j],dp[i-1][j-v2]+tempdp2);
                        if(j>=v3&&v3!=0) dp[i][j] = Math.max(dp[i][j],dp[i-1][j-v3]+tempdp3);
                    }
                }
            }
            System.out.println(dp[m][n]);
        }
    }

}
class Good{
    int v;  //价值
    int p;  //重要度
    int q;  //主附件标识，0,主件，>0表示所属主件号
    int f1=0;  //附件1号
    int f2=0;  //附件2号
    public Good(){}
    public Good(int v,int p,int q){
        this.v=v;
        this.p=p;
        this.q=q;
    }
}
