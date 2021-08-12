package factoryMethod.creator;

import factoryMethod.entity.Cellphone;
import factoryMethod.entity.Phone;

public class CellphoneCreator implements Creator {
    @Override
    public Phone create(String model, String number, double price) {
        return new Cellphone(model, number, price);
    }
}
