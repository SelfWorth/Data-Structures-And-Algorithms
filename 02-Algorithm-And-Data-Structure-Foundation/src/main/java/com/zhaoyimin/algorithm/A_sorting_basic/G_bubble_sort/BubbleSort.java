package com.zhaoyimin.algorithm.A_sorting_basic.G_bubble_sort;

import com.zhaoyimin.util.SortTestHelper;

/**
 * 冒泡排序
 * Created by zhaoyimin on 2018/4/25.
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * @param nums
     */
    public static void sort(Comparable[] nums) {
        int n = nums.length;
        //记录最后一次交换的index
//        int news = 0;
        boolean swapped = false;
        do{
            swapped = false;
//            news = 0;
            for (int i = 1; i < n; i++) {
                if (nums[i - 1].compareTo(nums[i]) > 0) {
                    swap(nums,i,i-1);
//                    news = i;
                    swapped = true;
                }
            }
//            n = news;
        }while (swapped);

    }

    public static void sort1(Comparable[] nums) {
        int n = nums.length;
        //记录最后一次交换的index
        int news = 0;
        do{
            news = 0;
            for (int i = 1; i < n; i++) {
                if (nums[i - 1].compareTo(nums[i]) > 0) {
                    swap(nums,i,i-1);
                    news = i;
                }
            }
            n = news;
        }while (news > 0);

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
        Integer[] nums = SortTestHelper.generateNearlyOrderedArray(10000,20);

        SortTestHelper.testSort("com.zhaoyimin.algorithm.A_sorting_basic.G_bubble_sort.BubbleSort","sort1",nums);
    }
}
