package project;

class Chef1 extends Thread {
    public void run() {
        System.out.println("Chef 1 is chopping vegetables.");
        try {
            Thread.sleep(2000); // Simulating time taken to chop vegetables
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Chef 1 finished chopping vegetables.");
    }
}

class Chef2 extends Thread {
    public void run() {
        System.out.println("Chef 2 is grilling meat.");
        try {
            Thread.sleep(3000); // Simulating time taken to grill meat
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Chef 2 finished grilling meat.");
    }
}

public class Restaurentmulti{
    public static void main(String[] args) {
        Chef1 chef1 = new Chef1();
        Chef2 chef2 = new Chef2();

        // Start both chefs (threads)
        chef1.start();
        chef2.start();

        try {
            chef1.join(); // Wait for chef1 to finish before continuing
            chef2.join(); // Wait for chef2 to finish before continuing
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Meal is ready!");
    }
}

