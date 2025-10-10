package com.burainex.leetcodesolutions

/*
 * 70. Climbing Stairs
 * URL: https://leetcode.com/problems/climbing-stairs/description/
 *
 * Description:
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Constraints:
 * 1 <= n <= 45
 *
 * Example:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */

fun climbStairs(n: Int): Int {
    var a = 1
    var b = 2

    repeat(n - 1) {
        a = b.also { b = a + b }
    }

    return a
}

fun main() {
    print(
        climbStairs(3)
    )
}