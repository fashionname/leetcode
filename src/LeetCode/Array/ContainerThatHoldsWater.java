package LeetCode.Array;

/**
 * @author cowBaby
 * @create 2023/2/28-06:01
 */
public class ContainerThatHoldsWater {

    public int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int maxArea = -1;
        while(left < right){
            if(height[left] < height[right]){
                maxArea = Math.max((right - left) * height[left], maxArea);
                left++;
            }else{
                maxArea = Math.max((right - left) * height[right], maxArea);
                right--;
            }
        }

        return maxArea;
    }
}
