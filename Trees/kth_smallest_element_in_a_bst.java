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

// There is a more optimal solution that runs by checking the far left then adding the right lowest level in a DFS manner
// Since this is a BST, however the algorithm below work with an unordered tree meaning we check every node.
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.add(root);

        // Tree BFS
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            // Process current check children
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.remove();
                // Add to maxHeap if less k if not then check and process
                
                if (maxHeap.size() < k) {
                    maxHeap.add(curr.val);
                } else {
                    if (maxHeap.peek() > curr.val) {
                        maxHeap.poll();
                        maxHeap.add(curr.val);
                    }
                }

                // Add children
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
            
        }

        // Time Complexity: O(n * log (k))
        // Space Complexity: O(n * k)
        return maxHeap.peek();
    }
}
