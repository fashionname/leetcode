package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author cowBaby
 * @create 2023/3/1-05:05
 */
public class ThreeSumCloset {

    public int threeSumCloset0(int[] nums, int target){

        return 0;
    }

    public int threeSumCloset1(int[] nums, int target){

        int len = nums.length;
        int sum = nums[0] + nums[1] + nums[2];
        int closet = Math.abs(sum - target);

        for(int i = 0; i < len - 2; i++){
            for(int j = i + 1; j < len - 1; j++){
                for(int m = j + 1; m < len; m++){
                    int sum0 = nums[i] + nums[j] + nums[m];
                    if(Math.abs(sum0 - target) < closet){

                        closet = Math.abs(sum0 - target);
                        sum = sum0;
                        if(closet == 0){
                            return sum;
                        }
                    }
                }
            }
        }

        return sum;
    }
}
