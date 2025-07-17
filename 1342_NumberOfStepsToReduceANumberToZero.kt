package com.burainex.leetcodesolutions

/*
 * 1342. Number of Steps to Reduce a Number to Zero
 * URL: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
 *
 * Description:
 * Given an integer num, return the number of steps to reduce it to zero.
 * In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 *
 * Constraints:
 * 0 <= num <= 10^6
 *
 * Example:
 * Input: num = 14
 * Output: 6
 * Explanation:
 * Step 1) 14 is even; divide by 2 and obtain 7.
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * Step 3) 6 is even; divide by 2 and obtain 3.
 * Step 4) 3 is odd; subtract 1 and obtain 2.
 * Step 5) 2 is even; divide by 2 and obtain 1.
 * Step 6) 1 is odd; subtract 1 and obtain 0.
 */

fun numberOfSteps(num: Int): Int {
    tailrec fun reduce(n: Int, steps: Int): Int =
        when (n) {
            0 -> steps
            else -> when {
                n % 2 == 0 -> reduce(n / 2, steps + 1)
                else -> reduce(n - 1, steps + 1)
            }
        }
    return reduce(num, 0)
}

fun main() {
    print(
        numberOfSteps(14)
    )
}