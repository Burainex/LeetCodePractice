package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.ListNode

/*
 * 707. Design Linked List
 * URL: https://leetcode.com/problems/design-linked-list/description/
 *
 * Description:
 * Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
 * A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
 * If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list.
 * Assume all nodes in the linked list are 0-indexed.
 * Implement the MyLinkedList class:
 * - MyLinkedList() Initializes the MyLinkedList object.
 * - int get(int index) Get the value of the index^th node in the linked list. If the index is invalid, return -1.
 * - void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
 * - void addAtTail(int val) Append a node of value val as the last element of the linked list.
 * - void addAtIndex(int index, int val) Add a node of value val before the index^th node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
 * - void deleteAtIndex(int index) Delete the index^th node in the linked list, if the index is valid.
 *
 * Constraints:
 * 0 <= index, val <= 1000
 * Please do not use the built-in LinkedList library.
 * At most 2000 calls will be made to get, addAtHead, addAtTail, addAtIndex and deleteAtIndex.
 *
 * Example:
 * Input:
 * ["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
 * [[], [1], [3], [1, 2], [1], [1], [1]]
 * Output:
 * [null, null, null, null, 2, null, 3]
 * Explanation:
 * MyLinkedList myLinkedList = new MyLinkedList();
 * myLinkedList.addAtHead(1);
 * myLinkedList.addAtTail(3);
 * myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
 * myLinkedList.get(1);              // return 2
 * myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
 * myLinkedList.get(1);              // return 3
 */

class MyLinkedList() {
    private var head: ListNode? = null
    private var size = 0

    fun get(index: Int): Int {
        if (index < 0 || index >= size) return -1

        var current = head

        repeat(index) { current = current?.next }

        return current?.`val` ?: -1
    }

    fun addAtHead(`val`: Int) {
        head = ListNode(`val`).apply { next = head }
        size++
    }

    fun addAtTail(`val`: Int) {
        addAtIndex(size, `val`)
    }

    fun addAtIndex(index: Int, `val`: Int) {
        if (index < 0 || index > size) return
        if (index == 0) {
            addAtHead(`val`)
            return
        }

        val newNode = ListNode(`val`)
        var current = head

        repeat(index - 1) { current = current?.next }

        newNode.next = current?.next
        current?.next = newNode
        size++
    }

    fun deleteAtIndex(index: Int) {
        if (index < 0 || index >= size) return
        if (index == 0) {
            head = head?.next
            size--
            return
        }

        var current = head

        repeat(index - 1) { current = current?.next }

        current?.next = current.next?.next
        size--
    }
}