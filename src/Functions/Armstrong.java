package Functions;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = in.nextInt();

        System.out.println(Armstrong(n));
    }

    static boolean Armstrong(int n){

        int num = n;
        int temp = 0;
        int sum = 0;

        while(n!=0){
            temp = n%10;
            sum = sum + temp*temp*temp;
            n = n/10;
        }

        if(num==sum){
            return true;
        }
        return false;
    }
}