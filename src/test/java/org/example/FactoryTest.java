package org.example;

import org.example.factory.Coffee;
import org.example.factory.CoffeeFactory;
import org.example.factory.CoffeeType;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void makeCoffee() throws Exception {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee americano = coffeeFactory.makeCoffee(CoffeeType.AMERICANO);
        Coffee espresso = coffeeFactory.makeCoffee(CoffeeType.ESPRESSO);

        Assert.assertEquals(americano.taste(), "bitter taste");
        Assert.assertEquals(espresso.taste(), "light spicy taste");
    }
}
