package com.zhaoyimin.algorithm.A_sorting_basic.B_selection_sort_using_comparable;

/**
 * Created by zhaoyimin on 2018/4/25.
 */
public class Student implements Comparable<Student> {

    private String name;
    private int score;


    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * 重新比较方法，比较分数和姓名
     * @param o
     * @return
     */
    public int compareTo(Student other) {
        if (this.score != other.score)
            return this.score < other.score ? -1 : 1;
        else
            return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("student:{name:").append(this.name).append(",score:").append(this.score).append("}");
        return stringBuilder.toString();
    }
}
