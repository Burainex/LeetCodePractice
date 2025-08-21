package com.burainex.leetcodesolutions

/*
 * 151. Reverse Words in a String
 * URL: https://leetcode.com/problems/reverse-words-in-a-string/description/
 *
 * Description:
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include any extra spaces.
 *
 * Constraints:
 * 1 <= s.length <= 10^4
 * s contains English letters (upper-case and lower-case), digits, and spaces ' '.
 * There is at least one word in s.
 *
 * Example:
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */

fun reverseWords(s: String): String {
    val result = StringBuilder()
    var i = s.lastIndex

    while (i >= 0) {
        if (s[i] == ' '){
            i--
            continue
        }

        val end = i

        while (i >= 0 && s[i] != ' ') i--

        if (result.isNotEmpty()) result.append(' ')

        for (j in i + 1..end) result.append(s[j])
    }

    return result.toString()
}

fun main() {
    val example = "a good   example"
    print(
        reverseWords(example)
    )
}