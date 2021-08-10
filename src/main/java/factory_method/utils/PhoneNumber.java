package factory_method.utils;


import lombok.Getter;

public class PhoneNumber {
    private final int MAX_NUMBER_LENGTH = 13;
    private final int MIN_NUMBER_LENGTH = 10;
    @Getter
    private String number;

    public PhoneNumber(String number){
        validate(number);
        this.number = number;
    }

    private void validate(String number) {
        if(number == null
                || number.length() < MIN_NUMBER_LENGTH
                || number.length() > MAX_NUMBER_LENGTH){
            throw new IllegalArgumentException();
        }
    }
}
