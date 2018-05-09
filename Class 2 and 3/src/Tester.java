public class Tester {
    public static void main(String[] args){

        BankAccount obj = new BankAccount("Maha");
        System.out.println(obj.deposit(200));
        obj.withdraw(500);
        obj.printValues();


        BankAccount obj2 = new BankAccount("Tina");
        obj2.deposit(100);
        if(obj2.withdraw(150)== false){
            obj2.withdraw(50);
        }
        obj2.printValues();

        BankAccount obj3 = new BankAccount("Shana");
        System.out.println(BankAccount.numberOfAccounts);
    }
}
