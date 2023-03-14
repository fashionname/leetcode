package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cowBaby
 * @create 2023/2/28-06:08
 */
public class ThreeNumSum {

    public List<List<Integer>> threeSum(int[] nums){
        ArrayList<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i < len - 2; i++){
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < len - 1; j++){
                if(j != i + 1 && nums[j] == nums[j - 1]) continue;
                int sum = nums[i] + nums[j];
                int m = len - 1;

                while(j < m){
                    if(sum == - nums[m]){
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(nums[i]);
                        arrayList.add(nums[j]);
                        arrayList.add(nums[m]);
                        lists.add(arrayList);
                        break;
                    }else if(sum > -nums[m]){
                        m--;
                    }else{
                        break;
                    }
                }
            }
        }

        return lists;
    }

}
