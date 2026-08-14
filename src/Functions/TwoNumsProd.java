package Functions;
import java.util.*;

public class TwoNumsProd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = in.nextInt();

        System.out.println("Product is " + Prod(num1,num2));
    }

    static int Prod(int a, int b){
        return a+b;
    }
}
