
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Main {
    private static final String PATH_FILE = "C:\\Users\\Hp\\java_basics\\FilesAndNetwork\\DataCollector\\src\\main\\InformationAboutStations\\";
    private static ArrayList<String> fileListDates = new ArrayList<>();
    private static ArrayList<String> fileListDepths = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Metro n = new Metro();
        n.downloadMetro();
        getFiles(PATH_FILE, fileListDates, fileListDepths);


        Set<MetroData> metroData = getMetroData(fileListDates.get(0));
        for (MetroData i : metroData){
            System.out.println(i);
        }

        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("src/main/resources/stations.json"));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    private static void getFiles(String path, ArrayList<String> fileListDates, ArrayList<String> fileListDepths) {
        File file = new File(path);
        try {

            if (file.isDirectory()) {
                for (File file1 : file.listFiles()) {
                    if (file.isDirectory()) {
                        getFiles(file1.getAbsolutePath(), fileListDates, fileListDepths);
                    }
                }
            }

            if (file.getAbsolutePath().contains("dates") && (!file.getAbsolutePath().contains("MACOSX"))) {
                fileListDates.add(file.getAbsolutePath());
            }

            if (file.getAbsolutePath().contains("depth") && (!file.getAbsolutePath().contains("MACOSX"))) {
                fileListDepths.add(file.getAbsolutePath());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static Set<MetroData> getMetroData(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Set<MetroData> metroData;
        metroData = (Set<MetroData>) mapper.readValue(path,MetroData.class);
        return metroData;



    }
}
