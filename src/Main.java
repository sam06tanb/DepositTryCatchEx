import entities.Account;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

try {
 Account account = new Account();

 System.out.print("Account number: ");
 int n = sc.nextInt();
 account.setNumber(n);
 System.out.print("Account holder: ");
 String h = sc.next();
 account.setHolder(h);
 System.out.print("Account balance: ");
 double b = sc.nextDouble();
 account.setBalance(b);
 System.out.print("Withdraw Limit: ");
 double wl = sc.nextDouble();
 account.setWithdrawLimit(wl);

 System.out.println("Enter amount for withdraw: ");
 double wt = sc.nextDouble();
 account.setWithdraw(wt);

 System.out.println("New balance: " + account.getBalance());

} catch (InputMismatchException e) {
    System.out.println("Error 1: Only numbers!");

} catch (Exception ex) {
    System.out.println("Error 2: " + ex.getMessage());

} catch (Error uncaught) {
    System.out.println("Uncaught exception occurred: " + uncaught.getMessage());
   }
}


    }

