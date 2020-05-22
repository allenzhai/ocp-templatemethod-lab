package lab.assignment.afterrefactoring.clientcode;


import lab.assignment.afterrefactoring.AmericanoCoffee;
import lab.assignment.afterrefactoring.CapuccinoCoffee;
import lab.assignment.afterrefactoring.CoffeeTemplate;
import lab.assignment.afterrefactoring.MochaCoffee;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new AmericanoCoffee();

        //using template method
        coffeeType.prepareCoffee();
        System.out.println("************");

        coffeeType = new MochaCoffee();
        coffeeType.prepareCoffee();

        System.out.println("************");

        coffeeType = new CapuccinoCoffee();
        coffeeType.prepareCoffee();

    }

}
