import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.*;
import java.net.URL;


public class Main {
    private static  File file = new File("image/");


    public static void main(String[] args) {

        try {

            Document document = Jsoup.connect("https://lenta.ru/").get();
            Elements elements = document.select("img");
            for(Element elements1 : elements){
                String srs = elements1.attr("abs:src");
                getImages(srs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    private static void getImages(String src){
        String fileName = src.substring(src.lastIndexOf("/") + 1);

        try {
            URL url = new URL(src);
            InputStream in = url.openStream();
            if(file.exists()){
                file.createNewFile();
            }
            OutputStream out = new BufferedOutputStream(new FileOutputStream(file + fileName));
            for (int b; (b = in.read()) != -1; ) {
                out.write(b);
            }
            out.close();
            in.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
