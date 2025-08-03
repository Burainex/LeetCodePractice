package com.burainex.leetcodesolutions

/*
 * 448. Find All Numbers Disappeared in an Array
 * URL: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 *
 * Description:
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 * Constraints:
 * n == nums.length
 * 1 <= n <= 10^5
 * 1 <= nums[i] <= n
 *
 * Example:
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 */

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val disappeared = mutableListOf<Int>()

    nums.forEach { num ->
        val index = kotlin.math.abs(num) - 1
        if (nums[index] > 0) {
            nums[index] = -nums[index]
        }
    }

    nums.indices.forEach { index ->
        if (nums[index] > 0) {
            disappeared.add(index + 1)
        }
    }

    return disappeared
}

fun main() {
    val example = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
    print(
        findDisappearedNumbers(example)
    )
}