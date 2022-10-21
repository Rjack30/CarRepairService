package json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class HoursJSONFile {

    public static void main(String{} args){
        JSONObject obj =  new JSONObject();
        obj.put("day", "Time");

        JSONArray list = new JSONArray();
        list.add("Monday", "9am to 6pm");
        list.add("Tuesday","9am to 6pm");
        list.add("Wednesday","9am to 6pm");
        list.add("Thursday", "9am to 6pm");
        list.add("Friday","9am to 6pm" );
        list.add("Saturday","9am to 6pm" );
        list.add("Sunday", "9am to 3pm");
        obj.put("Hours", list);

        try(FileWriter file = new FileWriter("myHours.json"))
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




