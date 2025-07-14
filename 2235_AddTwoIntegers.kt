package com.burainex.leetcodesolutions

/*
 * 2235. Add Two Integers
 * URL: https://leetcode.com/problems/add-two-integers/description/
 *
 * Description:
 * Given two integers num1 and num2, return the sum of the two integers.
 *
 * Constraints:
 * -100 <= num1, num2 <= 100
 *
 * Example:
 * Input: num1 = 12, num2 = 5
 * Output: 17
 * Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.
 */

fun sum(num1: Int, num2: Int): Int = num1 + num2

fun main() {
    print(
        sum(12, 5)
    )
}