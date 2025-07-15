package com.burainex.leetcodesolutions

/*
 * 2236. Root Equals Sum of Children
 * URL: https://leetcode.com/problems/root-equals-sum-of-children/description/
 *
 * Description:
 * You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.
 * Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.
 *
 * Constraints:
 * The tree consists only of the root, its left child, and its right child.
 * -100 <= Node.val <= 100
 *
 * Example:
 * Input: root = [10,4,6]
 * Output: true
 * Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
 * 10 is equal to 4 + 6, so we return true.
 */

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun checkTree(root: TreeNode?): Boolean =
    root!!.`val` == root.left!!.`val` + root.right!!.`val`

fun main() {
    val tree = TreeNode(10)
    tree.left = TreeNode(4)
    tree.right = TreeNode(6)

    print(
        checkTree(tree)
    )
}