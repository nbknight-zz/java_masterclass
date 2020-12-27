public class Circle {
    private double radius;

    public Circle(double radius) {
        if(radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    //* Method named getRadius without any parameters, it needs to return the value of radius field.

    public double getRadius() {
        return radius;
    }
    //* Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.

    public double getArea() {
        return (radius * radius * Math.PI);
    }
}
