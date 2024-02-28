import java.util.Scanner;

abstract class BankService {

    public String accountHolderName = "SBI";
    public String ifscCode = "SBIN0009330"; 

    public void bankDetail() {
        System.out.println(accountHolderName + " " + ifscCode);
    }

    abstract void deposit();
    abstract void withdraw();
    abstract void checkBalance();
}

class Bank extends BankService {
    private double balance;
    private int pwd;
    Bank() {
        balance = 10000;
    }

    void deposit() {

        System.out.print("Enter pwd: ");
        Scanner input = new Scanner(System.in);
        pwd = input.nextInt();
        if(pwd == 1248) {
            System.out.print("Deposit money: ");
            int money = input.nextInt();
            balance = money + balance;
            System.out.println(money + "has been deposited successfully.");
            System.out.println("Total balance: " + balance);
        }
        else   
            System.out.println("Invalid pwd");
        input.close();
    }

    void withdraw() {

        System.out.print("Enter pwd: ");
        Scanner input = new Scanner(System.in);
        
        pwd = input.nextInt();
        if(pwd == 1248) {
            System.out.print("Enter withdrwal amount: ");
            int money = input.nextInt();
            balance = balance - money;
            System.out.println(money + "has been withdraw successfully.");
            System.out.println("Total balance: " + balance);
        }
        else   
            System.out.println("Invalid pwd");
        input.close();
    }

    void checkBalance() {
        System.out.print("Enter pwd: ");
        Scanner input = new Scanner(System.in);
        pwd = input.nextInt();
        if(pwd == 1248)
            System.out.println("Remaining balance is: " + balance);
        else
            System.out.println("Invalid pwd");
        input.close();
    }
}
public class AbstractBank {

    public static void main(String[] args) {
        Bank b = new Bank();
        Scanner input = new Scanner(System.in);
        b.bankDetail();
        System.out.println("Enter choice: ");
        System.out.println("        - 1. Check Balance.");
        System.out.println("        - 2. Deposit.");
        System.out.println("        - 3. Withdraw.");
        int ch = input.nextInt();

        switch (ch) {
            case 1: b.checkBalance(); 
                break;
            case 2: b.deposit(); 
                break;
            case 3: b.withdraw(); 
                break;
            default: System.out.println("Invalid choice");
                break;
        }

        input.close();
    }     
}