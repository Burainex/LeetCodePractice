package com.burainex.leetcodesolutions

/*
 * 209. Minimum Size Subarray Sum
 * URL: https://leetcode.com/problems/minimum-size-subarray-sum/description/
 *
 * Description:
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
 * whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 *
 * Constraints:
 * 1 <= target <= 10^9
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^4
 *
 * Example:
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 */

fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var minLength = Int.MAX_VALUE
    var sum = 0
    var left = 0

    nums.indices.forEach { right ->
        if (nums[right] >= target) return 1

        sum += nums[right]

        while (sum >= target) {
            minLength = minOf(minLength, right - left + 1)
            sum -= nums[left++]
        }
    }

    return if (minLength == Int.MAX_VALUE) 0 else minLength
}

fun main() {
    val target = 7
    val nums = intArrayOf(2, 3, 1, 2, 4, 3)

    print(
        minSubArrayLen(target, nums)
    )
}