package com.study.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static  void bubbleSort(int[] arr) {
        //获取数组长度
        int size = arr.length;

        if (size<=1)return;

        for (int i = 0; i < size; i++) {
            //定义一个临时变量
            int temp;
            //提前退出冒泡循环标志
            boolean flag = false;
            int len = size - i - 1;
            for (int j = 0; j < len; j++) {
                //如果成立则交换位置
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //数据交换
                    flag = true;
                }
            }
            //遍历数组
            for (int k = 0; k < size; k++) {
                if (k== size-1){
                    System.out.println(arr[k]);
                }else {
                    System.out.print(arr[k] + "-");
                }
            }
            //无数据交换,数据已经是有序的,退出
            if (!flag){
                break;
            }
        }
    }
    public static void main(String[] args){

        int[] arr = {5,3,6,3,1,0,7};
        bubbleSort(arr);
    }

}
