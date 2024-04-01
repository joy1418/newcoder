package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Qes98 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr = str.split(";");
            int[] goods = new int[6];
            int[] coins = new int[4];
            int[] prices = {2, 3, 4, 5, 8, 6};
            List<Integer> list = new ArrayList<>();
            int money = 0;
            for (int i = 0; i < arr.length; i++) {
                String ss = arr[i];
                String[] cmdarr = ss.split(" ");
                String cmd = cmdarr[0];
                if (cmd==null || cmd.equals("")) {
                    continue;
                } else {
                    if (cmd.length() != 1) {
                        System.out.println("E010:Parameter error");
                    } else {
                        if (cmd.equals("r")) {
                            String[] goodstr = cmdarr[1].split("-");
                            for (int a = 0; a < 6; a++) {
                                goods[a] = Integer.parseInt(goodstr[a]);
                                list.add(Integer.parseInt(goodstr[a]));
                            }
                            String[] coinstr = cmdarr[2].split("-");
                            for (int a = 0; a < 4; a++) {
                                coins[a] = Integer.parseInt(coinstr[a]);
                            }
                            System.out.println("S001:Initialization is successful");
                        } else if (cmd.equals("p")) {
                            int paymoney = Integer.parseInt(cmdarr[1]);
                            if (paymoney == 1 || paymoney == 2 || paymoney == 5 || paymoney == 10) {
                                if (paymoney > coins[0] + coins[1] * 2) {
                                    System.out.println("E003:Change is not enough, pay fail");
                                } else {
                                    if (goods[0] == 0 && goods[1] == 0 && goods[2] == 0 && goods[3] == 0 &&
                                            goods[4] == 0 && goods[5] == 0) {
                                        System.out.println("E005:All the goods sold out");
                                    } else {
                                        money = money + paymoney;
                                        if (paymoney == 1) coins[0]++;
                                        if (paymoney == 2) coins[1]++;
                                        if (paymoney == 5) coins[2]++;
                                        if (paymoney == 10) coins[3]++;
                                        System.out.println("S002:Pay success,balance=" + money);
                                    }
                                }
                            } else {
                                System.out.println("E002:Denomination error");
                            }
                        } else if (cmd.equals("b")) {
                            String goodName = cmdarr[1];
                            int goodNum = Integer.parseInt(goodName.substring(1));
                            if (goodNum - 1 < 0 || goodNum - 1 > 5) {
                                System.out.println("E006:Goods does not exist");
                            } else if (goods[goodNum - 1] == 0) {
                                System.out.println("E007:The goods sold out");
                            } else if (money < prices[goodNum - 1]) {
                                System.out.println("E008:Lack of balance");
                            } else {
                                money = money - prices[goodNum - 1];
                                goods[goodNum - 1]--;
                                list.set(goodNum - 1, goods[goodNum - 1]);
                                System.out.println("S003:Buy success,balance=" + money);
                            }
                        } else if (cmd.equals("c")) {
                            if (money == 0) {
                                System.out.println("E009:Work failure");
                            } else if (money > 0) {
                                String res = command_C(coins, money);
                                String[] resarr = res.split("-");
                                System.out.println("1 yuan coin number=" + resarr[3]);
                                System.out.println("2 yuan coin number=" + resarr[2]);
                                System.out.println("5 yuan coin number=" + resarr[1]);
                                System.out.println("10 yuan coin number=" + resarr[0]);
                                money = 0;
                            }
                        } else if (cmd.equals("q")) {
                            int type = Integer.parseInt(cmdarr[1]);
                            if (type != 0 || type != 1) {
                                System.out.println("E010:Parameter error");
                            } else {
                                if (type == 0) {
                                    Collections.sort(list, Collections.reverseOrder());
                                    for (int b = 0; b < list.size(); b++) {
                                        for (int c = 0; c < goods.length; c++) {
                                            if (list.get(b) == goods[c]) {
                                                System.out.println("A" + (c + 1) + " " + prices[c] + " " + list.get(b));
                                            }
                                        }
                                    }
                                } else if (type == 1) {
                                    System.out.println("1 yuan coin number=" + coins[0]);
                                    System.out.println("2 yuan coin number=" + coins[1]);
                                    System.out.println("5 yuan coin number=" + coins[2]);
                                    System.out.println("10 yuan coin number=" + coins[3]);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static String command_C(int[] coins, int money) {
        String res = "";
        if (money >= 10) {
            int tencount = money / 10;
            if (tencount > coins[3]) {
                coins[3] = 0;
            } else {
                coins[3] -= tencount;
            }
            money -= tencount * 10;
            int fivecount = money / 5;
            if (fivecount > coins[2]) {
                coins[2] = 0;
            } else {
                coins[2] -= fivecount;
            }
            money -= fivecount * 5;
            int twocount = money / 2;
            if (twocount > coins[1]) {
                coins[1] = 0;
            } else {
                coins[1] -= twocount;
            }
            money -= twocount * 2;
            int onecount = money;
            if (onecount > coins[0]) {
                coins[0] = 0;
            } else {
                coins[0] -= onecount;
            }
            money = 0;
            res = tencount + "-" + fivecount + "-" + twocount + "-" + onecount;
        } else if (money >= 5) {
            int fivecount = money / 5;
            if (fivecount > coins[2]) {
                coins[2] = 0;
            } else {
                coins[2] -= fivecount;
            }
            money -= fivecount * 5;
            int twocount = money / 2;
            if (twocount > coins[1]) {
                coins[1] = 0;
            } else {
                coins[1] -= twocount;
            }
            money -= twocount * 2;
            int onecount = money;
            if (onecount > coins[0]) {
                coins[0] = 0;
            } else {
                coins[0] -= onecount;
            }
            money = 0;
            res = 0 + "-" + fivecount + "-" + twocount + "-" + onecount;
        } else if (money >= 2) {
            int twocount = money / 2;
            if (twocount > coins[1]) {
                coins[1] = 0;
            } else {
                coins[1] -= twocount;
            }
            money -= twocount * 2;
            int onecount = money;
            if (onecount > coins[0]) {
                coins[0] = 0;
            } else {
                coins[0] -= onecount;
            }
            money = 0;
            res = 0 + "-" + 0 + "-" + twocount + "-" + onecount;
        } else {
            int onecount = money;
            if (onecount > coins[0]) {
                coins[0] = 0;
            } else {
                coins[0] -= onecount;
            }
            money = 0;
            res = 0 + "-" + 0 + "-" + 0 + "-" + onecount;
        }
        return res;
    }

}


