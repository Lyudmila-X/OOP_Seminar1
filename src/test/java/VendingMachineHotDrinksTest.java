import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineHotDrinksTest extends TestCase {

    public void testGetProduct() {
        List<Product> incomeList = new ArrayList<Product>(Arrays.asList(
                new HotDrinks("Americano", 5.00, 0.2, false, false),
                new HotDrinks("Americano", 7.00, 0.2, true, false),
                new HotDrinks("Americano", 9.00, 0.2, true, true),
                new HotDrinks("Cappuccino", 7.00, 0.2, false, true),
                new HotDrinks("Cappuccino", 9.00, 0.2, true, true)));
        VendingMachineHotDrinks vmhd = new VendingMachineHotDrinks(incomeList);
        HotDrinks expectedDrink = new HotDrinks("Americano", 9.00, 0.2, true, true);
        HotDrinks actualDrink = vmhd.getProduct("Americano", true, true);

        Assertions.assertEquals(expectedDrink,actualDrink);
    }
}