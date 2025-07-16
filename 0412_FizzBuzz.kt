package com.burainex.leetcodesolutions

/*
 * 412. Fizz Buzz
 * URL: https://leetcode.com/problems/fizz-buzz/description/
 *
 * Description:
 * Given an integer n, return a string array answer (1-indexed) where:
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 *
 * Constraints:
 * 1 <= n <= 10^4
 *
 * Example:
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"
 */

fun fizzBuzz(n: Int): List<String> =
    (1..n).map { i ->
        when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> "$i"
        }
    }

fun main() {
    print(
        fizzBuzz(15)
    )
}