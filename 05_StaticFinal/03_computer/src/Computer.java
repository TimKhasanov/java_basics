public class Computer {

    private final String vendor;
    private final String name;
    private final Processor processor;
    private final RamMemory ramMemory;
    private final HardDrive hardDrive;
    private final Screen screen;
    private final Keyboard keyboard;


    private double totalWeight;

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

    public Computer setProcessor(Processor processor) {
        return new Computer(vendor, name, processor, ramMemory, hardDrive, screen, keyboard);
    }

    public Computer setRamMemory(RamMemory ramMemory) {
        return new Computer(vendor, name, processor, ramMemory, hardDrive, screen, keyboard);
    }

    public Computer setHardDrive(HardDrive hardDrive) {
        return new Computer(vendor, name, processor, ramMemory, hardDrive, screen, keyboard);
    }

    public Computer setScreen(Screen screen) {
        return new Computer(vendor, name, processor, ramMemory, hardDrive, screen, keyboard);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor, name, processor, ramMemory, hardDrive, screen, keyboard);
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
        totalWeight = (totalWeight + processor.getWeight() + ramMemory.getWeight() + hardDrive.getWeight() + screen.getWeight() + keyboard.getWeight());
    }

    public String toString() {
        return "\nПроизводитель" + vendor +
                "\nНазвание" + name +
                "\nВес компютера " + totalWeight + " гр";
    }


}

