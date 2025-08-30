package com.burainex.leetcodesolutions

/*
 * 20. Valid Parentheses
 * URL: https://leetcode.com/problems/valid-parentheses/description/
 *
 * Description:
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * Constraints:
 * 1 <= s.length <= 10^4
 * s consists of parentheses only '()[]{}'.
 *
 * Example:
 * Input: s = "([])"
 * Output: true
 */

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false

    val stack = ArrayDeque<Char>()
    val bracketMap = mapOf(
        ')' to '(',
        '}' to '{',
        ']' to '['
    )

    s.forEach { ch ->
        when (ch) {
            '(', '{', '[' -> stack.addLast(ch)
            ')', '}', ']' -> {
                if (stack.removeLastOrNull() != bracketMap[ch]) return false
            }
        }
    }

    return stack.isEmpty()
}

fun main(){
    val example = "([])"
    print(
        isValid(example)
    )
}