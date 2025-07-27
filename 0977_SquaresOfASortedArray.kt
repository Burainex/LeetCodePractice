package com.burainex.leetcodesolutions

import kotlin.math.abs

/*
 * 977. Squares of a Sorted Array
 * URL: https://leetcode.com/problems/squares-of-a-sorted-array/description/
 *
 * Description:
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 * Constraints:
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums is sorted in non-decreasing order.
 *
 * Example:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 */

fun sortedSquares(nums: IntArray): IntArray {
    val n = nums.size
    val result = IntArray(n)
    var left = 0
    var right = n - 1
    var i = n - 1

    while (left <= right) {
        if (abs(nums[left]) < abs(nums[right])) {
            result[i] = nums[right] * nums[right]
            right--
        } else {
            result[i] = nums[left] * nums[left]
            left++
        }
        i--
    }

    return result
}

fun main() {
    val example = intArrayOf(-4, -1, 0, 3, 10)
    print(
        sortedSquares(example).contentToString()
    )
}