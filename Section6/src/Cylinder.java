public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height < 0) {
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    //* Method named getHeight without any parameters, it needs to return the value of height field.

    public double getHeight() {
        return height;
    }
    //* Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume
    // multiply the area with height.

    public double getVolume() {
        return (getArea()*height);
    }

}
