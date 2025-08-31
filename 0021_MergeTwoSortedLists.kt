package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.ListNode

/*
 * 21. Merge Two Sorted Lists
 * URL: https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * Description:
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * Constraints:
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 *
 * Example:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 */

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val head = ListNode(0)
    var list1Node = list1
    var list2Node = list2
    var current = head

    while (list1Node != null && list2Node != null) {
        if (list1Node.`val` < list2Node.`val`) {
            current.next = list1Node
            list1Node = list1Node.next
        } else {
            current.next = list2Node
            list2Node = list2Node.next
        }
        current = current.next!!
    }

    current.next = list1Node ?: list2Node

    return head.next
}