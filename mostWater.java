/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
*/

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int h = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                h = height[i] >= height[j] ? height[j] : height[i];
                l = j - i;
                if (max < h * l) {
                    max = h * l;
                }
            }
        }
        return max;
    }
}
