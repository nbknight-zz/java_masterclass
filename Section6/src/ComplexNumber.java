public class ComplexNumber {

    //field 1 real(double)
    private double real;
    //field 2 imaginary(double)
    private double imaginary;

    //1 constructor, 2 params, instantiate
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    //Method named getReal without any parameters, it needs to return the value of real field.

    public double getReal() {
        return real;
    }

    //Method named getImaginary without any parameters, it needs to return the value of imaginary field.
    public double getImaginary() {
        return imaginary;
    }

    //Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields.
    // In other words, it needs to do a complex number add operation as described above.
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;

    }

    // Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the corresponding instance variables.
    public void add(ComplexNumber other) {
        add(other.getReal(),other.getImaginary());
    }
    // Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters
    //from fields, in other words, it needs to do a complex number subtract operation as described above.
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;

    }

    // Method named subtract with one parameter other of type ComplexNumber. It needs to subtract the other parameter
    // from this complex number.
    public void subtract(ComplexNumber other) {
         subtract(other.getReal(),other.getImaginary());



    }
}
