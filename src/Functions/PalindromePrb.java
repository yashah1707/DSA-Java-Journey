package Functions;
import java.util.*;

public class PalindromePrb {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();

        int rev = 0;
        int temp = 0;
        int check = num;

        while(num!=0){
            temp = num % 10;
            rev = rev*10 + temp;
            num = num / 10;
        }

        if(rev == check){
            System.out.println("Ther number is palindrome");
        }
        else{
            System.out.println("Ther number is not palindrome");
        }
    }
}