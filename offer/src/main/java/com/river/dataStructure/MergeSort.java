package com.river.dataStructure;

import com.river.util.AllUtil;

/**
 * Created by gongjianghe
 * Date 2019/4/24
 * Time 18:41
 * Description:归并排序
 */
public class MergeSort {

    public static void mergeSort(int[] a){
        mergeSortInterlly(a, 0, a.length-1);
    }

    private static void mergeSortInterlly(int[] a, int p, int r){

        //循环终止条件
        if (p >= r){
            return;
        }
        //取p到r的中间位置q
        int q = p + (r - p)/2;
        //分治递归
        mergeSortInterlly(a, p, q);
        mergeSortInterlly(a, q+1, r);
        //将A[p...q]和A[q+1...r]合并为A[p...r]
        merge(a, p, q, r);
    }

    private static void merge(int[] a, int p, int q, int r){
        int i = p;
        int j = q+1;
        int k = 0;
        //申请一个跟a[p...r]一样的临时数组
        int[] temp = new int[r-p+1];
        while (i<=q && j<=r){
            if (a[i] <= a[j]){
                temp[k++] = a[i++];
            }else {
                temp[k++] = a[j++];
            }
        }
        //判断哪个子数组中有剩余的数据
        int start = i;
        int end = q;
        if (j <= r){
            start = j;
            end = r;
        }
        //将剩余的数据拷贝到临时数组temp
        while (start <= end){
            temp[k++] =  a[start++];
        }
        //将temp中的数组拷贝到a[p...r]
        for (i = 0; i <= r-p; i++){
            a[p+i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 10, 8};
        AllUtil.printOneArr(a);
        MergeSort.mergeSort(a);
        AllUtil.printOneArr(a);
    }
}



















