package com.burainex.leetcodesolutions

/*
 * 485. Max Consecutive Ones
 * URL: https://leetcode.com/problems/max-consecutive-ones/description/
 *
 * Description:
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * Constraints:
 * 1 <= nums.length <= 10^5
 * nums[i] is either 0 or 1.
 *
 * Example:
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var maxCount = 0
    var currentCount = 0

    nums.forEach { num ->
        if (num == 1) {
            currentCount++
            maxCount = maxOf(currentCount, maxCount)
        } else currentCount = 0
    }

    return maxCount
}

fun main() {
    val example = intArrayOf(1, 1, 0, 1, 1, 1)
    print(
        findMaxConsecutiveOnes(example)
    )
}