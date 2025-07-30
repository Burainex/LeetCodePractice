package com.burainex.leetcodesolutions

/*
 * 283. Move Zeroes
 * URL: https://leetcode.com/problems/move-zeroes/description/
 *
 * Description:
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 *
 * Constraints:
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 *
 * Example:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

fun moveZeroes(nums: IntArray): Unit {
    var writeIndex = 0

    nums.forEach { num ->
        if (num != 0) nums[writeIndex++] = num
    }

    (writeIndex..<nums.size).forEach { index ->
        nums[index] = 0
    }
}