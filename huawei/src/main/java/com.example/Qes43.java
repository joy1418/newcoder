package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qes43 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] arr = str.split(" ");
        int a = Integer.parseInt(arr[0]); //行数
        int b = Integer.parseInt(arr[1]); //列数
        int[][] shuzu = new int[a][b];
        for(int i=0;i<a;i++){
            String s = in.nextLine();
            String[] arrs = s.split(" ");
            int[] tmp = new int[b];
            shuzu[i]=tmp;
            for(int j=0;j<b;j++){
                tmp[j]=Integer.parseInt(arrs[j]);
            }
        }
        List<Pos> list = new ArrayList<>();
        dfs(shuzu,0,0,list);
        for(int i=0;i<list.size();i++){
            Pos pos = list.get(i);
            System.out.println("("+pos.x+","+pos.y+")");
        }
    }

    public static boolean dfs(int[][] shuzu,int x,int y,List<Pos> list){
        Pos pos = new Pos(x,y);
        list.add(pos);
        shuzu[x][y]=1;  //走过的路不能再走
        if(x== shuzu.length-1&&y==shuzu[0].length-1){
            return true;
        }
        //向右
        if(x+1< shuzu.length && shuzu[x+1][y]==0){
            if(dfs(shuzu,x+1,y,list)) return true;
        }

        if(x-1< shuzu.length && shuzu[x-1][y]==0){
            if(dfs(shuzu,x-1,y,list)) return true;
        }
        if(y+1< shuzu.length && shuzu[x][y+1]==0){
            if(dfs(shuzu,x,y+1,list)) return true;
        }
        if(y-1< shuzu.length && shuzu[x][y-1]==0){
            if(dfs(shuzu,x,y-1,list)) return true;
        }
        shuzu[x][y]=0;  //走过的路重置为可以走
        list.remove(list.size()-1);  //回溯
        return false;
    }
}

class Pos{
    int x;
    int y;
    public Pos(){}
    public Pos(int x,int y){
        this.x =x ;
        this.y =y;
    }
}