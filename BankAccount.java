
public class BankAccount{
    //Instance Variables
    private String password;
    private double balance;
    private int accountID;

    public BankAccount(int a, String b){
        accountID = a;
        password = b;
        balance = 0;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public int getAccountID(){
        return accountID;
    }
    public void setPassword(String pass){
        password = pass;
    }

    public boolean deposit(double x){
        if(x > 0){
            balance += x;
            return true;
        }else{
            return false;
        }
    }

    public boolean withdraw(double x){
        if(x > balance || x < 0){
            return false;
        }else{
            balance -= x;
            return true;
        }
    }

    public String toString(){
        String str = "#" + accountID + "\t" + "$" + balance;
        return str;
    }

    private boolean authenticate(String password){
        return password.equals(this.password);
    }

    public boolean transferTo(BankAccount other, double amount, String password){
        if(authenticate(password)&& withdraw(amount) ){
            if(other.deposit(amount)){
                return true;
            }
        }

        return false;
    }
}