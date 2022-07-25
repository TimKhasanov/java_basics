
import org.json.simple.JSONArray;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Metro n = new Metro();
        n.downloadMetro();
        try {

           BufferedWriter writer = Files.newBufferedWriter(Paths.get("src/main/resources/stations.json"));
            ArrayList<File> fileList = new ArrayList<>();
            File s = new File("C:\\Users\\Hp\\java_basics\\FilesAndNetwork\\DataCollector\\src\\main\\InformationAboutStations\\");
            getFiles(s, fileList);
            stationInfo(fileList);


        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    private static void stationInfo(ArrayList<File> fileList){
        JSONArray file1 = new JSONArray();
        for (File file : fileList){
            file1.add(file);
            System.out.println(file1);
        }

    }

    private static void getFiles(File rootFile, ArrayList<File> fileList) {
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        getFiles(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".json")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }

    private static void getStationList(String list) {

    }

    private static void getStationProperties(String list) {

    }

}
