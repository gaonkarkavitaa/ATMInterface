import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double balance = 1000;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Check Balance  2.Deposit  3.Withdraw  4.Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            if (ch == 1)
                System.out.println("Balance: " + balance);
            else if (ch == 2) {
                System.out.print("Deposit: ");
                balance += sc.nextDouble();
                System.out.println("New Balance: " + balance);
            } else if (ch == 3) {
                System.out.print("Withdraw: ");
                double amt = sc.nextDouble();
                if (amt <= balance)
                    balance -= amt;
                else 
                System.out.println("Insufficient balance!");
                System.out.println("New Balance: " + balance);
            } else if (ch == 4) {
                System.out.println("Thank you for using the ATM!");
                break;
            } else
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
