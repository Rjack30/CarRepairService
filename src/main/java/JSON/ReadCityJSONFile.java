package JSON;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadCityJSONFile {

    public static void main(String[] args){
        JSONParser parser = new JSONParser();


        try
        {
            Object obj = parser.parse(new FileReader("myCity.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("name");
            System.out.println("Name is:" + name);

            String name = (String) jsonObject.get("name");
            System.out.println("Location is:" + location);

            //loop array
            JSONArray servicesArray = (JSONArray) jsonObject.get("cities");

            while(iterator.hasNext())
            {
                System.out.println("Cities" + iterator.next());
            }

        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        (IOException e) {e.printStackTrace();}
        (Exception e) {e.printStackTrace();}
    }


}






}
