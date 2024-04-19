class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // this loop iterates through nums2 and adds it at M index
        // m is usually where nums1 ends at 0 indexed
        for(int i = 0; i < n; i++){
            nums1[m] = nums2[i];
            m++;
        }

        // after added on we use arrays sort java method
        Arrays.sort(nums1);
        
        // Time complexity: o(n)
    }
}