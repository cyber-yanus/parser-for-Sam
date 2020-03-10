import java.io.*;

public class Main
{
    private static String[] city_mass =
            {
                    "Молодечно",
                    "Минск",
                    "Вена",
                    "Лас-Вегас",
                    "Барановичи"
            };


    public static void main(String[] args)
    {
        for(int i=0 ; i<city_mass.length ; i++)
        {
            Parser parser = new Parser(city_mass[i]);
            parser.createCityData();
        }

        saveCSV();
    }

    private static void saveCSV()
    {
        try{
            FileWriter writer = new FileWriter("test.csv");
            StringBuilder sb = new StringBuilder();

            for (CityData data : Parser.datas)
            {
                sb.append(data.getCity());
                sb.append(",");
                sb.append(data.getState());
                sb.append(",");
                sb.append(data.getArea());
                sb.append(",");
                sb.append(data.getHeight_NUM());
                sb.append(",");
                sb.append(data.getClimate_type());
                sb.append(",");
                sb.append(data.getTime_zone());
                sb.append(",");
                sb.append(data.getPopulation());
                sb.append(",");
                sb.append(data.getDescription());
                sb.append(",");
                sb.append(data.getCar_code());
                sb.append(",");
                sb.append(data.getTelephone_code());
                sb.append("\n");
            }

            writer.write(sb.toString());
            writer.flush();
            writer.close();

            System.out.println("done!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


}
