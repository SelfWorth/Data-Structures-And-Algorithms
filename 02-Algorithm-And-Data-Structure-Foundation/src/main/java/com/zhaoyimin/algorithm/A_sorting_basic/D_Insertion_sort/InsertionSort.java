package com.zhaoyimin.algorithm.A_sorting_basic.D_Insertion_sort;

import com.zhaoyimin.util.SortTestHelper;

/**
 * 插入排序
 * Created by zhaoyimin on 2018/4/25.
 */
public class InsertionSort {

    private InsertionSort(){}

    public static void sort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i;  j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                swap(arr,j,j-1);
            }
        }
    }


    /**
     * 交换元素
     * @param nums
     * @param i
     * @param j
     */
    public static void swap(Comparable[] nums, int i, int j) {
        Comparable temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] nums = SortTestHelper.generateRandomArray(10000,0,10000);

        SortTestHelper.testSort("com.zhaoyimin.algorithm.A_sorting_basic.D_Insertion_sort.InsertionSort","sort",nums);
    }

}
