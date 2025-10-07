package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.ListNode

/*
 * 24. Swap Nodes in Pairs
 * URL: https://leetcode.com/problems/swap-nodes-in-pairs/description/
 *
 * Description:
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes
 * (i.e., only nodes themselves may be changed.)
 *
 * Constraints:
 * The number of nodes in the list is in the range [0, 100].
 * 0 <= Node.val <= 100
 *
 * Example:
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 */

fun swapPairs(head: ListNode?): ListNode? {
    val dummy = ListNode(0)
    dummy.next = head

    var prev: ListNode? = dummy
    var current = head

    while (current?.next != null) {
        val first = current
        val second = current.next

        prev?.next = second
        first.next = second?.next
        second?.next = first

        prev = first
        current = first.next
    }

    return dummy.next
}