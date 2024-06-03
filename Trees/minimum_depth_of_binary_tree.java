class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // BFS
        int res = 0;
        while (!queue.isEmpty()) {
            res++;
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();
                if (curr.left == null && curr.right == null) return res;

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return res;
    }
}
