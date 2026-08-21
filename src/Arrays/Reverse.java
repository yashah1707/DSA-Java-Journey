package Arrays;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {

        int[] arr = {12,54,78,49,61,31,15};

        System.out.println("Array " +  Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        int temp;

        for(int i=0 ; i<(arr.length)/2 ; i++){
            temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
        }

        System.out.println("Reversed array is " + Arrays.toString(arr));
    }
}