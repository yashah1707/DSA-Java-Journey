package Functions;
import java.util.*;

public class VotingProb {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = in.nextInt();

        if(age >= 0 && age < 18){
            System.out.println("You are not eligible for voting");
        }
        else {
            System.out.println("You can vote");
        }
    }
}