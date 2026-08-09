package Functions;

public class StringExample {
    public static void main(String[] args) {
        Greeting();
        System.out.println(GreetName("Yash"));
    }

    static String GreetName(String name){
        return ("hello" + name);
    }

    static void Greeting(){
        System.out.println("Hello World");
    }
}