public class RamMemory {

    private final String type;
    private final int volume;
    private final double weight;

    public RamMemory(String type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public RamMemory setType(String type) {
        return new RamMemory(type, volume, weight);
    }

    public RamMemory setVolume(int volume) {
        return new RamMemory(type, volume, weight);
    }

    public RamMemory setWeight(double weight) {
        return new RamMemory(type, volume, weight);
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\nТип оперативной памяти : " + type +
                "\nОбъём оперативной памяти : " + volume + " Gb" +
                "\nВес оперативной памяти : " + weight + " гр";
    }


}
