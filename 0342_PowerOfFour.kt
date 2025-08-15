package com.burainex.leetcodesolutions

/*
 * 342. Power of Four
 * URL: https://leetcode.com/problems/power-of-four/description/
 *
 * Description:
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 * An integer n is a power of four, if there exists an integer x such that n == 4^x.
 *
 * Constraints:
 * -2^31 <= n <= 2^31 - 1
 *
 * Example:
 * Input: n = 16
 * Output: true
 */

fun isPowerOfFour(n: Int): Boolean {
    var num = n

    while (num > 1 && num % 4 == 0) {
        num /= 4
    }

    return num == 1
}

fun main() {
    val example = 16
    print(
        isPowerOfFour(example)
    )
}