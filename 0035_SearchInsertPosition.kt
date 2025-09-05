package com.burainex.leetcodesolutions

/*
 * 35. Search Insert Position
 * URL: https://leetcode.com/problems/search-insert-position/description/
 *
 * Description:
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Constraints:
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums contains distinct values sorted in ascending order.
 * -10^4 <= target <= 10^4
 *
 * Example:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 */

fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    while (left <= right) {
        val mid = (left + right) / 2

        when {
            target < nums[mid] -> right = mid - 1
            target > nums[mid] -> left = mid + 1
            else -> return mid
        }
    }

    return left
}

fun main() {
    val example = intArrayOf(1, 3, 5, 6)

    print(
        searchInsert(example, 5)
    )
}