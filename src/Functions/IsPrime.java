//Prime number

package Functions;

import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
        for(int i=2; i<n/2; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }

}