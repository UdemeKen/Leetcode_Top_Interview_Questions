package org.example;

import org.example.solutions.RotateArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray rotateArray = new RotateArray();
        int[] result = rotateArray.rotate(nums, k);
        System.out.println(Arrays.toString(result));
    }
}
