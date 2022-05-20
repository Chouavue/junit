public class BankAccount {

    private String name;
    private Double accountBalance;


    public BankAccount( String name, double accountBalance){
        this.name = name;
        this.accountBalance= accountBalance;
    }

        public void deposit(double amount){
            this.accountBalance += amount;
            System.out.println("My account deposit " + amount + " balance: "+ this.accountBalance);
        }

        public void withdrawal(double amount){
            this.accountBalance -= amount;
            System.out.println("My account after " + amount + " withdrawal balance: "+ this.accountBalance);
        }

        public void accountInfo(String accountName, double deposit){
            this.name = name;
            this.accountBalance = accountBalance;
            System.out.println(this.name + "'s" + " account balance: " + this.accountBalance);
        }

        }
    
