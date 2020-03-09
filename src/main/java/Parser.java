import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class Parser
{
    private String url;
    private Document page;
    Parser(String url)
    {
        this.url = url;
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





}
