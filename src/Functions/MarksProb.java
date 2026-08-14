package Functions;
import java.util.*;

public class MarksProb {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = in.nextInt();

        Grade(marks);
    }

    static void Grade(int marks){

        if(marks>90 && marks<=100){
            System.out.println("Grade AA");
        }
        else if(marks>80 && marks<=90){
            System.out.println("Grade AB");
        }
        else if(marks>70 && marks<=80){
            System.out.println("Grade BB");
        }
        else if(marks>60 && marks<=70){
            System.out.println("Grade BC");
        }
        else if(marks>50 && marks<=60){
            System.out.println("Grade CD");
        }
        else if(marks>40 && marks<=50){
            System.out.println("Grade DD");
        }
        else{
            System.out.println("Fail");
        }
    }
}