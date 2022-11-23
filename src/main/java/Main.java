import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> listofProducts = new ArrayList<Product>(Arrays.asList(
                new Product("Mars", 30.00),
                new Product("Twix", 45.00),
                new Product("Milky Way", 30.00)
        ));
        List<Product> listofDrinks = new ArrayList<Product>(Arrays.asList(
                new Drinks("Coca-Cola", 50.00, 0.5),
                new Drinks("Fanta", 50.00, 0.5),
                new Drinks("Cone Forest", 30.00, 0.5)
        ));
        List<Product> listofHotDrinks = new ArrayList<Product>(Arrays.asList(
                new HotDrinks("Americano", 5.00, 0.2, false, false),
                new HotDrinks("Mocaccino", 7.00, 0.2, true, true),
                new HotDrinks("Cappuccino", 7.00, 0.2, false, true),
                new HotDrinks("Cappuccino", 12.00, 0.2, true, true),
                new HotDrinks("Cappuccino with sugar", 7.00, 0.2, true, true)
        ));

        VendingMachine vendy = new VendingMachine(listofProducts);
        System.out.println(vendy.getProduct("Twix"));

        VendingMachine vendyBottle = new VendingMachineDrinks(listofDrinks);
        System.out.println(vendyBottle.getProduct("Fanta"));

        VendingMachineHotDrinks hotDrinks = new VendingMachineHotDrinks(listofHotDrinks);
        System.out.println(hotDrinks.getProduct("Cappuccino"));
        System.out.println(hotDrinks.getProduct("Cappuccino", true, true));
    }

}
