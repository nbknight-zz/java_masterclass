public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double heathyExtra1Price;
    private String healthyExtra2Name;
    private double heathyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.heathyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.heathyExtra2Price = price;
    }

    @Override
    public double itemizeHambuger() {
        double hamburgerPrice = super.itemizeHambuger();
        if(this.healthyExtra1Name != null) {
            hamburgerPrice += this.heathyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra $" + this.heathyExtra1Price);
        }

        if(this.healthyExtra2Name != null) {
            hamburgerPrice += this.heathyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra $" + this.heathyExtra2Price);
        }
        return hamburgerPrice;
    }
}
