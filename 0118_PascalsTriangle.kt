package com.burainex.leetcodesolutions

/*
 * 118. Pascal's Triangle
 * URL: https://leetcode.com/problems/pascals-triangle/description/
 *
 * Description:
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 * Constraints:
 * 1 <= numRows <= 30
 *
 * Example:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

fun generate(numRows: Int): List<List<Int>> {
    val triangle = mutableListOf(listOf(1))

    (1 until numRows).forEach { i ->
        val prev = triangle[i - 1]
        val curr = MutableList(i + 1) { j ->
            when (j) {
                0, i -> 1
                else -> prev[j - 1] + prev[j]
            }
        }

        triangle.add(curr)
    }

    return triangle
}

fun main() {
    print(
        generate(5)
    )
}