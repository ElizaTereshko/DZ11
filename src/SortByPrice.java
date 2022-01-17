import java.util.Comparator;

public class SortByPrice implements Comparator <Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if(product1.getPrice() < product2.getPrice()){
            return -1;
        }
        if(product1.getPrice() > product2.getPrice()) {
            return 1;
        }
        return 0;
    }
}
