package com.burainex.leetcodesolutions

/*
 * 189. Rotate Array
 * URL: https://leetcode.com/problems/rotate-array/description/
 *
 * Description:
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 * Constraints:
 * 1 <= nums.length <= 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 * 0 <= k <= 10^5
 *
 * Example:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

fun rotate(nums: IntArray, k: Int): Unit {
    val steps = k % nums.size
    if (steps == 0 || nums.size <= 1) return

    fun reverse(start: Int, end: Int) {
        var left = start
        var right = end

        while (left < right) {
            val tmp = nums[left]
            nums[left++] = nums[right]
            nums[right--] = tmp
        }
    }

    reverse(0, nums.lastIndex)
    reverse(0, steps - 1)
    reverse(steps, nums.lastIndex)
}


