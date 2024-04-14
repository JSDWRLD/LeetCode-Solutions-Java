/**
  This solution was a little funky in java because of the way doubles and integers work. 
  When given a exceedingly large number integers fail to store that. We should use the 
  long type rather than the int type which stores only 32 bit signed numbers. We also 
  want to do use floating point numbers when determining the max amount of hours at a   
  certain speed.
 */
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int start = 1; // 1 banana per hour
        int end = 0; // max banana per hour
        for(int p : piles) if(p > end) end = p;
        int result = end;

        // iterate through all possible speeds
        while(start <= end){
            int middle = (start+end)/2;
            // call check method which checks speed and returns true if middle speed is less than amount of hours given to koko
            if(check(piles, h, middle)) {
                // if it is less than we go left to find a bigger total < h
                result = Math.min(result, middle);
                end = middle - 1;
            } else {
                // else move right most until result updates or our pointers cross
                start = middle + 1;
            }
        }

        // Time Complexity: O(n log m)
        // Space Complexity: O(1)
        return result;
    } 

    /**
    *  This method simply returns true or false depending on whether or not
    *  the amount of hours at the passed in speed is less than or greater than hours.
    */
    public boolean check(int[] piles, int h, int speed) {
        double hours = 0;
        for(int p : piles) {
            hours += Math.ceil((double)p/speed);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        if(hours <= h) return true;
        return false;
    }
}
