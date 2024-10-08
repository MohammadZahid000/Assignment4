package Assignment4;

import java.util.Scanner;

class Employee {
    private double salary;
    private int workHours;

    
    public void getInfo(double salary, int workHours) {
        this.salary = salary;
        this.workHours = workHours;
    }

    
    public void addSal() {
        if (salary < 500) {
            salary += 10; 
        }
    }

   
    public void addWork() {
        if (workHours > 6) {
            salary += 5; 
        }
    }

   
    public double getFinalSalary() {
        return salary;
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the number of hours worked per day: ");
        int workHours = scanner.nextInt();

        
        Employee employee = new Employee();
        employee.getInfo(salary, workHours);

       
        employee.addSal();
        employee.addWork();

        
        System.out.printf("Final salary of the employee: $%.2f%n", employee.getFinalSalary());

        scanner.close();
    }
}

