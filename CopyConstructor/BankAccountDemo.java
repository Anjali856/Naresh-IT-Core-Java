import java.util.Scanner;
public class BankInterestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String name = sc.next();
        double principal = sc.nextDouble();
        double time = sc.nextDouble();

       
        BankAccount originalAccount = new BankAccount(name, principal, time);

        
        BankAccount updatedAccount = new BankAccount(originalAccount);
        double interestAdded = updatedAccount.getFinalAmount() - principal;

        System.out.println("--- Original Account Details ---");
        System.out.println(originalAccount);

        System.out.println("\n--- Updated Account Details (After Interest Calculation using Copy Constructor) ---");
        System.out.println(updatedAccount);
        System.out.println("Interest Added : " + interestAdded);
        System.out.println("Final Amount : " + updatedAccount.getFinalAmount());
    }
}
