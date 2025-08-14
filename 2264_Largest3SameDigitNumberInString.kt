package com.burainex.leetcodesolutions

/*
 * 2264. Largest 3-Same-Digit Number in String
 * URL: https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/
 *
 * Description:
 * You are given a string num representing a large integer. An integer is good if it meets the following conditions:
 * - It is a substring of num with length 3.
 * - It consists of only one unique digit.
 * Return the maximum good integer as a string or an empty string "" if no such integer exists.
 *
 * Constraints:
 * 3 <= num.length <= 1000
 * num only consists of digits.
 *
 * Example:
 * Input: num = "6777133339"
 * Output: "777"
 * Explanation: There are two distinct good integers: "777" and "333".
 * "777" is the largest, so we return "777".
 */

fun largestGoodInteger(num: String): String {
    val hasThreeSameDigits = { i: Int ->
        num[i] == num[i + 1] && num[i] == num[i + 2]
    }

    val maxGoodDigit = (0..num.lastIndex - 2)
        .filter(hasThreeSameDigits)
        .maxOfOrNull { num[it] }

    return maxGoodDigit?.toString()?.repeat(3) ?: ""
}

fun main() {
    val example = "6777133339"
    print(
        largestGoodInteger(example)
    )
}