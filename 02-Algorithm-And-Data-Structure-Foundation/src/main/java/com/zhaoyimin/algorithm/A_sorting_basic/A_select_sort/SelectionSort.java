package com.zhaoyimin.algorithm.A_sorting_basic.A_select_sort;

/**
 * 基本选择排序，只支持int类型
 * Created by zhaoyimin on 2018/4/25.
 */
public class SelectionSort {

    /**
     * 选择排序
     * @param nums
     */
    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
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
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {72,34,58,79,23,54,90,12};
        sort(nums);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++)
            stringBuilder.append(nums[i]).append(" < ");
        System.out.println(stringBuilder.toString());
    }
}
