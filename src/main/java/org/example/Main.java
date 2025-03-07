package org.example;

import org.example.solutions.ContainsDuplicate;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ContainsDuplicate cd = new ContainsDuplicate();
        boolean result = cd.containDuplicate(nums);
        System.out.println(result);
    }
}
