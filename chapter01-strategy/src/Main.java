//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        System.out.println("MallarDuck");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\n");

        System.out.println("ModelDuck");
        Duck modelduck = new ModelDuck();
        modelduck.performFly(); // Akan memanggil constructor modelduck(FlyNoWay())
        modelduck.setFlyBehavior(new FlyWithRocketPower());
        modelduck.performFly();

        System.out.println("--------------------------");
        System.out.printf("\n \n");

        // Buat objek-objek strategi pembayaran
        PaymentStrategy creditCardPayment = new CreditCard();
        PaymentStrategy paypalPayment = new PayPal();
        PaymentStrategy bankTransferPayment = new BankTransfer();

        // Buat objek keranjang belanja dengan strategi pembayaran yang berbeda-beda
        ShoppingCart cart1 = new ShoppingCart(creditCardPayment);
        ShoppingCart cart2 = new ShoppingCart(paypalPayment);
        ShoppingCart cart3 = new ShoppingCart(bankTransferPayment);

        // Lakukan checkout untuk setiap keranjang belanja
        cart1.checkout(100);
        cart2.checkout(200);
        cart3.checkout(300);
        }
}