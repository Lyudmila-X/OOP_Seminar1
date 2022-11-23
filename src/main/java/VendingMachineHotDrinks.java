import java.util.List;

public class VendingMachineHotDrinks extends VendingMachine {
     public VendingMachineHotDrinks(List<Product> list){
         super(list);
     }

    public Product getProduct(String name){
        for(Product item: super.list){
            if(item.getName().equalsIgnoreCase(name)){
                return item;
            }
        }
        throw new IllegalStateException("Product not found");
    }

    public HotDrinks getProduct (String name, Boolean sugar, Boolean cream) {
        for (Product item:super.list){
            if (item instanceof HotDrinks){
                if (item.getName().equalsIgnoreCase(name) && ((HotDrinks) item).getSugar().equals(sugar) && ((HotDrinks) item).getCream().equals(cream)){
                    return (HotDrinks) item;
            }
            }
        }
        throw new IllegalStateException("Product not found");
    }

}
