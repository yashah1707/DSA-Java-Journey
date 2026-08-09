package Functions;

public class FunctionSocpe {
    public static void main(String[] args) {

        int a = 5;

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println();

        // System.out.println(i); -> error
    }
}
