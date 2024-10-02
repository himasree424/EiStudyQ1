package behavioral;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(100);
        cart.addItem(200);

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout();

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout();
    }
}