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


    public Reducer(){

    }
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

/*
    public void writeMaptoFile() throws Exception{
        Path path = Paths.get("reduced.txt");
      for (String X: flightDataHashMap.keySet()) {
          try (BufferedWriter writer = Files.newBufferedWriter(path)) {
              writer.write("Flight " + key + " has " + flightDataHashMap + " passengers ");
          }
      }

    }
    */

    /*
    int X=0;
    public void methodpicker(){
        Mapper methodpick = new Mapper();
        methodpick.job = X;
        if(X== 2){
            getTheflight(theFlight);
        }else numPassengers(key, flightDataHashMap);
    }

    */

    public void getTheflight(FlightData theFlight){
        System.out.println("Flight " + theFlight);
    }

    public void numPassengers(String key, HashMap flightDataHashMap){
        System.out.println("Flight " + key + " has " + flightDataHashMap.size() + " passengers ");
    }



    //Reducer job1 = new Reducer(reduced, data);
    //Reducer job2= new Reducer(reduced, data);
    //Reducer job3 = new Reducer(reduced, data);



}

//for each reducer, pass in one key, generated my mapper based ony key
//pass in the list of objecets associated with the key
//redue data size based on info (for each key, count number of passengers on it)
//make hashmap of passengers.

//get passenger for each (flight object)
//put into new hashmap (shall auto delete/replace if exists)
//then count passenger

//depart time + journy time = arrive time.




