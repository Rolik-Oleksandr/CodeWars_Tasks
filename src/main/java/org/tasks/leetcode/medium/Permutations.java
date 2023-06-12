package org.tasks.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * Example 2:
 *
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 * Example 3:
 *
 * Input: nums = [1]
 * Output: [[1]]
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();


        permuteHelper(nums, result, new ArrayList<>());

        return result;

    }


    private void permuteHelper(int nums[], List<List<Integer>> result, List<Integer> temp){

        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }


        for(int num: nums){

            if(temp.contains(num)){
                continue;
            }

            temp.add(num);

            permuteHelper(nums, result, temp);

            temp.remove(temp.size()-1);
        }

    }
}
