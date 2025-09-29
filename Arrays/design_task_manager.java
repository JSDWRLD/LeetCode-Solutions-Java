class TaskManager {
    // Space Complexity: O(n)
    private PriorityQueue<int[]> readyQ;
    private HashMap<Integer, int[]> priMap;
    
    // Time Complexity: O(n log n) largest here
    public TaskManager(List<List<Integer>> tasks) {
        // log (n)
        readyQ = new PriorityQueue<int[]>((a,b) -> {
            if (a[2] != b[2]) return b[2] - a[2];
            return b[1]-a[1];
        });
        priMap = new HashMap<>();

        // o(n log n)
        for (List<Integer> t : tasks) {
            int userId = t.get(0);
            int taskId = t.get(1);
            int pri = t.get(2);
            int[] triple = new int[] {userId, taskId, pri};
            readyQ.offer(triple); // log n
            priMap.put(taskId, triple);
        }
    }
    
    // o(log n)
    public void add(int userId, int taskId, int priority) {
        int[] triple = new int[] {userId, taskId, priority};
        readyQ.offer(triple);
        priMap.put(taskId, triple);
    }
    
    // o(log n)
    public void edit(int taskId, int newPriority) {
        if (priMap.containsKey(taskId)) {
            int[] triple = priMap.get(taskId);
            int[] copy = new int[] {triple[0], triple[1], triple[2]};
            copy[2] = newPriority;
            readyQ.offer(copy);
            priMap.put(taskId, copy);
        }
    }
    
    // o(1)
    public void rmv(int taskId) {
        priMap.remove(taskId);
    }
    
    // o(k log n)
    // k stale nodes we skip past
    public int execTop() {
        while (!readyQ.isEmpty()) {
            int[] curr = readyQ.poll();
            int userId = curr[0];
            int taskId = curr[1];
            int pri = curr[2];

            if (priMap.containsKey(taskId) && priMap.get(taskId)[2] == pri) {
                int[] triple = priMap.get(taskId);
                priMap.remove(taskId);
                return triple[0];
            }
        }

        return -1;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */
