class ProductOfNumbers {

    private LinkedList<Integer> prefixProd;
    private int size;

    // Space Complexity: O(n)
    public ProductOfNumbers() {
        prefixProd = new LinkedList<>();
        prefixProd.add(1);
        size = 0;
    }
    
    // Time Complexity: O(1)
    public void add(int num) {
        if (num != 0) {
            int prev = prefixProd.get(size);
            prefixProd.add(prev * num);
            size += 1;
        } else {
            // discard prev array because 0 cancels out stream
            prefixProd = new LinkedList<>();
            prefixProd.add(1);
            size = 0;
        }
    }
    
    // Time Complexity: O(1)
    public int getProduct(int k) {
        // we always 0 out anything before a 0
        if (k > size) return 0; // meaning we go past where we found 0

        int totalProd = prefixProd.get(size);
        int discardProd = prefixProd.get(size - k);
        return totalProd / discardProd;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
