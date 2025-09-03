package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.ListNode

/*
 * 61. Rotate List
 * URL: https://leetcode.com/problems/rotate-list/description/
 *
 * Description:
 * Given the head of a linked list, rotate the list to the right by k places.
 *
 * Constraints:
 * The number of nodes in the list is in the range [0, 500].
 * -100 <= Node.val <= 100
 * 0 <= k <= 2 * 10^9
 *
 * Example:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

fun rotateRight(head: ListNode?, k: Int): ListNode? {
    if (head == null || head.next == null || k == 0) return head

    var current = head
    var length = 1

    while (current?.next != null) {
        current = current.next
        length++
    }

    val rotationTimes = k % length
    if (rotationTimes == 0) return head

    current?.next = head

    var tail = head
    repeat(length - rotationTimes - 1) {
        tail = tail?.next
    }

    val newHead = tail?.next
    tail?.next = null

    return newHead
}