package Maths;

class UniformParityArray_II {
    public boolean uniformArray(int[] nums) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        for (int x : nums) {
            if (x % 2 != 0) {
                minOdd = Math.min(minOdd, x);
            } else {
                minEven = Math.min(minEven, x);
            }
        }
        if (minOdd == Integer.MAX_VALUE || minEven == Integer.MAX_VALUE) {
            return true;
        }
        return minEven > minOdd;
    }
}