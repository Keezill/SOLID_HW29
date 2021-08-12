package factoryMethod.entity;

import lombok.Value;

@Value
public class Cellphone implements Phone {
    String model;
    String number;
    double price;

    @Override
    public void doCall(String number) {
        System.out.println("Calling to " + number);
    }

    @Override
    public void info() {
        System.out.printf("%s [%s] has number %s and cost %.2f%n",
                this.getClass().getSimpleName(), this.getModel(), this.getNumber(), this.getPrice());
    }
}
