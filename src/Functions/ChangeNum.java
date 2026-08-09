package Functions;

import java.util.Arrays;

public class ChangeNum {
    public static void main(String[] args) {
        int[] arr = {12,54,89,4,10};

        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}