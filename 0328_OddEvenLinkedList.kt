package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.ListNode

/*
 * 328. Odd Even Linked List
 * URL: https://leetcode.com/problems/odd-even-linked-list/description/
 *
 * Description:
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
 * The first node is considered odd, and the second node is even, and so on.
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 *
 * Constraints:
 * The number of nodes in the linked list is in the range [0, 10^4].
 * -10^6 <= Node.val <= 10^6
 *
 * Example:
 * Input: head = [2,1,3,5,6,4,7]
 * Output: [2,3,6,7,1,5,4]
 */

fun oddEvenList(head: ListNode?): ListNode? {
    if (head?.next == null) return head

    val evenHead = head.next

    var odd: ListNode? = head
    var even: ListNode? = evenHead

    while (even?.next != null) {
        odd?.next = even.next
        odd = odd?.next

        even.next = odd?.next
        even = even.next
    }

    odd?.next = evenHead

    return head
}