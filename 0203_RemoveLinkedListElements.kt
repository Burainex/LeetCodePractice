package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.ListNode

/*
 * 203. Remove Linked List Elements
 * URL: https://leetcode.com/problems/remove-linked-list-elements/description/
 *
 * Description:
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 *
 * Constraints:
 * The number of nodes in the list is in the range [0, 10^4].
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
 *
 * Example:
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 */

fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    val dummy = ListNode(0).apply { next = head }
    var prev = dummy
    var curr = head

    while (curr != null) {
        if (curr.`val` == `val`) {
            prev.next = curr.next
        }
        else {
            prev = curr
        }
        curr = curr.next
    }

    return dummy.next
}