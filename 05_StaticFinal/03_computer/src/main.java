public class main {
    public static void main(String[] args) {
        Processor processor = new Processor(2.3, 8, "intel", 2.5);
        RamMemory ramMemory = new RamMemory("ddr-4", 8, 50);
        HardDrive hardDrive = new HardDrive(HardDriveType.HDD, 256, 500);
        Screen screen = new Screen(15.6, ScreenType.IPS, 1000);
        Keyboard keyboard = new Keyboard("Механическая", true, 500);
        Computer computer = new Computer(" HP", " Probook", processor, ramMemory, hardDrive, screen, keyboard);
        System.out.println(computer);


    }
}
