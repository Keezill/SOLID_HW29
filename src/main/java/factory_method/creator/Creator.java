package factory_method.creator;

import factory_method.entity.Phone;

public interface Creator {
    Phone create(String model, String number, double price);
}
