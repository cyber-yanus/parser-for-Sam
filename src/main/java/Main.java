

public class Main
{
    private static String city = "Вена";

    public static void main(String[] args)
    {
        Parser parser = new Parser(city);

        parser.createCityData();
    }
}
