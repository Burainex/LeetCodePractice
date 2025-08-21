package com.burainex.leetcodesolutions

/*
 * 557. Reverse Words in a String III
 * URL: https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 *
 * Description:
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 * Constraints:
 * 1 <= s.length <= 5 * 10^4
 * s contains printable ASCII characters.
 * s does not contain any leading or trailing spaces.
 * There is at least one word in s.
 * All the words in s are separated by a single space.
 *
 * Example:
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 */

fun reverseWordsIII(s: String): String = buildString {
    fun reverseAppend(from: Int, toInclusive: Int) {
        (toInclusive downTo from).forEach { i ->
            append(s[i])
        }
    }

    var start = 0

    s.indices.forEach { i ->
        if (s[i] == ' ') {
            reverseAppend(start, i - 1)
            append(' ')
            start = i + 1
        }
    }

    reverseAppend(start, s.lastIndex)
}

fun main() {
    val example = "Let's take LeetCode contest"
    print(
        reverseWordsIII(example)
    )
}