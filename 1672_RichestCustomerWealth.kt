package com.burainex.leetcodesolutions

/*
 * 1672. Richest Customer Wealth
 * URL: https://leetcode.com/problems/richest-customer-wealth/description/
 *
 * Description:
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i^th customer has in the j^th bank.
 * Return the wealth that the richest customer has.
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer
 * that has the maximum wealth.
 *
 * Constraints:
 * m == accounts.length
 * n == accounts[i].length
 * 1 <= m, n <= 50
 * 1 <= accounts[i][j] <= 100
 *
 * Example:
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the richest with a wealth of 6 each, so return 6.
 */

fun maximumWealth(accounts: Array<IntArray>): Int =
    accounts.maxOf { accountWealth -> accountWealth.sum() }

fun main() {
    val accounts = arrayOf(
        intArrayOf(2, 8, 7),
        intArrayOf(7, 1, 3),
        intArrayOf(1, 9, 5)
    )
    print(maximumWealth(accounts))
}