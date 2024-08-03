/*Write a java program for bank details using multilevel inheritance for the variables such as to
get accno, name, age, gender, acctype, total and display the balance, withdraw, deposit and
annual interest. */
// Base class
class BankDetails {
    int accno;
    String name;
    int age;
    char gender;

    
    BankDetails(int accno, String name, int age, char gender) {
        this.accno = accno;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class AccountType extends BankDetails {
    String acctype;

    AccountType(int accno, String name, int age, char gender, String acctype) {
        super(accno, name, age, gender);
        this.acctype = acctype;
    }

    void displayAccountType() {
        System.out.println("Acc Type: " + acctype);
    }
}

class AccountOperations extends AccountType {
    double balance;

    
    AccountOperations(int accno, String name, int age, char gender, String acctype, double balance) {
        super(accno, name, age, gender, acctype);
        this.balance = balance;
    }


    void displayBalance() {
        System.out.println("Bal: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient bal");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn");
            System.out.println("Remaining Bal: $" + balance);
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited");
        System.out.println("Updated Bal: $" + balance);
    }

    void annualInterest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("Annual Interest: $" + interest);
        System.out.println("Updated Balance: $" + balance);
    }
}

class BankManagementSystem {
    public static void main(String[] args) {
        int accno = 12345;
        String name = "John Doe";
        int age = 30;
        char gender = 'M';
        String acctype = "Savings";
        double balance = 5000.0;

        AccountOperations account = new AccountOperations(accno, name, age, gender, acctype, balance);

        System.out.println("\nAccount Details:");
        account.displayDetails();
        account.displayAccountType();
        account.displayBalance();

        double withdrawAmount = 1000.0;
        account.withdraw(withdrawAmount);

        double depositAmount = 2000.0;
        account.deposit(depositAmount);

        double annualInterestRate = 5.0;
        account.annualInterest(annualInterestRate);
    }
}
