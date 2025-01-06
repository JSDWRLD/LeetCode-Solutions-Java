class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traverse(root, list);

        // Time Complexity: O(n)
        // Space Complexity: O(n) recursion
        return list;
    }

    public void traverse(TreeNode curr, List<Integer> list) {
        if (curr == null) return;
        list.add(curr.val);
        traverse(curr.left, list);
        traverse(curr.right, list);
    }
}
