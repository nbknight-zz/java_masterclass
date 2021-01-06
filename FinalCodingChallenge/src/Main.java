public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
	    double price = hamburger.itemizeHambuger();
	    hamburger.addHamburgerAddition1("Tomato", 0.27);
	    hamburger.addHamburgerAddition2("lettuce", 0.75);
	    hamburger.addHamburgerAddition3("cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHambuger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.itemizeHambuger();
        healthyBurger.addHamburgerAddition1("Egg",5.43);
        healthyBurger.itemizeHambuger();
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        healthyBurger.itemizeHambuger();
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHambuger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHambuger();

    }


}
