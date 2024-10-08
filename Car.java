package Assignment4;

class Car {
    private String carModel;
    private String carName;
    private double carPrice;
    private String carOwner;

    
    public void assignValues(String model, String name, double price, String owner) {
        this.carModel = model;
        this.carName = name;
        this.carPrice = price;
        this.carOwner = owner;
    }

   
    public void display() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Price: $" + carPrice);
        System.out.println("Car Owner: " + carOwner);
        System.out.println("-----------------------------");
    }
}




