class Solution {
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> currPath = new LinkedList<>();
        pathSum(root, targetSum, result, currPath);

        // Time Complexity: O(n^2)
        // Space Complexity: O(n * log n)
        return result;
    }

    // Does DFS
    private static void pathSum(TreeNode node, int targetSum, List<List<Integer>> result, List<Integer> currPath) {
        if (node == null) return;

        // Add each node in a preorder traversal fashion
        currPath.add(node.val);

        if (node.left == null && node.right == null && node.val == targetSum) {
            // If leaf node and True conditions add copy to result
            // Copying takes O(n)
            result.add(new LinkedList<>(currPath));
        } else {
            // DFS Implementation, subtract down each time
            pathSum(node.left, targetSum - node.val, result, currPath);
            pathSum(node.right, targetSum - node.val, result, currPath);
        }

        // We want to remove each node so our curr list is accurate of the current DFS PATH
        currPath.remove(currPath.size() - 1);
    }
}
