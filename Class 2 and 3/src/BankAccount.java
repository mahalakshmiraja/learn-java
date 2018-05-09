public class BankAccount {
    //Member Variable
    public String name;
    double balance;
    public static int numberOfAccounts = 0;
    int accountId;


    //Constructor
    public BankAccount(String accountHolder){
        name = accountHolder;
        balance = 0.0;
        numberOfAccounts +=1;
        accountId = numberOfAccounts;
    }

    //Methods
    public double deposit(double amountToDeposit){
        balance +=amountToDeposit;
        return balance;
    }

    public boolean withdraw(double amountToWithdraw){
        if(balance<=amountToWithdraw){
            System.out.println("Withdraw amt greater than balance");
            return false;

        }else{
            balance -=amountToWithdraw;
            return true;
        }

    }

    public double getBalance(){
        return balance;
    }

    public void printValues(){
        System.out.println(name +"'s"+ " bank account has $"+ balance);
    }
}
