public class CargoInformation {


    private final Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean canBeFlipped = false;
    private final String registrationNumber;
    private final boolean fragileCargo = false;

    public CargoInformation(Dimensions dimensions, int weight, String deliveryAddress, String registrationNumber) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.registrationNumber = registrationNumber;

    }


    public CargoInformation setDimensions(Dimensions dimensions) {
        return new CargoInformation(dimensions, weight, deliveryAddress, registrationNumber);
    }

    public CargoInformation setWeight(int weight) {
        return new CargoInformation(dimensions, weight, deliveryAddress, registrationNumber);
    }

    public CargoInformation setDeliveryAddress(String deliveryAddress) {
        return new CargoInformation(dimensions, weight, deliveryAddress, registrationNumber);
    }

    public CargoInformation setRegistrationNumber(String registrationNumber) {
        return new CargoInformation(dimensions, weight, deliveryAddress, registrationNumber);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isCanBeFlipped() {
        return canBeFlipped;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragileCargo() {
        return fragileCargo;
    }
    public String toString(){
        return "Информация о грузе: " + dimensions + "/" + weight + "/" + dimensions + "/" + registrationNumber + "/";
    }

}
