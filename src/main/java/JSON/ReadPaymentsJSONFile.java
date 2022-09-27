package JSON;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadPaymentsJSONFile {

    public static void main(String[] args){
        JSONParser parser = new JSONParser();


        try
        {
            Object obj = parser.parse(new FileReader("myPayments.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("name");
            System.out.println("Name is:" + name);

            String name = (String) jsonObject.get("name");
            System.out.println("Payments is:" + payments);

            //loop array
            JSONArray servicesArray = (JSONArray) jsonObject.get("payments");

            while(iterator.hasNext())
            {
                System.out.println("Payments" + iterator.next());
            }

        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        (IOException e) {e.printStackTrace();}
        (Exception e) {e.printStackTrace();}
    }





}
