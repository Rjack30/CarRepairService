package json;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;



public class CityJSONFile {

    public static void main(String{} args){
        JSONObject obj =  new JSONObject();
        obj.put("location", "USA");

        JSONArray list = new JSONArray();
        list.add("Los Angeles");
        list.add("Burbank");
        list.add("Glendale");

        obj.put("City", list);

        try(FileWriter file = new FileWriter("myCity.json"))
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


