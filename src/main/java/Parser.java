import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import java.net.URL;

public class Parser
{
    private String url = "https://ru.wikipedia.org/wiki/";

    private Document page;

    private String city;

    private CityData data = new CityData();


    Parser(String city)
    {
        this.city = city;

        data.setCity(city);

        downloadPage();
    }

    private void downloadPage()
    {
        url += city;

        try {
            page = Jsoup.parse(new URL(url), 3000);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void createCityData()
    {
        pullState();
        pullArea();
        pullHeight_NUM();
        pullClimateType();
        pullTimeZone();
        pullPopulation();
        pullCarCode();
        pullTelephoneCode();

        String description = "";
        data.setDescription(description);
    }

    private void pullState()
    {
        String state = page.select("span[class=wrap]").first().text();
        data.setState(state);
    }

    private void pullArea()
    {
        String area = page.select("span[class=no-wikidata][data-wikidata-property-id=P2046]").first().text();

        if (area != null)
        {
            area = area.replace("[1]", "");
            data.setArea(area);
        }
    }

    private void pullHeight_NUM()
    {
        String height_NUM = page.select("span[class=no-wikidata][data-wikidata-property-id=P2044]").first().text();
        data.setHeight_NUM(height_NUM);
    }

    private void pullClimateType()
    {
        Elements trElements = page.select("tr");

        for (Element trElem : trElements)
        {
            Element aElem = trElem.select("a[title=Климат]").first();

            if(aElem != null)
            {
                String climate_type = trElem.select("td[class=plainlist]").first().text();
                data.setClimate_type(climate_type);
                break;
            }

        }
    }

    private void pullTimeZone()
    {
        Elements trElements = page.select("tr");

        for (Element trElem : trElements)
        {
            Element aElem = trElem.select("a[title=Часовой пояс]").first();

            if(aElem != null)
            {
                String time_zone = trElem.select("span[class=no-wikidata]").first().text();
                data.setTime_zone(time_zone);
                break;
            }

        }
    }


    private void pullPopulation()
    {
        String population = page.select("span[class=no-wikidata][data-wikidata-property-id=P1082]").first().text();
        data.setPopulation(population);
    }

    private void pullCarCode()
    {
        Elements trElements = page.select("tr");

        for (Element trElem : trElements)
        {
            Element aElem = trElem.select("a[title=Автомобильный номер]").first();

            if(aElem != null)
            {
                String car_code = trElem.select("span[class=no-wikidata]").first().text();
                data.setCar_code(car_code);
                break;
            }

        }
    }

    private void pullTelephoneCode()
    {
        Elements trElements = page.select("tr");

        for (Element trElem : trElements)
        {
            Element aElem = trElem.select("a[title=Телефонный план нумерации]").first();

            if(aElem != null)
            {
                String telephoneCode = trElem.select("td[class=plainlist]").first().text();
                data.setTelephone_code(telephoneCode);
                break;
            }

        }
    }





}
