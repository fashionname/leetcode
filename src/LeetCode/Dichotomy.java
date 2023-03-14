package LeetCode;

import MyData.MyArray;

import java.util.Arrays;

/**
 * @author cowBaby
 * @create 2023/2/24-17:52
 */
public class Dichotomy {

    /*


     */
    public static void main(String[] args) {



    }

    public void commonDichotomy(){
        /*
            普通二分法流程:

                反复缩小范围 确定中间值是不是目标值

                left 和 right 选择问题: 要搜寻的值 那肯定是 left: 0 right: nums.length - 1

                left <= right 和 left < right 的区别:
                    left <= right 确保搜寻到中间值 在循环体内部会报告 会越界 left - right == 1

         */

        int target = 13;

        int[] nums = MyArray.getSortIntArr(58);

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = ((right - left) >> 1) + left;

            if(nums[mid] == target){
                System.out.println("找到target值 位置: " + mid + " ,值为: " + nums[mid]);
                break;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
    }
}
