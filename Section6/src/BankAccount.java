
public class BankAccount {
    private int acctNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //if an empty constructor is called, let's pass some default values
    public BankAccount() {
        this(00000, 0.00, "Default Name", "Default email", "Default phone");
        System.out.println("Empty account made");
    }


    //create constructor
    public BankAccount(int acctNumber, double balance, String customerName, String email, String phoneNumber) {
        this.acctNumber = acctNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("New Account Created for " + this.customerName);
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999,100.55, customerName,email,phoneNumber);
    }

    public double getBalance() {
        return balance;
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public String getCustomerName() {
        return customerName.toUpperCase();
    }

    public String getEmail() {
        return email.toLowerCase();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
//    public double deposit;
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. You now have a balance of $" + this.balance);
    }
//    public double withdrawal;
    public void withdraw(double withdrawalAmount) {
        if(balance - withdrawalAmount < 0){
            System.out.println("Sorry, you do not have sufficient funds for the withdrawal. Current balance:  $" + balance);
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Widthdrawel of $" + withdrawalAmount + " processed. You now have a balance of $" + this.balance);
        }
    }


}
