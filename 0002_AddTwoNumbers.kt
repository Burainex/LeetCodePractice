package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.ListNode

/*
 * 2. Add Two Numbers
 * URL: https://leetcode.com/problems/add-two-numbers/description/
 *
 * Description:
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Constraints:
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 *
 * Example:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var l1Node = l1
    var l2Node = l2

    val dummy = ListNode(0)
    var current = dummy
    var carry = 0

    while (l1Node != null || l2Node != null) {
        val sum = (l1Node?.`val` ?: 0) + (l2Node?.`val` ?: 0) + carry
        carry = sum / 10

        val newNode = ListNode(sum % 10)
        current.next = newNode
        current = newNode

        l1Node = l1Node?.next
        l2Node = l2Node?.next
    }

    if (carry > 0) {
        current.next = ListNode(carry)
    }

    return dummy.next
}