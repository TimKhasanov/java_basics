import java.io.File;

public class FileUtils {

    public static long calculateFolderSize(String path) {
        long sum = 0;
        try {
            File file = new File(path);
            if (file.isDirectory()) {
                for (File file1 : file.listFiles()) {
                    if (file1.isFile()) {
                        sum += file1.length();
                    } else {
                        sum += calculateFolderSize(file1.getPath());
                    }
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return sum;
    }
}
