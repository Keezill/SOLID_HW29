package factoryMethod.creator;

import factoryMethod.entity.Phone;

public interface Creator {
    Phone create(String model, String number, double price);
}
