package com.burainex.leetcodesolutions

/*
 * 905. Sort Array By Parity
 * URL: https://leetcode.com/problems/sort-array-by-parity/description/
 *
 * Description:
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 *
 * Constraints:
 * 1 <= nums.length <= 5000
 * 0 <= nums[i] <= 5000
 *
 * Example:
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */

fun sortArrayByParity(nums: IntArray): IntArray {
    var left = 0
    var right = nums.size - 1

    while (left < right) {
        when {
            nums[left] % 2 == 0 -> left++
            nums[right] % 2 == 1 -> right--
            else -> {
                val tmp = nums[left]
                nums[left++] = nums[right]
                nums[right--] = tmp
            }
        }
    }

    return nums
}

fun main() {
    val example = intArrayOf(3, 1, 2, 4)
    print(
        sortArrayByParity(example).contentToString()
    )
}