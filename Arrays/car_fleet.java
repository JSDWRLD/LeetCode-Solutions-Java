class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        // how big is the array of arrays, how big the subarray is
        double[][] pairs = new double[len][2];

        for(int i = 0; i < len; i++){
            double p = (double)position[i];
            double s = (double)speed[i];
            pairs[i] = new double[] {position[i], ((double)target - p) / s};
        }
        
        // Overload Sort method, compare pair a and pair b first element
        Arrays.sort(pairs, (a,b) -> Double.compare(a[0], b[0]));

        int result = 0;
        double curr = 0;
        for(int i = len - 1; i >= 0; i--){
            // if the time of the pair is greater than the car in front then increment fleet count
            if(pairs[i][1] > curr){
                result++;
                curr = pairs[i][1];
            }
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        return result;
    }
}
