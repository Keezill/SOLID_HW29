import builderMethod.entity.Computer;
import builderMethod.entity.Manufacturer;
import controller.BuilderController;
import factoryMethod.CreatorApp;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CreatorApp.phoneInfo("smartphone");
        CreatorApp.call("cellphone", "0976644333");

        BuilderController.create("ASUS", 1, 2999.99);

        Manufacturer manufacturer = Manufacturer.newBuilder()
                .setManufacturerName("LENOVO Inc.")
                .build();

        Computer original = Computer.newBuilder()
                .setComputerName("Lenovo")
                .setAmount(2)
                .setPrice(1999.99)
                .setManufacturer(manufacturer)
                .build();

        Computer cloned = (Computer) original.clone();
        cloned.getManufacturer().setName("ASUS");
        System.out.println(original);
        System.out.println(cloned);
    }
}
