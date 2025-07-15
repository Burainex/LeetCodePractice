package com.burainex.leetcodesolutions

/*
 * 1480. Running Sum of 1d Array
 * URL: https://leetcode.com/problems/running-sum-of-1d-array/description/
 *
 * Description:
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 *
 * Constraints:
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 *
 * Example:
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

fun runningSum(nums: IntArray): IntArray =
    nums.runningReduce { acc, num -> acc + num }.toIntArray()

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    println(
        runningSum(nums).contentToString()
    )
}