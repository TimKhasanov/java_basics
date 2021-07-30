public class main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(7, 9, 6);
        CargoInformation cargoInformation = new CargoInformation(dimensions, 40,
                "рижский", "125АА");
        System.out.println(cargoInformation);
    }
}


