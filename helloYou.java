import java.util.Scanner;

public class helloYou{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.println("Whats your name?");
        name = scanner.nextLine();
        System.out.println("Hello " + name + " nice to meet you :)");
    }
}