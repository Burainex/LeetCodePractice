package com.burainex.leetcodesolutions

/*
 * 392. Is Subsequence
 * URL: https://leetcode.com/problems/is-subsequence/description/
 *
 * Description:
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string
 * by deleting some (can be none) of the characters without disturbing the relative
 * positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * Constraints:
 * 0 <= s.length <= 100
 * 0 <= t.length <= 104
 * s and t consist only of lowercase English letters.
 *
 * Example:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 */

fun isSubsequence(s: String, t: String): Boolean {
    var i = 0
    var j = 0

    while (i < s.length && j < t.length) {
        if (s[i] == t[j]) i++
        j++
    }

    return i == s.length
}

fun main() {
    val s = "abs"
    val t = "ahbgdc"

    print(
        isSubsequence(s, t)
    )
}