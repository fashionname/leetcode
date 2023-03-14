package MyData;

import MyException.ArrException;

import java.util.Arrays;

/**
 * @author cowBaby
 * @create 2023/2/24-17:24
 */
public class MyArray {

    public static void main(String[] args) {

    }

    public static int[] getSortIntArr(){

        int[] nums = new int[10];

        for(int i = 0; i < 10; i++){
            nums[i] = i;
        }

        return nums;
    }

    public static int[] getSortIntArr(int len){
        if(len <= 0){
            throw new ArrException("数组长度不能为负数");
        }

        int[] nums = new int[len];

        for(int i = 0; i < len; i++){
            nums[i] = i;
        }

        return nums;
    }

    public static int[] getUnorderedIntArr(int len){
        if(len <= 0){
            throw new ArrException("数组长度不能负数");
        }
        int[] nums = new int[len];

        for(int i = 0; i < len; i++){
            nums[i] = (int) (Math.random() * 101);
        }

        return nums;
    }

    public static int[] getUnorderedIntArr(int len, int left, int right){
        if(left >= right || left < 0 || right >= 10000){
            throw new ArrException("请输入正确的范围");
        }

        int[] nums = new int[len];

        for(int i = 0; i < len; i++){
            nums[i] = (int) (Math.random() * (right - left + 1) + left);
        }

        return nums;
    }


    public static Integer[] changeIntArr(int[] arr){
        Integer[] integers = new Integer[arr.length];
        for (int num = 0; num < arr.length; num++) {
            integers[num] = arr[num];
        }
        return integers;
    }
}
