package com.zhaoyimin.algorithm.A_sorting_basic.D_Insertion_sort;

import com.zhaoyimin.util.SortTestHelper;

/**
 * 选择排序，支持泛型
 * Created by zhaoyimin on 2018/4/25.
 */
public class SelectionSort {

    /**
     * 选择排序
     * @param nums
     */
    public static void sort(Comparable[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j].compareTo(nums[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(nums,i,minIndex);
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

        //测试Integer数组
        Integer[] nums = SortTestHelper.generateRandomArray(10000,0,10000);

        SortTestHelper.testSort("com.zhaoyimin.algorithm.A_sorting_basic.D_Insertion_sort.SelectionSort","sort",nums);

    }
}
