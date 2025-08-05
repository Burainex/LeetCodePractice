package com.burainex.leetcodesolutions

/*
 * 66. Plus One
 * URL: https://leetcode.com/problems/plus-one/description/
 *
 * Description:
 * You are given a large integer represented as an integer array digits, where each digits[i] is the i^th digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 *
 * Example:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */

fun plusOne(digits: IntArray): IntArray {
    digits.indices.reversed().forEach { index ->
        digits[index]++

        if (digits[index] < 10) return digits

        digits[index] = 0
    }

    return IntArray(digits.size + 1).apply { this[0] = 1 }
}

fun main() {
    val example = intArrayOf(9)
    print(
        plusOne(example).contentToString()
    )
}