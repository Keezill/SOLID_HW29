package factory_method.creator;

import factory_method.entity.Phone;
import factory_method.entity.Smartphone;

public class SmartphoneCreator implements Creator {
    @Override
    public Phone create(String model, String number, double price) {
        return new Smartphone(model, number, price);
    }
}
