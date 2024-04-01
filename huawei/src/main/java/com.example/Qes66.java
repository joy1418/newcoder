package com.example;

import java.util.*;

public class Qes66 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("reset", "reset what");
        map.put("reset board", "board fault");
        map.put("board add", "where to add");
        map.put("board delete", "no board at all");
        map.put("reboot backplane", "impossible");
        map.put("backplane abort", "install first");
        map.put("noMatch","unknown command");

        List<String[]> list = new ArrayList<>();
        for (String s : map.keySet()) {
            list.add(s.split(" "));
        }

        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            String[] arr = str.split(" ");
            int count=0;
            String cmd = "noMatch";
            for (String[] ss : list) {
                if (arr.length == 1) {
                    if (ss.length == 1) {
                        if (ss[0].startsWith(arr[0])) {
                            cmd = ss[0];
                        }
                    }
                } else if (arr.length == 2) {
                    if(ss.length==2){
                        if(ss[0].startsWith(arr[0])&&ss[1].startsWith(arr[1])){
                            cmd = ss[0]+" "+ss[1];
                            count++;
                        }
                    }
                }
            }
            if(count>1){
                System.out.println("unknown command");
            }else{
                System.out.println(map.get(cmd));
            }

        }
    }
}
