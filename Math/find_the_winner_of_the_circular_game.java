class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> friends = new ArrayList<>();
        for (int i = 1; i <= n; i++) friends.add(i);

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return find(friends, 0, k);
    }

    private int find(List<Integer> friends, int index, int k) {
        if (friends.size() == 1) return friends.get(0);

        int toRemove = (index + k - 1) % friends.size();
        friends.remove(toRemove);
        return find(friends, toRemove, k);
    }
}
