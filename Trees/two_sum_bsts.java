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
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        HashSet<Integer> r1Seen = new HashSet<>();
        collectAll(root1, r1Seen);

        // n: nodes in r1, m: nodes in r2
        // Time: O(n + log(m))
        // Space: O(n)
        return findCompliment(root2, r1Seen, target);
    }

    private void collectAll(TreeNode root, HashSet<Integer> seen)
    {
        if (root == null) return;
        seen.add(root.val);
        collectAll(root.left, seen);
        collectAll(root.right, seen);
    }

    private boolean findCompliment(TreeNode root2, HashSet<Integer> r1Seen, int target) {
        if (root2 == null) return false;

        int compliment = target - root2.val;
        if (r1Seen.contains(compliment)) return true;

        return findCompliment(root2.left, r1Seen, target) || findCompliment(root2.right, r1Seen, target);
    }
}

// two sets, two pointers
// then traverse

// 3 < 5
// 
