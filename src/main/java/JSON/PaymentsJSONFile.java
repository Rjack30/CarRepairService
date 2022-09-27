package JSON;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class PaymentsJSONFile {
    public static void main(String{} args){
        JSONObject obj =  new JSONObject();
        obj.put("Payment", "Type");

        JSONArray list = new JSONArray();
        list.add("Debit Card");
        list.add("Credit Card");
        list.add("Check");

        obj.put("Payment", list);

        try(FileWriter file = new FileWriter("myPayments.json"))
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
