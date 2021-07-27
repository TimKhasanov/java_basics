public class CargoInformation {


    private final int dimensions;
    private final int weight;
    private final int deliveryAddress;
    private final boolean canBeFlipped = false;
    private final String registrationNumber;
    private final boolean fragileCargo = false;

    public CargoInformation(int dimensions, int weight,int deliveryAddress, String registrationNumber) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.registrationNumber = registrationNumber;

    }


    public CargoInformation setDimensions(int dimensions) {
        return new CargoInformation(dimensions, weight, deliveryAddress, registrationNumber);
    }

    public CargoInformation setWeight(int weight) {
        return new CargoInformation(dimensions, weight, deliveryAddress, registrationNumber);
    }

    public CargoInformation setDeliveryAddress(int deliveryAddress) {
        return new CargoInformation(dimensions, weight, deliveryAddress, registrationNumber);
    }

    public CargoInformation setRegistrationNumber(String registrationNumber) {
        return new CargoInformation(dimensions, weight, deliveryAddress, registrationNumber);
    }

    public int getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public int getDeliveryAddress() {
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

}
