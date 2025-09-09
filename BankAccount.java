class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAMountException extends RuntimeException {
    public InvalidAMountException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance = 1000;
    public  void withdraw(double amount) throws InsufficientFundsException{
        if(amount <= 0){
            throw new InvalidAMountException("Negative and zero values not allowed");
        }
        if(amount > balance){
            throw new InsufficientFundsException("Not enough balance");
        }
        balance -= amount;
        System.out.println("Remaining Balance: "+balance);

    }



}
