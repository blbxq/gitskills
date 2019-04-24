package com.river.util;

/**
 * Created by gongjianghe
 * Date 2019/4/24
 * Time 19:49
 * Description:工具总类
 */
public class AllUtil {

    public static void printOneArr(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++){
            System.out.print(a[i]);
            if (i != n-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
