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
    
    
    
}