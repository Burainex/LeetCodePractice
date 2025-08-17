package com.burainex.leetcodesolutions

/*
 * 2769. Find the Maximum Achievable Number
 * URL: https://leetcode.com/problems/find-the-maximum-achievable-number/description/
 *
 * Description:
 * Given two integers, num and t. A number x is achievable if it can become equal to num after applying the following operation at most t times:
 * - Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
 * Return the maximum possible value of x.
 *
 * Constraints:
 * 1 <= num, t <= 50
 *
 * Example:
 * Input: num = 4, t = 1
 * Output: 6
 * Explanation:
 * Apply the following operation once to make the maximum achievable number equal to num:
 * Decrease the maximum achievable number by 1, and increase num by 1.
 */

fun theMaximumAchievableX(num: Int, t: Int): Int = num + 2 * t

fun main() {
    print(
        theMaximumAchievableX(num = 4, t = 1)
    )
}