import java.nio.channels.AcceptPendingException;

public class BankAccount{
    //Instance Variables
    private String password;
    private double balance;
    private int accountID;

    public BankAccount(String a, int b){
        password = a;
        accountID = b;
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

    public String balanceIDtoString(){
        String x = Integer.toString(accountID);
        String y = Double.toString(balance);
        return x + "\t" + y;
    }
}