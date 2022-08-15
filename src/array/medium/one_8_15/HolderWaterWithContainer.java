package array.medium.one_8_15;

public class HolderWaterWithContainer {

    public static void main(String[] args) {

    }


    private int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            int area = (right - left) * Math.min(height[right], height[left]);
            maxArea = Math.max(area, maxArea);
            if(height[left] >= height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxArea;
    }
}
