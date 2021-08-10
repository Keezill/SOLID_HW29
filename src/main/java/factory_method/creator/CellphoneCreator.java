package factory_method.creator;

import factory_method.entity.Cellphone;
import factory_method.entity.Phone;

public class CellphoneCreator implements Creator{
    @Override
    public Phone create(String model, String number, double price) {
        return new Cellphone(model, number, price);
    }
}
