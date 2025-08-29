package com.burainex.leetcodesolutions

/*
 * 1. Two Sum
 * URL: https://leetcode.com/problems/two-sum/description/
 *
 * Description:
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Constraints:
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 *
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

fun twoSum1(nums: IntArray, target: Int): IntArray {
    val valueToIndex = mutableMapOf<Int, Int>()

    nums.forEachIndexed { index, num ->
        val needed = target - num

        valueToIndex[needed]?.let {
            return intArrayOf(it, index)
        }

        valueToIndex[num] = index
    }

    throw IllegalArgumentException("No two sum solution")
}