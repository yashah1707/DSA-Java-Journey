package Functions;
import java.util.*;

public class FactorialPrb {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        Factorial(num);
    }

    static void Factorial(int num) {
        int fact = 1;

        if (num == 0 || num == 1) {
            System.out.println(num + "! = " + fact);
        }
        else{
            System.out.print(num + "! = ");
            for(int i=num; i>1; i--){
                fact = fact * i;
                System.out.print(i + " * ");
            }
            System.out.print(1 + " = " + fact);
        }
    }
}