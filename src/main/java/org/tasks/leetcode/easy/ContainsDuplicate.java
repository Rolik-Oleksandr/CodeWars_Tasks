package org.tasks.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        if (nums.length == 0) {
            return result;
        }

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if(!set.add(i)) {
                result = true;
            }
        }
        return result;
    }
}
