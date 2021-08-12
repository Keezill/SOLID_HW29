package factoryMethod.creator;

import factoryMethod.entity.Phone;
import factoryMethod.entity.Smartphone;

public class SmartphoneCreator implements Creator {
    @Override
    public Phone create(String model, String number, double price) {
        return new Smartphone(model, number, price);
    }
}
