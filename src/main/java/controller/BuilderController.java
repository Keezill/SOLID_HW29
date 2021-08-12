package controller;

import builderMethod.entity.Computer;
import builderMethod.entity.Manufacturer;

public class BuilderController {
    public static void create(String name, int amount, double price) {
        Manufacturer manufacturer = Manufacturer.newBuilder()
                .setManufacturerName("IBM")
                .build();

        Computer computer = Computer.newBuilder()
                .setComputerName(name)
                .setAmount(amount)
                .setPrice(price)
                .setManufacturer(manufacturer)
                .build();
        System.out.println(computer);
    }
}
