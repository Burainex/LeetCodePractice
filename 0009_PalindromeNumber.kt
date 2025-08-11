package com.burainex.leetcodesolutions

/*
 * 9. Palindrome Number
 * URL: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 *
 * Description:
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Constraints:
 * -2^31 <= x <= 2^31 - 1
 *
 * Example:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 */

fun isPalindrome(x: Int): Boolean {
    var original = x
    var reversed = 0

    if (original < 0) return false
    if (original != 0 && original % 10 == 0) return false

    while (reversed < original) {
        reversed = reversed * 10 + original % 10
        original /= 10
    }

    return original == reversed || original == reversed / 10
}

fun main() {
    print(
        isPalindrome(100)
    )
}