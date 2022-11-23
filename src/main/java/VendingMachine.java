import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    protected List<Product> list;
    public VendingMachine (List<Product> list){
        this.list = list;
    }

    public Product getProduct (String name){
        for (Product item:this.list){
            if (item.getName().equals(name)){
                return item;
            }
        }
        throw new IllegalStateException("Product not found");
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }
}
