package Assignment4;
public class Triangle {
    private double a; 
    private double b; 
    private double c; 

    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    public double perimeter() {
        return a + b + c;
    }

    
    public double area() {
        double s = perimeter() / 2; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

   
    public static void main(String[] args) {
       
        Triangle triangle = new Triangle(3, 4, 5);

       
        System.out.printf("Area of the triangle: %.2f%n", triangle.area());
        System.out.printf("Perimeter of the triangle: %.2f%n", triangle.perimeter());
    }
}
