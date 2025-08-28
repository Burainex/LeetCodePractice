package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.ListNode

/*
 * 234. Palindrome Linked List
 * URL: https://leetcode.com/problems/palindrome-linked-list/description/
 *
 * Description:
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 *
 * Constraints:
 * The number of nodes in the list is in the range [1, 10^5].
 * 0 <= Node.val <= 9
 *
 * Example:
 * Input: head = [1,2,2,1]
 * Output: true
 */

fun isPalindrome(head: ListNode?): Boolean {
    if (head?.next == null) return true

    var slow = head
    var fast = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    val secondHalfHead = reverse(slow)

    var firstHalfPtr = head
    var secondHalfPtr = secondHalfHead

    while (secondHalfPtr != null) {
        if (firstHalfPtr?.`val` != secondHalfPtr.`val`) {
            return false
        }
        firstHalfPtr = firstHalfPtr.next
        secondHalfPtr = secondHalfPtr.next
    }

    return true
}


private fun reverse(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current = head

    while (current != null) {
        val next = current.next
        current.next = prev
        prev = current
        current = next
    }

    return prev
}