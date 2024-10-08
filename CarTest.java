package Assignment4;

public class CarTest {
    public static void main(String[] args) {
        
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        
        car1.assignValues("Model S", "Tesla", 79999.99, "Alice");

        
        car2.assignValues("Mustang", "Ford", 55999.99, "Bob");

        
        car3.assignValues("Civic", "Honda", 22999.99, "Charlie");

       
        System.out.println("Car 1 Details:");
        car1.display();

        System.out.println("Car 2 Details:");
        car2.display();

        System.out.println("Car 3 Details:");
        car3.display();
    }
}


