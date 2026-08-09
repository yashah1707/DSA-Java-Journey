package Functions;
import java.util.*;


public class Sum {
    public static void main(String[] args) {

        sum();

        System.out.println(sum2());
    }

    static int sum2(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
    }

    static void sum(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}