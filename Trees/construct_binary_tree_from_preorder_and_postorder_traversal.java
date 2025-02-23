/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Index
    private int preIndex;
    private int postIndex;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        preIndex = 0;
        postIndex = 0;
        
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return dfs(preorder, postorder);
    }

    private TreeNode dfs(int[] preorder, int[] postorder) {

        TreeNode curr = new TreeNode(preorder[preIndex]);
        preIndex += 1;

        if (curr.val != postorder[postIndex]) {
            curr.left = dfs(preorder, postorder);
        }

        if (curr.val != postorder[postIndex]) {
            curr.right = dfs(preorder, postorder);
        }

        postIndex += 1;
        
        return curr;
    }
}
