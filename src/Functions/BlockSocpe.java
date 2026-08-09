package Functions;

public class BlockSocpe {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        System.out.println(a);

        {
            //Block Scope
            // int a = 10; -> will throw error because its already defined, you cant define again

            int c = 10;
            System.out.println(c);

            a = 20; // can modify because its accessible in scope but cant define again
            System.out.println(a);
        }

        // System.out.println(c); -> will throw error because its defined inside scope

    }

    static void random(){

        int marks = 654;
        System.out.println(marks);


    }
}