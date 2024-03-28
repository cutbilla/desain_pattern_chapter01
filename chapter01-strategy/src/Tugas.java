interface PaymentStrategy {
    // Definisikan interface Strategy
    void pay(double jumlah);
}

// Implementasikan beberapa strategi pembayaran
class CreditCard implements PaymentStrategy {
    @Override
    public void pay(double jumlah) {
        System.out.println("Pembayaran dengan kartu kredit sebesar : " + jumlah);
    }
}

class PayPal implements PaymentStrategy {
    @Override
    public void pay(double jumlah) {
        System.out.println("Pembayaran dengan PayPal sebesar : " + jumlah);
    }
}

class BankTransfer implements PaymentStrategy {
    @Override
    public void pay(double jumlah) {
        System.out.println("Pembayaran dengan transfer bank sebesar : " + jumlah);
    }
}

// Definisikan kelas Konteks yang akan menggunakan strategi pembayaran
class ShoppingCart {
    public PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double jumlah) {
        paymentStrategy.pay(jumlah);
    }
}