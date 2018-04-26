package com.zhaoyimin.algorithm.A_sorting_basic.F_optimized_selection_sort;

import com.zhaoyimin.util.SortTestHelper;

/**
 * 优化选择排序
 * Created by zhaoyimin on 2018/4/25.
 */
public class SelectionSort {

    /**
     * 选择排序优化
     * @param nums
     */
    public static void sort(Comparable[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int minIndex = left,maxIndex = right;

            //如果此时right<left 直接替换
            if (nums[minIndex].compareTo(nums[maxIndex]) > 0)
                swap(nums,minIndex,maxIndex);

            for (int i = left + 1; i < right; i++)
                if (nums[i].compareTo(nums[minIndex]) < 0)
                    minIndex = i;
                else if(nums[i].compareTo(nums[maxIndex]) > 0)
                    maxIndex = i;

            swap(nums,left,minIndex);
            swap(nums,right,maxIndex);

            left ++;
            right -- ;
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
        Integer[] nums = SortTestHelper.generateNearlyOrderedArray(100000,20);

        SortTestHelper.testSort("com.zhaoyimin.algorithm.A_sorting_basic.F_optimized_selection_sort.SelectionSort","sort",nums);
    }
}
