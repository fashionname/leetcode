package array.medium.one_8_15;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        threeSums(arr);
    }

    private static List<List<Integer>> threeSums(int[] nums){
        int n = nums.length;
        nums = Arrays.stream(Arrays.stream(nums).boxed().toArray(Integer[]::new))
                .sorted((a, b) ->  b - a).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(nums));
        /*for(int i = 0; i < n; i++){
            if(i != 0 && nums[i] == nums[i - 1]){
                continue;
            }else{
                int j = i + 1;
                int m = n - 1;
                while(j < m){

                }
            }
        }*/
        return null;
    }
}
