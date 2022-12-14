public class Basket {


    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private static int totalCost = 0;
    private static int totalNumberOfGoods = 0;
    private static int itemInCart = 0;


    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
        increaseCount(count);
        increasePrice(count, totalPrice);

    }

    public static int getItemInCart() {
        return itemInCart;
    }


    public static int getCount() {
        return count;
    }

    public static int getTotalCost() {
        return totalCost;
    }

    public static int getTotalNumberOfGoods() {
        return totalNumberOfGoods;
    }

    private static void increasePrice(int price, int count) {
        totalCost = totalCost + price * count;
    }

    private static void increaseCountItems(int count) {
        totalNumberOfGoods = totalNumberOfGoods + count;
    }

    private static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static double averagePrice() {
        return (double) totalCost / totalNumberOfGoods;
    }

    public static double averageBasketPrice() {
        return (double) getTotalCost() / Basket.getCount();
    }

    public void add(String name, int price, int count, double weight) {
        add(name, price, count);
        totalWeight = totalWeight + weight;

    }

    public double getTotalWeight() {
        return 0;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        increasePrice(price, count);
        increaseCountItems(count);


    }

    public void clear() {
        items = "";
        totalCost = totalCost - totalPrice;
        totalPrice = 0;
        totalNumberOfGoods = totalNumberOfGoods - itemInCart;
        itemInCart = 0;


    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
