import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (;;) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите путь до папки: ");
            String path = scanner.nextLine();
            System.out.println("Размер папки: " + path + " составляет " + getPathSize(FileUtils.calculateFolderSize(path)));
        }
    }

    public static String getPathSize(long size) {
        String result = "";
        double kb = 1024;
        double mb = 1024 * 1024;
        double gb = (1024 * 1024) * 1024;

        if (size < kb) {
            result += size + "b";
        } else if (size >= kb && size <= mb) {
            result += String.format("%.1f", size / kb) + " Kb";
        } else if (size >= mb && size <= gb) {
            result += String.format("%.1f", size / mb) + " Mg";
        } else if (size >= gb) {
            result += String.format("%.1f", size / gb) + " Gb";
        }
        return result;
    }
}
