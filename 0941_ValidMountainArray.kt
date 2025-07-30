package com.burainex.leetcodesolutions

/*
 * 941. Valid Mountain Array
 * URL: https://leetcode.com/problems/valid-mountain-array/description/
 *
 * Description:
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * Recall that arr is a mountain array if and only if:
 *  -   arr.length >= 3
 *  -   There exists some i with 0 < i < arr.length - 1 such that:
 *          -   arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 *          -   arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 * Constraints:
 * 1 <= arr.length <= 10^4
 * 0 <= arr[i] <= 10^4
 *
 * Example:
 * Input: arr = [0,3,2,1]
 * Output: true
 */

fun validMountainArray(arr: IntArray): Boolean {
    val n = arr.size
    var i = 0

    if (n < 3) return false

    while (i < n - 1 && arr[i] < arr[i + 1]) {
        i++
    }

    if (i == 0 || i == n - 1) return false

    while (i < n - 1 && arr[i] > arr[i + 1]) {
        i++
    }

    return i == n - 1
}

fun main() {
    val example = intArrayOf(0, 3, 2, 1)
    print(
        validMountainArray(example)
    )
}