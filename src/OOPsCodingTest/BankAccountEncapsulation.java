package OOPsCodingTest;

public class BankAccountEncapsulation {
    public static void main(String[] args) {

        bankAccount b1 = new bankAccount(1000);
        b1.deposit(500);
        b1.withdraw(200);

    }
}

class bankAccount
{
    private double balance;

    public bankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance. Setting to 0");
        }
    }

        //deposit method
        public void deposit(double amount)
        {
            if(amount>0)
            {
                balance += amount;
                System.out.println("Balance after deposit: " + balance);
            }
            else {
                System.out.println("Invalid deposit amount");
            }
        }

        //withdraw method
        public void withdraw(double amount)
        {
            if(amount>0 && amount<=balance)
            {
                balance -= amount;
                System.out.println("Balance after withdrawal: " + balance);
            }
            else {
                System.out.println("Insufficient funds, enter any other amount");
            }
        }




    }


