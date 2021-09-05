public class HardDrive {


    private final HardDriveType type;
    private final int memoryCapacity;
    private final double weight;

    public HardDrive(HardDriveType type, int memoryCapacity, double weight) {
        this.type = type;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public HardDrive setType(HardDriveType type) {
        return new HardDrive(type, memoryCapacity, weight);
    }

    public HardDrive setMemoryCapacity(int memoryCapacity) {
        return new HardDrive(type, memoryCapacity, weight);
    }

    public HardDrive setWeight(double weight) {
        return new HardDrive(type, memoryCapacity, weight);
    }

    public HardDriveType getType() {
        return type;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\nТип жесткого диска : " + type +
                "\nОбъём памяти : " + memoryCapacity + " Gb" +
                "\nВес жесткого диска : " + weight + " гр";
    }
}
