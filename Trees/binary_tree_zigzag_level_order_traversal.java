class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;

        boolean leftToRight = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelData = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();
                // we can alternate the actual inserting of nodes into
                // queue because it will branch down each subtree based
                // on current node
                // we have to alternate our inserting
                if (leftToRight) {
                    levelData.add(curr.val);
                } else {
                    levelData.add(0, curr.val);
                }
                
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
            leftToRight = !leftToRight;
            result.add(levelData);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
