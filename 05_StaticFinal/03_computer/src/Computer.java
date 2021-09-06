public class Computer {

    private final String vendor;
    private final String name;
    public Processor processor;
    public RamMemory ramMemory;
    public HardDrive hardDrive;
    public Screen screen;
    public Keyboard keyboard;
    public double totalWeight;

    public Computer(String vendor, String name, Processor processor, RamMemory ramMemory, HardDrive hardDrive, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.hardDrive = hardDrive;
        this.screen = screen;
        this.keyboard = keyboard;
        calculateWeight();
    }

    public Computer setVendor(String vendor) {
        return new Computer(vendor, name, processor, ramMemory, hardDrive, screen, keyboard);
    }

    public Computer setName(String name) {
        return new Computer(vendor, name, processor, ramMemory, hardDrive, screen, keyboard);
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRamMemory(RamMemory ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }


    public double getTotalWeight() {
        return totalWeight;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RamMemory getRamMemory() {
        return ramMemory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void calculateWeight() {
        totalWeight = (totalWeight + processor.getWeight()+ ramMemory.getWeight() + hardDrive.getWeight() + screen.getWeight() + keyboard.getWeight());
    }

    public String toString() {
        return "\nПроизводитель" + vendor +
                "\nНазвание" + name +
                "\nОбщий вес компютера " + totalWeight + " гр" + processor.toString() +
                ramMemory.toString() + hardDrive.toString() + screen.toString() + keyboard.toString();


    }


}

