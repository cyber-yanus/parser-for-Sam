

public class Main
{
    private static String city = "Вена";

    public static void main(String[] args)
    {
        Parser parser = new Parser("https://ru.wikipedia.org/wiki/" + city);
        //System.out.println(parser.startParse());
        parser.createData();
    }
}
