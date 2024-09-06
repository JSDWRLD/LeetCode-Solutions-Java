class Solution {
    private int indexPre;
    HashMap<Integer, Integer> inorderIdx; // O(n) space

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        indexPre = 0;
        inorderIdx = new HashMap<>();

        // Index map for inorder for O(1) access, 
        for (int i = 0; i < inorder.length; i++)
            inorderIdx.put(inorder[i], i);
        
        // Recursively create tree, in a binary search manner
        // T: O(n) Building tree is O(n), and building idx map is O(n)
        // S: O(n) idx map and recursive calls worst case is O(n) avg is O(log n)
        return createTree(preorder, 0, preorder.length-1);
    }

    // T: O(n) Space: O(1)
    private TreeNode createTree(int[] p, int left, int right) {
        // Out of bounds so we return
        if (left > right) return null;

        // Root to process form the preorder array
        // Increment Index to get next subtree root
        TreeNode root = new TreeNode(p[indexPre++]); 

        // Get index of the current root and recursively traverse left and right
        int index = inorderIdx.get(root.val);

        // This will make additional subtrees that will be added to the original root
        root.left = createTree(p, left, index-1);
        root.right = createTree(p, index+1, right);

        // Once we complete the entire preorder list we added all the subtree
        // roots in order
        return root;
    }
}
