package com.burainex.leetcodesolutions

import com.burainex.leetcodesolutions.utils.TreeNode

/*
 * 104. Maximum Depth of Binary Tree
 * URL: https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 *
 * Description:
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Constraints:
 * The number of nodes in the tree is in the range [0, 10^4].
 * -100 <= Node.val <= 100
 *
 * Example:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 */

fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0

    var depth = 0
    val queue = ArrayDeque<TreeNode>()
    queue.add(root)

    while (queue.isNotEmpty()) {
        repeat(queue.size) {
            val node = queue.removeFirst()
            node.left?.let { queue.add(it) }
            node.right?.let { queue.add(it) }
        }
        depth++
    }

    return depth
}