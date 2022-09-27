package JSON;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadServicesJSONFile {

    public static void main(String[] args){
        JSONParser parser = new JSONParser();


        try
        {
         Object obj = parser.parse(new FileReader("myService.json"));
         JSONObject jsonObject = (JSONObject) obj;
         String name = (String) jsonObject.get("name");
         System.out.println("Name is:" + name);

            String name = (String) jsonObject.get("name");
            System.out.println("Location is:" + location);

            //loop array
            JSONArray servicesArray = (JSONArray) jsonObject.get("services");

            while(iterator.hasNext())
            {
                System.out.println("Services" + iterator.next());
            }

        }
    catch (FileNotFoundException e) {e.printStackTrace();}
        (IOException e) {e.printStackTrace();}
        (Exception e) {e.printStackTrace();}
    }


}
