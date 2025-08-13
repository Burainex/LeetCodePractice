package com.burainex.leetcodesolutions

/*
 * 326. Power of Three
 * URL: https://leetcode.com/problems/power-of-three/description/
 *
 * Description:
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * An integer n is a power of three, if there exists an integer x such that n == 3^x.
 *
 * Constraints:
 * -2^31 <= n <= 2^31 - 1
 *
 * Example:
 * Input: n = 27
 * Output: true
 * Explanation: 27 = 3^3
 */


//Largest power of 3 in the integer range is 3^19 = 1162261467
fun isPowerOfThree(n: Int): Boolean = n > 0 && 1162261467 % n == 0

fun main() {
    print(
        isPowerOfThree(27)
    )
}