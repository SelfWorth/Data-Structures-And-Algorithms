package com.zhaoyimin.algorithm.A_sorting_basic.E_insertion_sort_advance;

import com.zhaoyimin.util.SortTestHelper;

/**
 * 优化插入排序
 * Created by zhaoyimin on 2018/4/25.
 */
public class InsertionSort {

    private InsertionSort(){}

    public static void sort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Comparable temp = arr[i];
            int j = i;
            for (;  j > 0 && arr[j - 1].compareTo(temp) > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] nums = SortTestHelper.generateNearlyOrderedArray(10000000,1000);

        SortTestHelper.testSort("com.zhaoyimin.algorithm.A_sorting_basic.D_Insertion_sort.InsertionSort","sort",nums);
    }

}
