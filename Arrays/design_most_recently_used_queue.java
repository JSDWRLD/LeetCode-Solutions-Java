class MRUQueue {
    private List<Integer> list;

    // O(n)
    public MRUQueue(int n) {
        list = new ArrayList<>();
        for (int i = 1; i <= n; i++) list.add(i);
    }
    
    // O(n)
    public int fetch(int k) {
        // move kth element to end of queue and returns
        int num = list.get(k-1);
        list.remove(k-1);
        list.add(num);
        return num;
    }
}
