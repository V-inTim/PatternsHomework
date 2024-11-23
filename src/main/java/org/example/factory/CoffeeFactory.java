package org.example.factory;

public class CoffeeFactory {

    public Coffee makeCoffee(CoffeeType coffeeType) throws Exception {
        Coffee coffee = null;
        switch (coffeeType){
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            default:
                throw new Exception("Unknown coffee type.");
        }
        return coffee;
    }
}
