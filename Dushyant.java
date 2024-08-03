import java.util.Scanner;

public class Dushyant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine(); 
        String gender = scanner.nextLine();
        String acctype = scanner.nextLine();
        double total = scanner.nextDouble();

        Account account = new Account(name, age, gender, acctype, total);

        System.out.println("\nAccount Details:");
        account.getDetails();

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.print("\nEnter interest rate: ");
        double interestRate = scanner.nextDouble();
        account.calculateInterest(interestRate);

        scanner.close();
    }
}
class Bank {
    String name;
    int age;
    String gender;

    Bank(String newname, int newage, String newgender) {
        name = newname;
        age = newage;
        gender = newgender;
    }

    void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Account extends Bank {
    String acctype;
    double total;

    Account(String name, int age, String gender, String newacctype, double newtotal) {
        super(name, age, gender);
        acctype = newacctype;
        total = newtotal;
    }

    void getDetails() {
        super.getDetails();
        System.out.println("Account Type: " + acctype);
        System.out.println("Total Balance: " + total);
    }

    void withdraw(double amount) {
        if (amount > total) {
            System.out.println("Insufficient balance");
        } else {
            total -= amount;
            System.out.println(amount + " withdrawn successfully");
        }
    }

    void calculateInterest(double rate) {
        double interest = total * rate / 100;
        total += interest;
        System.out.println("Interest added: " + interest);
        System.out.println("Total Balance after interest: " + total);
    }
}