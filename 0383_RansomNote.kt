package com.burainex.leetcodesolutions

/*
 * 383. Ransom Note
 * URL: https://leetcode.com/problems/ransom-note/description/
 *
 * Description:
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 *
 * Constraints:
 * 1 <= ransomNote.length, magazine.length <= 10^5
 * ransomNote and magazine consist of lowercase English letters.
 *
 * Example:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val magCounts = magazine
        .groupingBy { it }
        .eachCount()
        .toMutableMap()

    for (ch in ransomNote) {
        val count = magCounts[ch] ?: 0
        if (count == 0) return false
        magCounts[ch] = count - 1
    }

    return true
}

fun main() {
    print(
        canConstruct(ransomNote = "aa", magazine = "aab")
    )
}