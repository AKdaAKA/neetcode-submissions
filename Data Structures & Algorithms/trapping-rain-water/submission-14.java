class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        //pointer starts first value left or start then scans to left
        maxLeft[0] = height[0];
        for (int i = 1; i < n; i++) { //loop till end
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        //pointer starts at end of array then scans to the right going backwards
        maxRight[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        //find smallest of left and right if negitive 
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        return total;
    }
}