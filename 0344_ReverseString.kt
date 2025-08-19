package com.burainex.leetcodesolutions

/*
 * 344. Reverse String
 * URL: https://leetcode.com/problems/reverse-string/description/
 *
 * Description:
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Constraints:
 * 1 <= s.length <= 10^5
 * s[i] is a printable ascii character.
 *
 * Example:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */

fun reverseString(s: CharArray): Unit {
    var left = 0
    var right = s.lastIndex

    while (left < right) {
        val temp = s[left]
        s[left++] = s[right]
        s[right--] = temp
    }
}