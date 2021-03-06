class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int left = 0; int right = height.length - 1;
        while (left < right) {
            if (((right-left) * Math.min(height[left], height[right])) > max) {
                max = (right-left) * Math.min(height[left], height[right]);
            } else if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}