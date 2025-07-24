package com.burainex.leetcodesolutions

/*
 * 1299. Replace Elements with Greatest Element on Right Side
 * URL: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
 *
 * Description:
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 * After doing so, return the array.
 *
 * Constraints:
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 *
 * Example:
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 * Explanation:
 * - index 0 --> the greatest element to the right of index 0 is index 1 (18).
 * - index 1 --> the greatest element to the right of index 1 is index 4 (6).
 * - index 2 --> the greatest element to the right of index 2 is index 4 (6).
 * - index 3 --> the greatest element to the right of index 3 is index 4 (6).
 * - index 4 --> the greatest element to the right of index 4 is index 5 (1).
 * - index 5 --> there are no elements to the right of index 5, so we put -1.
 */

fun replaceElements(arr: IntArray): IntArray {
    var max = -1

    (arr.lastIndex downTo 0).forEach { i ->
        val current = arr[i]
        arr[i] = max
        max = maxOf(max, current)
    }

    return arr
}

fun main() {
    val example = intArrayOf(17, 18, 5, 4, 6, 1)
    print(
        replaceElements(example).contentToString()
    )
}