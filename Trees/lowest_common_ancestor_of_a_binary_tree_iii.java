/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Node p1 = p;
        Node p2 = q;

        while (p1 != p2) {
            if (p1 == null) p1 = q;
            else p1 = p1.parent;

            if (p2 == null) p2 = p;
            else p2 = p2.parent;
        }

        // Time Complexity: O(n)
        // Space Compleixty: O(1)
        return p1;
    }
}

/*
public Node lowestCommonAncestor(Node p, Node q) {
        HashSet<Node> ancestorsOfP = new HashSet<>();

        while (p != null) {
            ancestorsOfP.add(p);
            p = p.parent;
        }

        while (!ancestorsOfP.contains(q)) {
            q = q.parent;
        }

        // Time Complexity: O(n)
        // Space Compleixty: O(n)
        return q;
    }
*/
