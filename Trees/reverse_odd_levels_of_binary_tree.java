class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int levelCount = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<TreeNode> levelNodes = new ArrayList<>();

            // Process Nodes here
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                levelNodes.add(curr);

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
            
            // Reverse Nodes Once here
            if (levelCount % 2 != 0) {
                int left = 0, right = levelNodes.size()-1;
                while (left < right) {
                    int temp = levelNodes.get(left).val;
                    levelNodes.get(left).val = levelNodes.get(right).val;
                    levelNodes.get(right).val = temp;

                    left++;
                    right--;
                }
            }

            levelCount += 1;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return root;
    }
}
