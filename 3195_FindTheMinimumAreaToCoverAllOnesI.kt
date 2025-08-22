package com.burainex.leetcodesolutions

/*
 * 3195. Find the Minimum Area to Cover All Ones I
 * URL: https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/description/
 *
 * Description:
 * You are given a 2D binary array grid. Find a rectangle with horizontal and vertical sides with the smallest area,
 * such that all the 1's in grid lie inside this rectangle.
 * Return the minimum possible area of the rectangle.
 *
 * Constraints:
 * 1 <= grid.length, grid[i].length <= 1000
 * grid[i][j] is either 0 or 1.
 * The input is generated such that there is at least one 1 in grid.
 *
 * Example:
 * Input: grid = [[0,1,0],[1,0,1]]
 * Output: 6
 * Explanation:
 * The smallest rectangle has a height of 2 and a width of 3, so it has an area of 2 * 3 = 6.
 */

fun minimumArea(grid: Array<IntArray>): Int {
    var minRow = Int.MAX_VALUE
    var maxRow = Int.MIN_VALUE
    var minCol = Int.MAX_VALUE
    var maxCol = Int.MIN_VALUE

    (0..grid.lastIndex).forEach { row ->
        (0..grid[0].lastIndex).forEach { col ->
            if (grid[row][col] == 1) {
                minRow = minOf(minRow, row)
                minCol = minOf(minCol, col)
                maxRow = maxOf(maxRow, row)
                maxCol = maxOf(maxCol, col)
            }
        }
    }

    val height = maxRow - minRow + 1
    val width = maxCol - minCol + 1

    return height * width
}

fun main() {
    val example = arrayOf(
        intArrayOf(0, 1, 0),
        intArrayOf(1, 0, 1)
    )
    print(
        minimumArea(example)
    )
}