

public class Main
{
    private static String city = "Молодечно";

    public static void main(String[] args)
    {
        Parser parser = new Parser(city);

        parser.createCityData();

        System.out.println(parser.getData());


    }
}
