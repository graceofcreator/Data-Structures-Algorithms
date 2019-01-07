package com.study.sort;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int size = arr.length;
        if (size <= 1)return;

        for (int i = 1; i < size; i++) {
            //定义一个临时变量
            int value = arr[i];
            int j = i -1;
            for (; j>=0 ; --j) {
                if(arr[j] > value){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            System.out.println(j);
            arr[j+1] = value;

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
        int[] arr = {3,5,4,1,2,6};
        insertionSort(arr);
    }

}
