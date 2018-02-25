import sun.plugin2.os.windows.FLASHWINFO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by glennhealy on 25/02/2018.
 */
public class Reducer1 {
    public static String theoutput;

    //number of passengers per flight
    public static String reducerOne(String key,ArrayList<FlightData> data) {
        String output = "";
        for (int x = 0; x < data.size(); x++) {

            output += "Flight " + key + " Has " + data.size() + " Passengers on boared " + "\n";
       }

        System.out.println(output); //printing output to screen
        for (int x = 0; x < data.size(); x++) { //looping through output to write to file

            //writing to file
            File file = new File("job1.csv");
            FileWriter fw = null;
            try {
                fw = new FileWriter(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                PrintWriter pw = new PrintWriter(fw);
                fw.append(output);
            } catch (IOException e) {
                e.printStackTrace();
            }try {
                    fw.close();
                }catch (Exception e){
                    System.out.println("error closing file");
                }
        }


        return output;
    }


    //flights from each airport.- doesnt work
    public static String reducerTwo(String key,ArrayList<FlightData> data){
        String output = "";
        int x;

          output += "FlightID -> "+key + "\n";
       // output += "Coming From " + data.get(0).getFromID();
       // output += "Passenger ID's: \n";
        for(x=0;x<data.size();x++){
            output += data.get(x).getFromID() + "\n";
        }
            System.out.println(output);


        return output;
    }

    //flight details, couldn't get the data to show from.
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
