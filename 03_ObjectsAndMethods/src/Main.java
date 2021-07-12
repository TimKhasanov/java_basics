public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");
        basket.add("apple", 50, 1, 500);
        basket.print(" ");
    }
}
