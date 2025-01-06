class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traverse(root, list);

        // Time Complexity: O(n)
        // Space Complexity: O(n) recursion
        return list;
    }

    public void traverse(TreeNode curr, List<Integer> list) {
        if (curr == null) return;
        traverse(curr.left, list);
        traverse(curr.right, list);
        list.add(curr.val);
    }
}
