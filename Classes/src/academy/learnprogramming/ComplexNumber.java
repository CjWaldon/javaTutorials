package academy.learnprogramming;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
        System.out.println("one.real= "+this.real);
        System.out.println("one.imaginary= "+this.imaginary);
    }

    public void add(ComplexNumber complexNumber){
        add(complexNumber.real, complexNumber.imaginary);
        System.out.println("number.real= "+this.real);
        System.out.println("number.imaginary= "+this.imaginary);
    }

    public void subtract(double real, double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
        System.out.println("one.real= "+ this.real);
        System.out.println("one.imaginary= "+this.imaginary);
    }

    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.real,complexNumber.imaginary);
        System.out.println("number.real= "+real);
        System.out.println("number.imaginary= "+imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
