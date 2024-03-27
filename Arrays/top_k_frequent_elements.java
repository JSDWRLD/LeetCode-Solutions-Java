class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create map for actual number and its count
        HashMap<Integer, Integer> map = new HashMap<>();
        // creating our Array of Lists
        // similar to int[], int is the type, we use list instead
        List<Integer>[] bucket = new ArrayList[nums.length + 2];
        
        // maps the frequency for each
        for(int num: nums){
            if(!map.containsKey(num)) map.put(num, 1);

            map.put(num, map.get(num) + 1);
        }

        // adding to bucket
        for(int key: map.keySet()){
            // mapping via frequency as index
            int freq = map.get(key);
            if(bucket[freq] == null) {
                bucket[freq] = new ArrayList<Integer>();
            }
            bucket[freq].add(key);
        }

        // indexes of bucket contain the frequency
        // and its associated values
        // result is top k elements
        List<Integer> list = new ArrayList<>();
        for(int i = bucket.length - 1; i >= 0 && list.size() < k ; i--){
            if(bucket[i] != null) {
                list.addAll(bucket[i]);
            }
        }

        int size = list.size();
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = list.get(i);
        }
        
        // k being item frequency to grab, n being array iteration
        // Time Complexity = O(n + k)
        // Space Complexity = O(n + k)
        return result;
    }
}
