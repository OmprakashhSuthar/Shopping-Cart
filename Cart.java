import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (Product product : products) {
                System.out.println(product.getProductName() + " $-" + product.getPrice());
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println(product.getProductName() + " Removed from cart");
    }
}
