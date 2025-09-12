package com.burainex.leetcodesolutions

/*
 * 509. Fibonacci Number
 * URL: https://leetcode.com/problems/fibonacci-number/description/
 *
 * Description:
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 *
 * Constraints:
 * 0 <= n <= 30
 *
 * Example:
 * Input: n = 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3
 */

fun fib(n: Int): Int {
    var (a, b) = 0 to 1

    repeat(n) {
        a = b.also { b = a + b }
    }

    return a
}

fun main() {
    print(
        fib(4)
    )
}