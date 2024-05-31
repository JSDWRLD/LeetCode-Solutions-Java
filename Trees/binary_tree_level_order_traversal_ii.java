class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currLevel = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode process = queue.poll();
                currLevel.add(process.val);

                if (process.left != null) queue.offer(process.left);
                if (process.right != null) queue.offer(process.right);
            }

            result.add(0, currLevel);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
