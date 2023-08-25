public class Cupcake {

    // Create a public double variable named price, but do not assign it a value
    public double price;

    // Create a public function named getPrice that has no params and returns the price
    public double getPrice() {
        return price;
    }

    // Create a public function named setPrice that takes in one param, a double named price, and returns void
    public void setPrice(double price) {
        this.price = price;
    }

    // Create a public function named type that prints “A basic, generic cupcake, with vanilla frosting” and returns void.
    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}


