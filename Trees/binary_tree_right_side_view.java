class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        // Implement BFS on add right child and append
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();
                // Only add value to list if the node is last node
                // index of last is always length - 1
                if (i == levelSize - 1) {
                    result.add(curr.val);

                }

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
