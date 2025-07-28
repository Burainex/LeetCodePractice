package com.burainex.leetcodesolutions

/*
 * 1089. Duplicate Zeros
 * URL: https://leetcode.com/problems/duplicate-zeros/description/
 *
 * Description:
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
 *
 * Constraints:
 * 1 <= arr.length <= 10^4
 * 0 <= arr[i] <= 9
 *
 * Example:
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 */

fun duplicateZeros(arr: IntArray): Unit {
    val n = arr.size
    val zeros = arr.count { it == 0 }

    var readIndex = n - 1
    var writeIndex = n + zeros - 1

    while (readIndex >= 0) {
        when {
            arr[readIndex] == 0 -> {
                if (writeIndex < n) arr[writeIndex] = 0
                writeIndex--
                if (writeIndex < n) arr[writeIndex] = 0
            }

            else -> {
                if (writeIndex < n) arr[writeIndex] = arr[readIndex]
            }
        }
        readIndex--
        writeIndex--
    }
}