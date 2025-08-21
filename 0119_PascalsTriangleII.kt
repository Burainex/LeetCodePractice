package com.burainex.leetcodesolutions

/*
 * 119. Pascal's Triangle II
 * URL: https://leetcode.com/problems/pascals-triangle-ii/description/
 *
 * Description:
 * Given an integer rowIndex, return the rowIndex^th (0-indexed) row of the Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Constraints:
 * 0 <= rowIndex <= 33
 *
 * Example:
 * Input: rowIndex = 3
 * Output: [1,3,3,1]
 */

fun getRow(rowIndex: Int): List<Int> {
    val row = MutableList(rowIndex + 1) { 1 }

    for (i in 2..rowIndex) {
        for (j in i - 1 downTo 1) {
            row[j] = row[j] + row[j - 1]
        }
    }

    return row
}

fun main() {
    print(
        getRow(3)
    )
}