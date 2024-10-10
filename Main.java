public class Main {
    public static void main(String[] args) {
        User user = new User("Jonh Doe", "abc@gmail.com");
        Cart cart = new Cart();

        Product product = new Product("Cell Bottel", 100.00);
        Product product1 = new Product("Milton Bottel", 300.00);

        cart.addProduct(product);
        cart.addProduct(product1);

        cart.displayCart();
        System.out.println("Your order total is " + cart.calculateTotal());
        ;
    }
}
