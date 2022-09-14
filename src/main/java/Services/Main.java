package Services;
import java.util.*;
public class Main {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String[] offers = new String[]{"OilChange", "SuspensionServices",
                "TransmissionRepair", "BrakeServices"};

        int[] prices = {120, 80, 200, 75};

        System.out.println("Enter Selection:");
        String choice = input.nextLine();


        for(int x = 0; x < prices.length; ++x){
            if(offers[x].equals(choice)){
                System.out.println(offers[x] +" price is $" + prices[x]);
                return;
            }
        }
        System.out.println("Invalid Entry");
    }
}

