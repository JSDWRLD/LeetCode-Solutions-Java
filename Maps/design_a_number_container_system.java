class NumberContainers {

    private HashMap<Integer, Integer> indexMap;
    private HashMap<Integer, TreeSet<Integer>> numIndices;

    public NumberContainers() {
        indexMap = new HashMap<>();
        numIndices = new HashMap<>();
    }
    
    // TreeSet add is log n
    // Time Complixty: O(log n)
    // Space Complexity: O(n)
    public void change(int index, int number) {
        if (indexMap.containsKey(index)) {
            int prevNum = indexMap.get(index);
            indexMap.put(index, number);
            numIndices.get(prevNum).remove(index);
            if (numIndices.get(prevNum).isEmpty())
                numIndices.remove(prevNum);
        } 

        indexMap.put(index, number);
        if (numIndices.containsKey(number)) {
            numIndices.get(number).add(index);
        } else {
            numIndices.put(number, new TreeSet<Integer>());
            numIndices.get(number).add(index);
        }
    }
    
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int find(int number) {
        if (numIndices.containsKey(number)) 
            return numIndices.get(number).first();
        
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
