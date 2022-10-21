package json;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;


public class ItemsJSONFile {
    public static void main(String{} args){
        JSONObject obj =  new JSONObject();
        obj.put("tool", "name");

        JSONArray list = new JSONArray();
        list.add("Vehicle Lift");
        list.add("Oil drain and oil caddy");
        list.add("Battery charger and jumper");
        list.add("Engine hoist");
        list.add("Brake lathe");
        list.add("Strut compressor");
        list.add("Air conditioning machine");
        list.add("Jack, jack stands, and pole jacks");
        obj.put("Item", list);

        try(FileWriter file = new FileWriter("myItems.json"))
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





