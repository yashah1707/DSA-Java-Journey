package Arrays;
import java.util.*;

public class MaxInRange {
    public static void main(String[] args) {

        int[] arr = {12,54,97,64,56,90,54};

        System.out.println("The max element in range is " + Max(arr, 1, 5));

    }

    public static int Max(int[] arr, int low, int high) {
        int max = arr[low];

        for (int i = low; i <= high; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}