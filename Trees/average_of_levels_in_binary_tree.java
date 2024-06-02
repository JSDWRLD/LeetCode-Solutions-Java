class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            double levelSize = queue.size();
            double levelTotal = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();
                levelTotal += curr.val;

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
            result.add(levelTotal/levelSize);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
