package com.burainex.leetcodesolutions

/*
 * 414. Third Maximum Number
 * URL: https://leetcode.com/problems/third-maximum-number/description/
 *
 * Description:
 * Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
 *
 * Constraints:
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 *
 * Example:
 * Input: nums = [2,2,3,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2 (both 2's are counted together since they have the same value).
 * The third distinct maximum is 1.
 */

fun thirdMax(nums: IntArray): Int {
    var first = Long.MIN_VALUE
    var second = Long.MIN_VALUE
    var third = Long.MIN_VALUE

    nums.forEach { num ->
        val numLong = num.toLong()
        if (numLong == first || numLong == second || numLong == third) return@forEach

        when {
            numLong > first -> {
                third = second
                second = first
                first = numLong
            }

            numLong > second -> {
                third = second
                second = numLong
            }

            numLong > third -> {
                third = numLong
            }
        }
    }

    return if (third == Long.MIN_VALUE) first.toInt() else third.toInt()
}

fun main() {
    val example = intArrayOf(2, 2, 3, 1)

    print(
        thirdMax(example)
    )
}