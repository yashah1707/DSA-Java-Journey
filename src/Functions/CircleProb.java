package Functions;
import java.util.*;

public class CircleProb {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius: ");
        float rad =  in.nextFloat();

        System.out.println("Area is " + Area(rad));
        System.out.println("Circumference is " + Circumference(rad));
    }

    static float Area(float r){

        return (3.14f*r*r);
    }

    static float Circumference(float r){

        return (2*3.14f*r);
    }
}