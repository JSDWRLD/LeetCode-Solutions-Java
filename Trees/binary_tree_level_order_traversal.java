class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result; // empty

        // BFS with Queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();
                currentLevel.add(curr.val);

                // Insert the children after processing node
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            // Add the current level's integer values to the result
            result.add(currentLevel);
        }

        // Time Complexity: O(n) , n is the total number of nodes
        // Space Complexity: O(n) , because of the queue and the list we return for each level
        return result;
    }
}
