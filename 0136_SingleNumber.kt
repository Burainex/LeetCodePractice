package com.burainex.leetcodesolutions

/*
 * 136. Single Number
 * URL: https://leetcode.com/problems/single-number/description/
 *
 * Description:
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Constraints:
 * 1 <= nums.length <= 3 * 10^4
 * -3 * 10^4 <= nums[i] <= 3 * 10^4
 * Each element in the array appears twice except for one element which appears only once.
 *
 * Example:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 */

fun singleNumber(nums: IntArray): Int = nums.fold(0) { acc, num -> acc xor num }

fun main() {
    val example = intArrayOf(4, 1, 2, 1, 2)
    print(
        singleNumber(example)
    )
}