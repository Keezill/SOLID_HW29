package controller;

import factory_method.creator.CellphoneCreator;
import factory_method.creator.Creator;
import factory_method.creator.SmartphoneCreator;
import factory_method.entity.Phone;
import factory_method.utils.PhoneNumber;

import java.util.stream.Stream;

public class CreatorController {

    public static void getInfo(String config) {
        Creator creator = getCreator(config);

        Phone phone1 = creator.create("Apple iPhone 5", "+380934465966", 699.99);
        Phone phone2 = creator.create("Nokia 3310", "+380932166677", 299.99);
        Phone phone3 = creator.create("Samsung galaxy S10", "+380976644333", 699.99);
        Stream.of(phone1, phone2, phone3).forEach(Phone::info);
    }

    public static void call(String config, String number){
        Creator creator = getCreator(config);

        Phone phone1 = creator.create("Apple iPhone 5", "+380934465966", 699.99);
        Phone phone2 = creator.create("Nokia 3310", "+380932166677", 299.99);
        Phone phone3 = creator.create("Samsung galaxy S10", "+380976644333", 699.99);

        PhoneNumber number1 = new PhoneNumber(number);
        Stream.of(phone1, phone2, phone3).forEach(p -> p.doCall(number1.getNumber()));
    }

    private static Creator getCreator(String config) {
        return switch (config) {
            case "smartphone" -> new SmartphoneCreator();
            case "cellphone" -> new CellphoneCreator();
            default -> throw new IllegalArgumentException(config);
        };
    }
}
