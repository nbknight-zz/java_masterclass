public class VipCustomer {
    // 3 fields name, credit limit, email
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default Name", 50000.00, "default@email.com");
        System.out.println("Empty Person");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 1000.00, emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }



    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
