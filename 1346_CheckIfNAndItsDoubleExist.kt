package com.burainex.leetcodesolutions

/*
 * 1346. Check If N and Its Double Exist
 * URL: https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
 *
 * Description:
 * Given an array arr of integers, check if there exist two indices i and j such that :
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 * Constraints:
 * 2 <= arr.length <= 500
 * -10^3 <= arr[i] <= 10^3
 *
 * Example:
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 */

fun checkIfExist(arr: IntArray): Boolean {
    val visited = mutableSetOf<Int>()

    arr.forEach { num ->
        when {
            visited.contains(num * 2) || (num % 2 == 0 && visited.contains(num / 2)) -> return true
            else -> visited.add(num)
        }
    }

    return false
}

fun main() {
    val example = intArrayOf(10, 2, 5, 3)
    print(
        checkIfExist(example)
    )
}