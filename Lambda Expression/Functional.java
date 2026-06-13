Question:-
Design a functional-style program using a custom functional interface GreetingService with a single abstract method String greet(String name). The program must read a user name using Scanner, pass a lambda expression to a method, and return a formatted greeting without using any traditional helper class. Input Format: one line – user name. Output Format: display greeting returned by the lambda.
Examples
Example 1:

Input

Amit
Output

Hello Amit, have a great day!
Example 2:

Input

Riya
Output

Hello Riya, have a great day!

  Solution -:
  import java.util.Scanner;

@FunctionalInterface
interface GreetingService {
    String greet(String name);
}

public class Main {

    public static String generateGreeting(String name, GreetingService service) {
        return service.greet(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String message = generateGreeting(
            name,
            n -> "Hello " + n + ", have a great day!"
        );

        System.out.println(message);
    }
}
