package Arrays;

import java.util.*;

public class Max {
    public static void main(String[] args) {

        int[] arr = {45,87,15,32,466,102};

        System.out.println("The max element from array is " + max(arr));

    }

    public static int max(int[] arr){
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }
}