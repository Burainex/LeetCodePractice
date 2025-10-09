package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.TreeNode

/*
 * 700. Search in a Binary Search Tree
 * URL: https://leetcode.com/problems/search-in-a-binary-search-tree/description/
 *
 * Description:
 * You are given the root of a binary search tree (BST) and an integer val.
 * Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
 *
 * Constraints:
 * The number of nodes in the tree is in the range [1, 5000].
 * 1 <= Node.val <= 10^7
 * root is a binary search tree.
 * 1 <= val <= 10^7
 *
 * Example:
 * Input: root = [4,2,7,1,3], val = 2
 * Output: [2,1,3]
 */

fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    var current = root

    while (current != null && current.`val` != `val`) {
        current = if (`val` < current.`val`) current.left else current.right
    }

    return current
}
