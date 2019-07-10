package com.king.ctrip;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组移动 将0移动到最后 其余保持不变
 */
public class CtripArrDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要转化的数组：");
        String str1="";
        if (scan.hasNext()) {
             str1 = scan.next();
        }
        scan.close();
        String[] origin =str1.split("-");
        for(int i=0;i<origin.length;i++){
            for(int j=i+1;j<origin.length;j++){
                if("0".equals(origin[i])){
                   String temp = origin[j];
                   origin[j] = origin[i];
                   origin[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(origin));

    }
}
