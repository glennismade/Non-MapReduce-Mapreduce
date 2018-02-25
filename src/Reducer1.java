import java.util.ArrayList;

/**
 * Created by glennhealy on 25/02/2018.
 */
public class Reducer1 {

    public static String reducerOne(String key,ArrayList<FlightData> data){
        String output = "";
        for(int x=0;x<data.size();x++){
            output += "Flight " + key + " Has " + data.size() + " On boared ";
        }
        System.out.println(output);


        return output;
    }

    public static String reducerTwo(String key,ArrayList<FlightData> data){
        String output = "";
        output += "FlightID -> "+key + "\n";
        output += "Coming From ";
       // output += "Passenger ID's: \n";
        for(int x=0;x<data.size();x++){
            output += data.get(x).getFromID() + "\n";
        }
        System.out.println(output);

        return output;
    }

    public static String reducerThree(String key,ArrayList<FlightData> data){
        String output = "";
        output += "FlightID -> "+key+ " has " + data.size() + " Passengers "+  "\n";
        output += "Passengers ID's: \n";
        for(int x=0;x<data.size();x++){
            output += data.get(x).getPassengerID()+"\n";
        }
        System.out.println(output);
        return output;
    }


}
