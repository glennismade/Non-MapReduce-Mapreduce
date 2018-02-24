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

    public Reducer (String Key, ArrayList<FlightData> flightDataArrayList) {

        this.flightDataArrayList = flightDataArrayList;
        this.key = Key;

    }
    FlightData theFlight = flightDetails.get(key);


    @Override
    public void run() {

        for (FlightData X: flightDataArrayList) {
            flightDataHashMap.put(X.getPassengerID(), X.getPassengerID());
            flightDetails.put(key, X);
        }

    }

    public void getTheflight(FlightData theFlight){
        System.out.println("Flight " + theFlight);

    }

    public void numPassengers(Key key, HashMap flightDataHashMap){
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




