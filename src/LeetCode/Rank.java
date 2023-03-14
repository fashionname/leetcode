package LeetCode;

import MyData.DataModel;
import MyData.MyArray;

import java.util.*;

/**
 * @author cowBaby
 * @create 2023/2/24-18:23
 */
public class Rank {

    public static void main(String[] args) {
        new Rank().chooseSort();
    }


    public void bubbledSort(){
        /*
            冒泡排序:

               进行 nums.length - 1 次 排序
               每次交换得到 1个 最大值 或 最小值 nums.length - 1 - i

         */
        int[] nums = MyArray.getUnorderedIntArr(20);
        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j + 1] < nums[j]){
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public void chooseSort(){
        DataModel<Integer[], Integer, Integer> integerIntegerDataModel = new DataModel<>();
        integerIntegerDataModel.setData(MyArray.changeIntArr(MyArray.getUnorderedIntArr(15)));

        Integer[] data = integerIntegerDataModel.getK();

        for(int i = 0; i < data.length - 1; i++){
            int tempIdx = 0;
            int j = 0;
            for(; j < data.length - i; j++){
                if(data[tempIdx] < data[j]){
                    tempIdx = j;
                }
            }

            int maxNum = data[j - 1];
            data[j - 1] = data[tempIdx];
            data[tempIdx] = maxNum;
        }

        System.out.println(Arrays.toString(data));
    }
}
