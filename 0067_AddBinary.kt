package com.burainex.leetcodesolutions

/*
 * 67. Add Binary
 * URL: https://leetcode.com/problems/add-binary/description/
 *
 * Description:
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Constraints:
 * 1 <= a.length, b.length <= 10^4
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 *
 * Example:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */

fun addBinary(a: String, b: String): String {
    val result = StringBuilder()

    var aIndex = a.lastIndex
    var bIndex = b.lastIndex
    var carry = 0

    while (aIndex >= 0 || bIndex >= 0 || carry > 0) {
        val digitA = if (aIndex >= 0) a[aIndex--] - '0' else 0
        val digitB = if (bIndex >= 0) b[bIndex--] - '0' else 0
        val sum = carry + digitA + digitB

        result.append(sum % 2)
        carry = sum / 2
    }

    return result.reverse().toString()
}

//OR
/*
fun addBinary(a: String, b: String): String = (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
 */

fun main() {
    print(
        addBinary("1010", "1011")
    )
}