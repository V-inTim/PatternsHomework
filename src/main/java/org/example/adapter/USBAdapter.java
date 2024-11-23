package org.example.adapter;

public class USBAdapter implements  USB{
    CardMemory cardMemory;

    public USBAdapter(CardMemory cardMemory) {
        this.cardMemory = cardMemory;
    }

    @Override
    public String getData() {
        return this.cardMemory.getData();
    }
}
