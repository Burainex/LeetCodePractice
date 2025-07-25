package com.burainex.leetcodesolutions

/*
 * 27. Remove Element
 * URL: https://leetcode.com/problems/remove-element/description/
 *
 * Description:
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed.
 * Then return the number of elements in nums which are not equal to val.
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * - Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * - Return k.
 *
 * Constraints:
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 *
 * Example:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */

fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0

    nums.forEach { num ->
        if (num != `val`) nums[k++] = num
    }

    return k
}

fun main() {
    val example = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)

    println(example.contentToString())
    println(
        removeElement(example, 2)
    )
    println(example.contentToString())
}