import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Parser
{
    private String url;
    private Document page;

    Parser(String url)
    {
        this.url = url;
        startParse();
    }

    public Document startParse()
    {
        try {
            page = Jsoup.parse(new URL(url), 3000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return page;
    }

    public void createData()
    {
        Data CityData = new Data();

        String state = page.select("span[class=wrap]").first().text();
        String city = "";
        String area = "";
        String height_NUM = "";
        String climate_type = "";
        String time_zone = "";
        String population = "";
        String description = "";
        String car_code = "";
        String telephone_code = "";



    }










}
