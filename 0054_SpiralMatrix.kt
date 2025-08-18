package com.burainex.leetcodesolutions

/*
 * 54. Spiral Matrix
 * URL: https://leetcode.com/problems/spiral-matrix/description/
 *
 * Description:
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 *
 * Constraints:
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 10
 * -100 <= matrix[i][j] <= 100
 *
 * Example:
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    var top = 0
    var bottom = matrix.lastIndex
    var left = 0
    var right = matrix[0].lastIndex

    val result = mutableListOf<Int>()

    while (top <= bottom && left <= right) {
        (left..right).forEach { col ->
            result.add(matrix[top][col])
        }
        top++

        (top..bottom).forEach { row ->
            result.add(matrix[row][right])
        }
        right--

        if (top <= bottom) {
            (right downTo left).forEach { col ->
                result.add(matrix[bottom][col])
            }
            bottom--
        }

        if (left <= right) {
            (bottom downTo top).forEach { row ->
                result.add(matrix[row][left])
            }
            left++
        }
    }

    return result
}

fun main() {
    val example = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12)
    )

    print(
        spiralOrder(example)
    )
}