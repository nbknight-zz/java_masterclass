class Car {
    private String name;
    private boolean engine;
    private int numCylinders;
    private int numWheels;

    public Car(String name, int numCylinders) {
        this.name = name;
        this.numCylinders = numCylinders;
        this.numWheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

//    Didn't need a getter for engine since it is defaulted to True.
//    public boolean isEngine() {
//        return engine;
//    }

    public int getNumCylinders() {
        return numCylinders;
    }

//    Didn't need a getter for wheels since it is defaulted to 4.
//    public int getNumWheels() {
//        return numWheels;
//    }

    public String startEngine() {
        return("Car -> engine is starting");
    }

    public String accelerate() {
        return("Car -> is now speeding up");
    }

    public String brake() {
        return("Car -> is now stopping");
    }
}

class Camaro extends Car {
    public Camaro() {
        super("Camaro", 8);
    }

    @Override
    public String startEngine() {
        return "Camaro - > engine is starting";
    }

    @Override
    public String accelerate() {
        return("Camaro -> is now speeding up");
    }

    @Override
    public String brake() {
        return("Camaro -> is now stopping");
    }
}

class Mustang extends Car {
    public Mustang() {
        super("Mustang", 8);
    }

    @Override
    public String startEngine() {
        return "Mustang - > engine is starting";
    }

    @Override
    public String accelerate() {
        return("Mustang -> is now speeding up");
    }

    @Override
    public String brake() {
        return("Mustang -> is now stopping");
    }
}

class Chevelle extends Car {
    public Chevelle() {
        super("Chevelle", 8);
    }

    @Override
    public String startEngine() {
        return "Chevelle - > engine is starting";
    }

    @Override
    public String accelerate() {
        return("Chevelle -> is now speeding up");
    }

    @Override
    public String brake() {
        return("Chevelle -> is now stopping");
    }
}






public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 5; i++) {
            Car car = randomCar();
            System.out.println("Car number " + i + " is a " + car.getName() + "\n" +
                    car.startEngine() + "\n" +
                    car.accelerate() + "\n" +
                    "Whoa... too fast!!" + "\n" +
                    car.brake() + "\n\n\n\n\n");
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Camaro();
            case 2:
                return new Mustang();
            case 3:
                return new Chevelle();
        }

        return null;
    }
}
