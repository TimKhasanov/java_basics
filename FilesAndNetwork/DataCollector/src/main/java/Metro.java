import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Metro {
    public void downloadMetro() {
        try {
            Document document = Jsoup.connect("https://skillbox-java.github.io/").get();
            Elements elementLine = document.select("span[data-line]");
            Elements stationElements = document.select("div.js-depend");
            JSONObject jsonObject = new JSONObject();
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("src/main/resources/map.json"));
            jsonObject.put("station", getObjectStation(stationElements));
            jsonObject.put("lines", getObjectLine(elementLine));
            writer.write(jsonObject.toJSONString());
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static JSONObject getObjectStation(Elements stationElements) {
        ArrayList<StationMetro> stList = new ArrayList<>();

        for (Element element : stationElements) {
            String numberLine = element.attr("data-line");
            Elements nameStationElement = element.select("span.name");
            for (Element elementStation : nameStationElement) {
                String nameStation = elementStation.text();
                stList.add(new StationMetro(nameStation, numberLine));
            }
        }
        Map<String, List<String>> stationMap = stList.stream()
                .collect(Collectors.groupingBy(StationMetro::getNumberLineStation
                        , LinkedHashMap::new
                        , Collectors.mapping(
                                StationMetro::getNameStation,
                                Collectors.toList())));

        return new JSONObject(stationMap);
    }

    private static JSONArray getObjectLine(Elements elementLine) {
        JSONArray lines = new JSONArray();
        ArrayList<LineMetro> linesList = new ArrayList<>();

        for (Element element : elementLine) {
            String nameLine = element.attr("data-line");
            String numberLine = element.text();
            linesList.add(new LineMetro(numberLine, nameLine));
        }

        for (LineMetro line : linesList) {
            JSONObject lines1 = new JSONObject();
            lines1.put("number", line.getNumberLine());
            lines1.put("name", line.getNameLine());
            lines.add(lines1);
        }
        return lines;
    }

}
