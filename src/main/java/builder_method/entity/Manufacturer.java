package builder_method.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Manufacturer implements Cloneable{
    private String name;

    private Manufacturer() {
    }

    public static Manufacturer.Builder newBuilder() {
        return new Manufacturer().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Manufacturer.Builder setManufacturerName(String name) {
            Manufacturer.this.name = name;
            return this;
        }

        public Manufacturer build() {
            return Manufacturer.this;
        }
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

