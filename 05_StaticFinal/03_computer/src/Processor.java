public class Processor {

    private final double frequency;
    private final int numberOfCores;
    private final String manufacturer;
    private final double weight;

    public Processor(double frequency, int numberOfCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public Processor setFrequency(double frequency) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

    public Processor setNumberOfCores(int numberOfCores) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

    public Processor setManufacturer(String manufacturer) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

    public Processor setWeight(double weight) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\nЧастота процессора : " + frequency +
                "\nКоличество ядер : " + numberOfCores +
                "\nПроизводитель : " + manufacturer +
                "\nВес процессора : " + weight + " гр";
    }


}
