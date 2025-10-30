package com.burainex.leetcodesolutions

import kotlin.math.abs

/*
 * 50. Pow(x, n)
 * URL: https://leetcode.com/problems/powx-n/description/
 *
 * Description:
 * Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
 *
 * Constraints:
 * -100.0 < x < 100.0
 * -2^31 <= n <= 2^31-1
 * n is an integer.
 * Either x is not zero or n > 0.
 * -10^4 <= x^n <= 10^4
 *
 * Example:
 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 */

fun myPow(x: Double, n: Int): Double {
    if (x == 0.0) return 0.0
    if (n == 0) return 1.0

    var answer = 1.0
    var base = if (n < 0) 1 / x else x
    var exponent = abs(n.toLong())

    while (exponent != 0L) {
        if (exponent % 2 != 0L) {
            answer *= base
        }
        base *= base
        exponent /= 2
    }

    return answer
}

fun main() {
    print(
        myPow(2.10000, 3)
    )
}