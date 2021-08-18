public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");
        basket.add("apple", 50, 1, 500);
        basket.print("apple");
        System.out.println("Сумма всех товаров: "+ Basket.getTotalCost());
        System.out.println("Количество товаров: "+ Basket.getTotalNumberOfGoods());
        System.out.println("Средняя сумма во всех корзинах: " + Basket.averagePrice());
    }

}
