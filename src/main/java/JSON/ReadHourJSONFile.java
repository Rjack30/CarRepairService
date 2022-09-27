package JSON;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadHourJSONFile {
    public static void main(String[] args){
        JSONParser parser = new JSONParser();


        try
        {
            Object obj = parser.parse(new FileReader("myItems.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("name");
            System.out.println("Name is:" + name);

            String name = (String) jsonObject.get("name");
            System.out.println("Tool is:" + tool);

            //loop array
            JSONArray servicesArray = (JSONArray) jsonObject.get("items");

            while(iterator.hasNext())
            {
                System.out.println("Items" + iterator.next());
            }

        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        (IOException e) {e.printStackTrace();}
        (Exception e) {e.printStackTrace();}
    }


}


