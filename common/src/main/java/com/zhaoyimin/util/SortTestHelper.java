package com.zhaoyimin.util;

import java.lang.reflect.Method;

/**
 * Created by zhaoyimin on 2018/4/25.
 */
public class SortTestHelper {

    private SortTestHelper(){}

    /**
     * 自动生成Integer数组
     * @param n
     * @param rangeL
     * @param rangeR
     * @return
     */
    public static Integer[] generateRandomArray(int n,int rangeL,int rangeR) {
        if (rangeL >= rangeR) {
            throw new IllegalArgumentException("rangR must be greater than rangL");
        }

        Integer[] nums = new Integer[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Integer((int)(Math.random() * (rangeR - rangeL + 1) + rangeL));
        }
        return nums;
    }

    /**
     * 打印数组
     * @param arrs
     */
    public static void printArray(Object[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    /**
     * 校验数组是否是从小到大
     * @param arrs
     */
    public static boolean verifyToBig(Comparable[] arrs) {
        boolean result = true;
        for (int i = 1; i < arrs.length; i++) {
            if (arrs[i - 1].compareTo(arrs[i]) > 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * 校验数组是否是从大到小
     * @param arrs
     */
    public static boolean verifyToSmall(Comparable[] arrs) {
        boolean result = true;
        for (int i = 1; i < arrs.length; i++) {
            if (arrs[i - 1].compareTo(arrs[i]) < 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void testSort(String sortClassName,String sortMethodName,Comparable[] arrs) {

        try {
            //1.获取排序类
            Class sortClass = Class.forName(sortClassName);
            //2.获取排序方法
            Method sortMethod = sortClass.getMethod(sortMethodName,new Class[]{Comparable[].class});
            //3.获取排序方法
            Object[] objects = new Object[]{arrs};

            long startTime = System.currentTimeMillis();
            sortMethod.invoke(null,objects);
            long endTime = System.currentTimeMillis();

            if (!verifyToBig(arrs)) {
                throw new IllegalArgumentException(sortClass.getSimpleName() + "is error");
            }

            System.out.println(sortClass.getSimpleName()+ ":" + (double)(endTime - startTime)/1000 + "s");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
