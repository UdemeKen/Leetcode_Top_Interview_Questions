package org.example;

import org.example.solutions.RemoveDuplicates;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9};
        RemoveDuplicates rd = new RemoveDuplicates();
        int result = rd.removeDuplicate(nums);
        System.out.println(result);
    }
}
