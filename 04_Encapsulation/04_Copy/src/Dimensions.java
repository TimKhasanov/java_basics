import java.util.Scanner;

public class Dimensions {

    private final int width;
    private final int height;
    private int length;
    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
    public void cargoVolume(){
        System.out.println("Габариты груза =" + width * height * length );
    }
    public void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Адрес доставки:");

        }

    }




}
