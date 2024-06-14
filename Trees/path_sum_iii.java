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
    public int pathSum(TreeNode root, int targetSum) {
        // To show our DFS PATH
        List<Integer> currPath = new LinkedList<>();

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return pathSum(root, targetSum, currPath);
    }

    private int pathSum(TreeNode curr, int target, List<Integer> currPath) {
        if (curr == null) return 0;
        long pathSum = 0;
        int pathTotal = 0;

        // add the current node into currpath to represent DFS
        currPath.add(curr.val);

        ListIterator<Integer> checkDFS = currPath.listIterator(currPath.size());
        // Traverse our DFS linkedList backwards
        while (checkDFS.hasPrevious()) {
            pathSum += checkDFS.previous();

            // If at any point of the current DFS the pathSum == target we increment path
            if (pathSum == target) pathTotal++;
        }

        // Recursively perform DFS
        pathTotal += pathSum(curr.left, target, currPath);
        pathTotal += pathSum(curr.right, target, currPath);

        // Remove the recently added node when backtracking,
        // this helps our currPath accurately represent our DFS pathway
        currPath.remove(currPath.size() - 1);

        // return total after performing DFS recursively
        return pathTotal;
    }  
}
