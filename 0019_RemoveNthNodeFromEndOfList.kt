package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.ListNode

/*
 * 19. Remove Nth Node From End of List
 * URL: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 *
 * Description:
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 * Constraints:
 * The number of nodes in the list is sz.
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 *
 * Example:
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 */

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val dummy = ListNode(0).apply { next = head }
    var slow: ListNode? = dummy
    var fast: ListNode? = dummy

    repeat(n + 1) { fast = fast?.next }

    while (fast != null) {
        slow = slow?.next
        fast = fast.next
    }

    slow?.next = slow.next?.next

    return dummy.next
}