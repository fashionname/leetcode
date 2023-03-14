package MyUtil;

import java.util.Arrays;

/**
 * @author cowBaby
 * @create 2023/3/2-01:43
 */
public class PrintLog<T> {

    public static <T> void printArray(T[][] t){
        for(int i = 0; i < t.length; i++){
            System.out.println(Arrays.toString(t[i]));
        }
    }


    public static void main(String[] args) {
        
    }
}
