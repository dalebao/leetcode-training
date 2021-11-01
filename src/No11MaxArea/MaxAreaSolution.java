package No11MaxArea;

public class MaxAreaSolution {

    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max((right - left) * Math.min(height[right], height[left]), maxArea);
            if (height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }

        return maxArea;
    }
}
