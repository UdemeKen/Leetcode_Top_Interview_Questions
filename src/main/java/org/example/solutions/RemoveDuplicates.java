package org.example.solutions;

public class RemoveDuplicates {
    public int removeDuplicate(int[] nums) {
        int lastUniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[lastUniqueIndex] != nums[i]) {
                nums[lastUniqueIndex + 1] = nums[i];
            lastUniqueIndex++;
            }
        }
        return lastUniqueIndex + 1;
    }
}
