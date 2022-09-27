package JSON;

import java.io.FileWriter;
import java.io.IOException;

public class ServicesJSONFile {

    public static void main(String{} args){
        JSONObject obj =  new JSONObject();
        obj.put("name", "Brad, William");
        obj.put("location", "USA");

        JSONArray list = new JSONArray();
        list.add("Brakes");
        list.add("Transmission");
        list.add("OilChange");
        list.add("Suspension");

        obj.put("services", list);

        try(FileWriter file = new FileWriter("myServices.json"))
        {
            file.write(obj.toString());
            file.flush();
        }
    catch (IOException e)
    {
        e.printStackTrace();
    }
   System.out.println(obj);

    }

}
