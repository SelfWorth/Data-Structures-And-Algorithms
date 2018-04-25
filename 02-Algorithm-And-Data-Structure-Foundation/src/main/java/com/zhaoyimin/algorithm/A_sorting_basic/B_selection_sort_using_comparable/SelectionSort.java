package com.zhaoyimin.algorithm.A_sorting_basic.B_selection_sort_using_comparable;

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
        Integer[] nums = {72,34,58,79,23,54,90,12};
        sort(nums);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++)
            stringBuilder.append(nums[i]).append(" < ");

        //测试Double数组
        Double[] floats = {2.3,2.7,9.1,12.5,23.1,12.3,76.1,56.23,23.23};
        sort(floats);
        stringBuilder.append("\n\n");
        for (int i = 0; i < floats.length; i++) {
            stringBuilder.append(floats[i]).append(" < ");
        }

        //测试对象
        Student[] students = new Student[5];
        students[0] = new Student("A",12);
        students[1] = new Student("Y",34);
        students[2] = new Student("D",23);
        students[3] = new Student("C",23);
        students[4] = new Student("E",23);

        stringBuilder.append("\n\n");
        sort(students);
        for (int i = 0; i < students.length; i++) {
            stringBuilder.append(students[i]).append(" < ");
        }

        System.out.println(stringBuilder.toString());


    }
}
