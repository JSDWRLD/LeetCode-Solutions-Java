class Node {
    int listNumber;
    int index;

    Node(int listNumber, int index) {
        this.listNumber = listNumber;
        this.index = index;
    }
}

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>((n1, n2) -> nums.get(n1.listNumber).get(n1.index) - nums.get(n2.listNumber).get(n2.index));

        int currBiggest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) != null) {
                int val = nums.get(i).get(0);
                currBiggest = Math.max(currBiggest, val);
                minHeap.add(new Node(i, 0));
            }
        }


        int rangeStart = 0, rangeEnd = Integer.MAX_VALUE;
        // We stop once we reach the end of a list, meaning our minheap is not the same size as K
        while (minHeap.size() == nums.size()) {
            Node temp = minHeap.remove();
            int val = nums.get(temp.listNumber).get(temp.index);

            if (rangeEnd - rangeStart > currBiggest - val) {
                rangeEnd = currBiggest;
                rangeStart = val;
            }

            temp.index++;
            if (temp.index < nums.get(temp.listNumber).size()) {
                currBiggest = Math.max(currBiggest, nums.get(temp.listNumber).get(temp.index));
                minHeap.add(temp);
            }
        }

        // Time Complexity: O(n log k)
        // Space Complexity: O(k)
        return new int[] {rangeStart, rangeEnd};
    }
}
