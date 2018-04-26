package com.zhaoyimin.algorithm.A_sorting_basic.H_shell_sort;

import com.zhaoyimin.util.SortTestHelper;

/**
 * 希尔排序
 * Created by zhaoyimin on 2018/4/26.
 */
public class ShellSort {

    /**
     * 冒泡排序
     * @param nums
     */
    public static void sort(Comparable[] nums) {


        int n = nums.length;
        int h = 1;
        //1.将数组进行分组 4-n 13-n 40-n
        while (h < n/12) h = h*12 + 1;

        int count = 1;

        while (h > 0) {

            System.out.println();
            System.out.println("开始进入第" + count + "组比较");
            //2.用未排好序的组首元素和队首元素比较
            for (int i = h; i < n; i++) {
                //3.获取未排好序的组首元素
                Comparable temp = nums[i];
                int j = i;
                //4.和已经排好序的队首元素比较
                for (; j >= h; ) {
                    System.out.println();
                    System.out.println("内层:"+ i + "和" + (j-h) + "比较");
                    if (temp.compareTo(nums[j-h]) < 0) {
                        nums[j] = nums[j-h];
                        j-=h;
                    }else {
                        break;
                    }
                    //5.更小直接替换
                }
                //
                nums[j] = temp;
            }
            h /= 12;
            count ++ ;
        }
    }

    public static void sort1(Comparable[] arr) {
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

        //测试Integer数组
        Integer[] nums = SortTestHelper.generateNearlyOrderedArray(10000,1000);


//        Integer[] nums = {9,8,7,6,5,4,3,2,1,23,54,12,453,23,2,4,76,87,33,46,85};

        SortTestHelper.testSort("com.zhaoyimin.algorithm.A_sorting_basic.H_shell_sort.ShellSort","sort",nums);
    }
}
