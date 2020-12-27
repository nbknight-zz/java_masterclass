public class Main {

    public static void main(String[] args) {
//        Car porsche = new Car(); //This initializes the class
//        Car holden = new Car();
//        System.out.println("Model is " + porsche.getModel());
//        porsche.setModel("911");
//        System.out.println("Model is " + porsche.getModel());

//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setCustomerName("Nick Knight");
//        bankAccount.setAcctNumber(123456789);
//        bankAccount.setBalance(1000.00);
//        bankAccount.setEmail("nickknight@fakemail.com");
//        bankAccount.setPhoneNumber("123-123-1234");
//
//        System.out.println("Customer is " + bankAccount.getCustomerName() + " and can be reached at" +
//                " number: " + bankAccount.getPhoneNumber() + " or emailed at " + bankAccount.getEmail());
//        System.out.println(bankAccount.getAcctNumber() + " has a current balance of $" + bankAccount.getBalance());
//        bankAccount.depositFund(500.00);
//        System.out.println("After your deposit of $" + bankAccount.deposit + " your new balance is $" +
//                bankAccount.getBalance());
//        bankAccount.withdrawFunds(1000.00);
//        System.out.println("After a withdrawal of $" + bankAccount.withdrawal + " your new balance is $" +
//                bankAccount.getBalance());

//        BankAccount nicksAccount = new BankAccount(123456,1000.00,"Nick Knight",
//                "nick.knight@fakemail.com","123-123-1234");

//        BankAccount nicksAccount = new BankAccount();
//
//        nicksAccount.withdraw(1100.00);
//        nicksAccount.deposit(50.00);
//        nicksAccount.withdraw(1100.00);
//
//        nicksAccount.deposit(51.00);
//        nicksAccount.withdraw(1100.00);
//
//        BankAccount bobsAccount = new BankAccount("Bob", "bob@email.com", "123-345-5679");
//        System.out.println(bobsAccount.getAcctNumber() + " name " + bobsAccount.getCustomerName());

//        VipCustomer person1 = new VipCustomer();
//        System.out.println(person1.getName());
//
//        VipCustomer person2 = new VipCustomer("Bob", "bob@bob.com");
//        System.out.println(person2.getName());
//
//        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
//        System.out.println(person3.getName());
//
//        Wall wall = new Wall(1.125,-1.0);
//        System.out.println("area= " + wall.getArea());
//
//        wall.setWidth(1.125);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());

//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        ComplexNumber one = new ComplexNumber(2.0, 2.0);
//        ComplexNumber number = new ComplexNumber(2.0, 2.0);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());

//        Camaro camaro = new Camaro(36);
//        camaro.steer(45);
//        camaro.accelerate(30);
//        camaro.accelerate(20);
//        camaro.accelerate(-42);

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());


    }
}
