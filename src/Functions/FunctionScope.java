package Functions;

public class FunctionScope {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        System.out.println(a);

        // System.out.println(marks) -> will throw error because its out of socpe
    }

    static void random(){

        int marks = 654;
        System.out.println(marks);

        // System.out.println(a); -> will give error because its out of scope
    }
}