package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.ListNode

/*
 * 206. Reverse Linked List
 * URL: https://leetcode.com/problems/reverse-linked-list/description/
 *
 * Description:
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Constraints:
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 *
 * Example:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 */

fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current = head

    while (current != null) {
        val tmp = current.next
        current.next = prev
        prev = current
        current = tmp
    }

    return prev
}