import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by glennhealy on 22/02/2018.
 */
public class Reducer extends Thread {

    HashMap<String, String> flightDataHashMap = new HashMap<>();
    HashMap<String, FlightData> flightDetails = new HashMap<>();
    String key;
    ArrayList<FlightData> flightDataArrayList;
    FlightData theFlight = flightDetails.get(key);

    public Reducer (String Key, ArrayList<FlightData> flightDataArrayList) {

        this.flightDataArrayList = flightDataArrayList;
        this.key = Key;

    }

    @Override
    public void run() {

        for (FlightData X: flightDataArrayList) {
            flightDataHashMap.put(X.getPassengerID(), X.getPassengerID());
            flightDetails.put(key, X);
        }
        //  System.out.println("Flight " + key + " has " + flightDataHashMap.size() + " passengers ");
        //  System.out.println("Flight " + flightDetails);

    }

    public void getTheflight(FlightData theFlight){
        System.out.println("Flight " + theFlight);
    }

    public void numPassengers(String key, HashMap flightDataHashMap){
        System.out.println("Flight " + key + " has " + flightDataHashMap.size() + " passengers ");
    }



}



