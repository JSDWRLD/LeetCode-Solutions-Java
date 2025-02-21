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
class FindElements {

    private HashSet<Integer> set;

    public FindElements(TreeNode root) {
        set = new HashSet<>();
        decontaminate(root, 0);
    }
    
    private void decontaminate(TreeNode curr, int valueToAdd) {
        if (curr == null) return;

        set.add(valueToAdd);
        decontaminate(curr.left, valueToAdd*2+1);
        decontaminate(curr.right, valueToAdd*2+2);
    }

    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
