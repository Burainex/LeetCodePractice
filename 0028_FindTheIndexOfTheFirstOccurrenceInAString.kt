package com.burainex.leetcodesolutions

/*
 * 28. Find the Index of the First Occurrence in a String
 * URL: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 *
 * Description:
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Constraints:
 * 1 <= haystack.length, needle.length <= 10^4
 * haystack and needle consist of only lowercase English characters.
 *
 * Example:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 */

fun strStr(haystack: String, needle: String): Int {
    if (haystack.length < needle.length) return -1

    (0..haystack.length - needle.length).forEach { haystackIndex ->
        var found = true

        needle.indices.forEach { needleIndex ->
            if (needle[needleIndex] != haystack[haystackIndex + needleIndex]) {
                found = false
                return@forEach
            }
        }

        if (found) return haystackIndex
    }

    return -1
}

//OR
//fun strStr(haystack: String, needle: String): Int = haystack.indexOf(needle)

fun main() {
    val haystack = "sadbutsad"
    val needle = "sad"
    print(
        strStr(haystack, needle)
    )
}