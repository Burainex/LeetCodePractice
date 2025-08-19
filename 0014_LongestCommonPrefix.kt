package com.burainex.leetcodesolutions

/*
 * 14. Longest Common Prefix
 * URL: https://leetcode.com/problems/longest-common-prefix/description/
 *
 * Description:
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Constraints:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters if it is non-empty.
 *
 * Example:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 */

fun longestCommonPrefix(strs: Array<String>): String {
    val reference = strs[0]

    reference.indices.forEach { charIndex ->
        strs.asSequence()
            .drop(1)
            .forEach { other ->
                val mismatch =
                    charIndex > other.lastIndex || reference[charIndex] != other[charIndex]

                if (mismatch) {
                    return reference.take(charIndex)
                }
            }
    }

    return reference
}

fun main() {
    val example = arrayOf(
        "flower",
        "flow",
        "flight"
    )

    print(
        longestCommonPrefix(example)
    )
}