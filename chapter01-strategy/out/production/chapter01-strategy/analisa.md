## Analisa program Duck :

- `interface QuackBehavior` adalah class interface yang berisikan
method abstract `quack()`
- `interface QuackBehavior{}`, mendefinisikan sebuah interface yang memiliki satu method `quack()` tanpa implementasi.
- `interface FlyBehavior{}`, mendefinisikan sebuah interface yang memiliki satu method `fly()` tanpa implementasi.
- `class Quack implements QuackBehavior{}`, mengimplementasikan interface `QuackBehavior`,
dengan mengimplementasikan method `quack()` untuk menghasilkan suara "Qwek - Qwek".
- `class Squeak implements QuackBehavior{}`: Mengimplementasikan interface `QuackBehavior`,
dengan mengimplementasikan method `quack()` untuk menghasilkan suara "Squeak".
- `class MuteQuack implements QuackBehavior{}`: Mengimplementasikan interface `QuackBehavior`,
dengan mengimplementasikan method `quack()` untuk menghasilkan suara "Tidak Bisa Bersuara".
- `class FlyWithWings implements FlyBehavior {}`: Mengimplementasikan interface `FlyBehavior`,
dengan mengimplementasikan method `fly()` untuk menampilkan "Terbang".
- `class FlyNoWay implements FlyBehavior{}`: Mengimplementasikan interface `FlyBehavior`,
dengan mengimplementasikan method `fly()` untuk menampilkan "Tidak Bisa Terbang".
- `class FlyWithRocketPower implements FlyBehavior{}`: Mengimplementasikan interface `FlyBehavior`, 
dengan mengimplementasikan method `fly()` untuk menampilkan "Cool, Terbang Menggunakan Roket".
- `abstract class Duck {}`: Mendefinisikan kelas abstrak `Duck` yang memiliki atribut `QuackBehavior` dan `FlyBehavior`,
serta beberapa method seperti `display()`, `swim()`, `performQuack()`, `performFly()`, `setFlyBehavior()`, dan `setQuackBehavior()`.
- `void swim(){}`: Method untuk menampilkan "Berenang" saat dipanggil.
- `void performQuack(){}`: Method untuk melakukan quack, yang pada gilirannya memanggil method quack dari `QuackBehavior` yang diset.
- `void performFly(){}`: Method untuk melakukan terbang, yang pada gilirannya memanggil method fly dari `FlyBehavior` yang diset.
- `public void setFlyBehavior(FlyBehavior fb) {}`: Method untuk mengatur behavior terbang.
- `public void setQuackBehavior(QuackBehavior qb) {}`: Method untuk mengatur behavior quack.
- `class MallardDuck extends Duck {}`: Mendefinisikan kelas `MallardDuck` yang merupakan subkelas dari `Duck`, 
dan mengatur behavior quack dan terbang untuk bebek Mallard.
- `class RedHeadDuck extends Duck {}`: Mendefinisikan kelas `RedHeadDuck` yang merupakan subkelas dari `Duck`,
dan mengatur behavior quack dan terbang untuk bebek Red Head.
- `class RubberDuck extends Duck{}`: Mendefinisikan kelas `RubberDuck` yang merupakan subkelas dari `Duck`,
dan mengatur behavior quack dan terbang untuk bebek karet.
- `class WoodenDuck extends Duck {}`: Mendefinisikan kelas `WoodenDuck` yang merupakan subkelas dari `Duck`, 
dan mengatur behavior quack dan terbang untuk bebek kayu.
- `class ModelDuck extends Duck {}`: Mendefinisikan kelas `ModelDuck` yang merupakan subkelas dari `Duck`, 
dan mengatur behavior quack dan terbang untuk bebek model.
- `System.out.println("MallarDuck");`: Mencetak "MallardDuck" ke konsol.
- `Duck mallard = new MallardDuck();`: Membuat sebuah objek `mallard` dari kelas `MallardDuck`, yang merupakan subkelas dari `Duck`.
- `mallard.performQuack();`: Memanggil method `performQuack()` dari objek `mallard`, 
yang pada gilirannya akan memanggil method `quack()` dari behavior quack yang telah diatur sebelumnya untuk bebek Mallard.
- `mallard.performFly();`: Memanggil method `performFly()` dari objek `mallard`, 
yang pada gilirannya akan memanggil method `fly()` dari behavior terbang yang telah diatur sebelumnya untuk bebek Mallard.
- `System.out.println("ModelDuck");`: Mencetak "ModelDuck" ke konsol.
- `Duck modelduck = new ModelDuck();`: Membuat sebuah objek `modelduck` dari kelas `ModelDuck`, 
yang merupakan subkelas dari `Duck`. Saat pembuatan objek, constructor `ModelDuck()` akan dipanggil, yang secara default mengatur behavior terbang menjadi `FlyNoWay()`.
- `modelduck.performFly();`: Memanggil method `performFly()` dari objek `modelduck`, 
yang pada gilirannya akan memanggil method `fly()` dari behavior terbang yang telah diatur sebelumnya untuk bebek Model. Karena pada konstruksi objek `ModelDuck`, behavior terbang diatur sebagai `FlyNoWay()`, maka akan mencetak "Tidak Bisa Terbang".
- `modelduck.setFlyBehavior(new FlyWithRocketPower());`: Mengatur behavior terbang objek `modelduck` menjadi `FlyWithRocketPower()`, 
yang berarti bebek Model sekarang dapat terbang menggunakan roket.
- `modelduck.performFly();`: Memanggil kembali method `performFly()` dari objek `modelduck`,
yang sekarang telah diatur untuk terbang dengan menggunakan roket, sehingga akan mencetak "Cool, Terbang Menggunakan Roket".


## Analisa dari program Tugas.java :
- `interface PaymentStrategy` yang memiliki satu method abstract yang
bernama `pay` yang akan digunakan untuk melakukan pembayaran dengan jumlah tertentu.
- `void pay(double jumlah)` adalah deklarasi dari method `pay` pada interface tersebut
method ini memiliki parameter bertipe `double`
- `class CreditCard` adalah implementasi dari interface `PaymentStrategy`. Class ini mengimplementasikan metode
pembayaran dengan kartu kredit.
- Di dalam `class CreditCard` terdapat perintah untuk mencetak pesan yang akan menampilkan bahwa
pembayaran dilakukan dengan menggunakan kartu kredit dengan jumlah tertentu.
- `class Paypal` adalah implementasi dari interface `PaymentStrategy`. Class ini mengimplementasikan metode pembayaran dengan paypal.
- Di dalam `class Paypal` terdapat perintah untuk mencetak pesan yang akan menampilkan bahwa
pembayaran dilakukan dengan menggunakan paypal dengan jumlah tertentu.
- `class BankTransfer` adalah implementasi dari interface `PaymentStrategy`. Class ini mengimplementasikan metode pembayaran dengan transfer bank.
- Di dalam `class BankTransfer` terdapat perintah untu mencetak pesan yang akan menampilkan bahwa
pembayaran dilakukan dengan menggunakan transfer antar bank dengan jumlah tertentu.
- `public ShoppingCart` adalah konstruktor dari `clas ShoppingCart` yang menerima sebuah objek yang mengimplementasikan interface `PaymentStrategy` sebagai parameter.
- `this.paymentStrategy = paymentStrategy` adalah pernyataan yang menetapkan nilai onjek `paymentStrategy` dengan nilai yang diberikan melalui parameter konstruktor
- `paymentStrategy.ay(jumlah)` adalah pemanggil method pay dari objek `paymentStrategy yang digunakan untuk melakukan pembayaran dengan jumlah tertentu saat proses checkout.
- Deklarasi objek - objek `creditCardPayment`, `paypalPayment`, dan `bankTransferPayment` dengan tipe interface `PaymentStrategy`, yang merepresentasikan strategi pembayaran yang berbeda - beda.
- Pembuatan objek - objek `cart1`, `cart2`, `cart3` yang merupakan objek keranjang belanja dengan masing - masing diberikan strategi pembayaran yang berbeda - beda
sesuai dengan objek strategi pembayaran yang telah dibuat sebelumnya.
- Memanggil method `checkout` pada setiap objek keranjang belanja (`cart`, `cart2`, `cart3`) dengan parameter jumlah pembayaran yang berbeda - beda (100, 200, 300).
Setiap method `checkout` akan menggunakan strategi pembayaran yang telah ditetapkan pada objek keranjang belanja tersebut.