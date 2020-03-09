public class Main
{
    public static void main(String[] args)
    {
        Parser parser = new Parser("https://en.wikipedia.org/wiki/Main_Page");
        System.out.println(parser.startParse());
    }
}
