package com.burainex.leetcodesolutions

/*
 * 2469. Convert the Temperature
 * URL: https://leetcode.com/problems/convert-the-temperature/description/
 *
 * Description:
 * You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
 * You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
 * Return the array ans. Answers within 10^-5 of the actual answer will be accepted.
 * Note that:
 * Kelvin = Celsius + 273.15
 * Fahrenheit = Celsius * 1.80 + 32.00
 *
 * Constraints:
 * 0 <= celsius <= 1000
 *
 * Example:
 * Input: celsius = 36.50
 * Output: [309.65000,97.70000]
 * Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.
 */

fun convertTemperature(celsius: Double): DoubleArray {
    val kelvin = celsius + 273.15
    val fahrenheit = celsius * 1.8 + 32.0

    return doubleArrayOf(kelvin, fahrenheit)
}

fun main(){
    print(
        convertTemperature(36.5).contentToString()
    )
}