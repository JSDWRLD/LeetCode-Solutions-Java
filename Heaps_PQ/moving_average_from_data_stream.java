class MovingAverage {
    
    private int runningSum;
    private int maxWindowSize;
    private Queue<Integer> window;
    
    // Constructor
    public MovingAverage(int size) {
        runningSum = 0;
        maxWindowSize = size;
        window = new LinkedList<>();
    }
    
    // Time Complexity: O(1)
    // Space Complexity: O(n)
    public double next(int val) {
        if (window.size() >= maxWindowSize) {
            runningSum -= window.poll();
        } 

        window.offer(val);
        runningSum += val;
        double average = (double)runningSum / (double)window.size();

        return average;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
