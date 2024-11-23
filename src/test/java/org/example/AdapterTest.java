package org.example;

import org.example.adapter.CardMemory;
import org.example.adapter.Computer;
import org.example.adapter.USBAdapter;
import org.example.factory.Coffee;
import org.example.factory.CoffeeFactory;
import org.example.factory.CoffeeType;
import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void readUSB() {
        Computer computer = new Computer();
        CardMemory cardMemory = new CardMemory();
        USBAdapter adapter = new USBAdapter(cardMemory);

        Assert.assertEquals("Reading data from USB: Data from Memory Card", computer.readUSB(adapter));

    }
}
