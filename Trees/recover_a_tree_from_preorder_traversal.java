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

    private int index;

    public TreeNode recoverFromPreorder(String traversal) {
        index = 0;

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return dfs(traversal, 0);
    }

    private TreeNode dfs(String traversal, int depth) {
        int n = traversal.length();
        if (index >= n) return null;
        
        int dashCount = 0;
        while ((index+dashCount) < n && traversal.charAt(index+dashCount) == '-') {
            dashCount += 1;
        }

        if (dashCount != depth) return null;

        // Increment index to get to number
        index += dashCount;

        // Digit could be multiple numbers
        int value = 0;
        while (index < n && 
            Character.isDigit(traversal.charAt(index))
        ) {
            value = value * 10 + (traversal.charAt(index++) - '0');
        }

        TreeNode root = new TreeNode(value);
        root.left = dfs(traversal, depth+1);
        root.right = dfs(traversal, depth+1);

        return root;
    }
}

// Notes
        // check if out of bounds return
        // then check dashes count
        // if dash count not equal to depth return null
        // if it goes thru and its supposed to be there
        // extract character then make new node
        // traverse left depth +1
        // traverse right depth + 1
