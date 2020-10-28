public class Tester{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Password", 5132);
        System.out.println(acc1.getAccountID());
        System.out.println(acc1.getBalance());
        System.out.println(acc1.deposit(20));
        System.out.println(acc1.getBalance());
        System.out.println(acc1.withdraw(17.5));
        System.out.println(acc1.getBalance());
        System.out.println(acc1.balanceIDtoString());
    }
}