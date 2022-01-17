import java.util.ArrayList;
import java.util.List;


public class Shop {
    List <Product> list = new ArrayList<Product>();

    public void addProduct(Product product){
        list.add(new Product(product.getId(), product.getName(), product.getPrice()));
    }

    public List <Product> getAllProducts(){
        return list;
    }

    public void deleteProduct(int id){
        list.remove(id);
    }

    public void editProduct(int index, Product product){
        list.set(index, new Product(product.getId(), product.getName(), product.getPrice()));
    }
}
