package com.study.sort;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        int size = arr.length;
        if (size<=1)return;

        for (int i = 0; i < size; i++) {
           int min = i;
           int j = i+1;
           for (;j<size;j++){
               if (arr[j] < arr[min]){
                   min = j;
               }
           }
           if(min>i){
               int temp = arr[i];
               arr[i] = arr[min];
               arr[min]=temp;
           }
            //遍历数组
            for (int k = 0; k < size; k++) {
                if (k== size-1){
                    System.out.println(arr[k]);
                }else {
                    System.out.print(arr[k] + "-");
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {3,5,4,1,2,8,6,7};
        selectionSort(arr);
    }
}
