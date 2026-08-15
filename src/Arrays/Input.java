package Arrays;
import java.util.*;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        //arr[0] = 1;
        //arr[1] = 54;
        //arr[2] = 145;
        //arr[3] = 45;
        //arr[4] = 99;
        //System.out.println(arr[2]);

        //Input using loop
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        //for (int j : arr) {
        //    System.out.println(j);
        //}

        //new way for op
        System.out.println(Arrays.toString(arr));
    }
}
