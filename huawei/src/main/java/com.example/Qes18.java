package com.example;

import java.util.Scanner;

public class Qes18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int errA=0,errB=0,errC=0,errD=0,errE=0,errS=0,errP=0;
        while (in.hasNextLine()){
            String str = in.nextLine();
            if(str.equals("0")){
                break;
            }
            String[] arr = str.split("~");
            String ipstr = arr[0];
            String ipmask = arr[1];
            if(!isIpValid(ipstr)){
                errS++;
                continue;
            }
            if(!isMaskValid(ipmask)){
                errS++;
                continue;
            }
            int first = getIpSeg(ipstr,0);
            if(first==0||first==127){
                continue;
            }
            if(first>=1 && first<=126){
                errA++;
            }else if(first>=128 && first<=191){
                errB++;
            }else if(first>=192 && first<=223){
                errC++;
            }else if(first>=224 && first<=239){
                errD++;
            }else if(first>=240 && first<=255){
                errE++;
            }
            int second = getIpSeg(ipstr,1);
            if((first==10&&(second>=0||second<=255)) ||(first==172&&(second>=16&&second<=31)) ||(first==192&&second==168)){
                errP++;
            }
        }
        System.out.print(errA+" "+errB+" "+errC+" "+errD+" "+errE+" "+errS+" "+errP);
    }

    public static boolean isMaskValid(String ip){
        if(!isIpValid(ip)){
            return false;
        }
        String[] arr = ip.split("\\.");
        String str = toHexString(arr[0])+toHexString(arr[1])+toHexString(arr[2])+toHexString(arr[3]);
        if(str.matches("[1]{1,}[0]{1,}")){
            return true;
        }else{
            return false;
        }
    }

    public static String toHexString(String s){
        String ss = Integer.toBinaryString(Integer.parseInt(s));
        int len = ss.length();
        while (len<8){
            len++;
            ss="0"+ss;
        }
        return ss;
    }

    public static boolean isIpValid(String ip){
        if(ip==null || ip.equals("")){
            return false;
        }
        String[] iparr = ip.split("\\.");
        if(iparr.length!=4){
            return false;
        }
        if(iparr[0].equals("")||iparr[1].equals("")||iparr[2].equals("")||iparr[3].equals("")){
            return false;
        }
        if(Integer.parseInt(iparr[0])>255||Integer.parseInt(iparr[1])>255||Integer.parseInt(iparr[2])>255||Integer.parseInt(iparr[3])>255){
            return false;
        }
        return true;
    }

    public static int getIpSeg(String ip,int index){
        String[] iparr = ip.split("\\.");
        return Integer.parseInt(iparr[index]);
    }
}
