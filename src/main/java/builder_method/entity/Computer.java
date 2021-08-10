package builder_method.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Computer implements Cloneable{
    private final UUID PRODUCT_ID = UUID.randomUUID();
    private String computerName;
    private int amount;
    private double price;
    private Manufacturer manufacturer;

    private Computer(){}

    public static Builder newBuilder(){
        return new Computer().new Builder();
    }

    public class Builder{
        private Builder(){}

        public Builder setComputerName(String name){
            Computer.this.computerName = name;
            return this;
        }

        public Builder setAmount(int amount){
            Computer.this.amount = amount;
            return this;
        }

        public Builder setPrice(double price){
            Computer.this.price = price;
            return this;
        }

        public Builder setManufacturer(Manufacturer manufacturer){
            Computer.this.manufacturer = manufacturer;
            return this;
        }

        public Computer build() {
            return Computer.this;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Computer cloned = (Computer) super.clone();
        cloned.setManufacturer((Manufacturer)cloned.getManufacturer().clone());
        return cloned;
    }
}
