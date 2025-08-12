package com.burainex.leetcodesolutions

/*
 * 498. Diagonal Traverse
 * URL: https://leetcode.com/problems/diagonal-traverse/description/
 *
 * Description:
 * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
 *
 * Constraints:
 * m == mat.length
 * n == mat[i].length
 * 1 <= m * n <= 10^4
 * -10^5 <= mat[i][j] <= 10^5
 *
 * Example:
 * Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,4,7,5,3,6,8,9]
 */

fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
    val maxRow = mat.lastIndex
    val maxCol = mat[0].lastIndex
    val result = mutableListOf<Int>()

    (0..maxRow + maxCol).forEach { diagonalIndex ->
        val currentDiagonal = mutableListOf<Int>()

        (0..maxRow).forEach { row ->
            val col = diagonalIndex - row

            if (col >= 0 && col <= maxCol) {
                currentDiagonal.add(mat[row][col])
            }
        }

        if (diagonalIndex % 2 == 0) {
            currentDiagonal.reverse()
        }

        result.addAll(currentDiagonal)
    }

    return result.toIntArray()
}

fun main() {
    val example = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    print(
        findDiagonalOrder(example).contentToString()
    )
}
