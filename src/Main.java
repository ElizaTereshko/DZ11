import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product1 = new Product(111, "pencil", 5);
        Product product2 = new Product(152, "book", 10);
        Product product3 = new Product(183, "toy", 1);
        Product product4 = new Product(104, "mirror", 7);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);

        shop.getAllProducts();
        Collections.sort(shop.list, new SortByPrice());

        for (Product o: shop.getAllProducts()){
            System.out.println(o.getId() + o.getName() + o.getPrice());
        }

        System.out.println();

        shop.deleteProduct(0);
        for (Product o: shop.getAllProducts()){
            System.out.println(o.getId() + o.getName() + o.getPrice());
        }

        shop.editProduct(0, product1);

    }
}
