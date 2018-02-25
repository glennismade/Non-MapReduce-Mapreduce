import java.io.File;
import java.io.FileNotFoundException;
import java.security.Key;
import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.regex.*;
import java.io.FileWriter;


/**
 * Created by glennhealy on 03/02/2018.
 */
public class Mapper {

    String str1;
    static int job;

    public static void main(String[] args) {

        //file reading - here.
        Scanner filePathInput = new Scanner(System.in);
        String filePath = filePathInput.nextLine();
        File file = new File(filePath);

        //file checking
        if (file.isFile()) {
            Scanner fileInput = null;
            try {
                fileInput = new Scanner(file);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return;
            }
            //arrays for input buffer and error list
            ArrayList<String> lineBuffer = new ArrayList<>();
            ArrayList<String> errorBuffer = new ArrayList<>();

            //looping through the file line by line
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                if (line.matches("[\\w\\,]{12}[\\w\\,]{8}[A-Z\\,]{4}[A-Z\\,]{4}[\\d\\,]{11}[\\d]{1,4}")) { //regex to validate the line is not empty. && meets the basic requirements.
                    lineBuffer.add(line);
                } else errorBuffer.add(line);

            }
//            System.out.println("error found at line:" + errorBuffer);
            HashMap<String, ArrayList<FlightData>> test = mapper(lineBuffer);

            //  System.out.println(errorBuffer);

        }

    }

    //Mapper function
    public static HashMap<String, ArrayList<FlightData>> mapper(ArrayList<String> lineBuffer) {

        HashMap<String, ArrayList<FlightData>> mapdata = new HashMap<>(); //array list for Mapdata object

        for (String flightData : lineBuffer) {
            String[] str = flightData.split(",");
            FlightData flight = new FlightData(str[0], str[1], str[2].toCharArray(), str[3].toCharArray(), new Date(Long.valueOf(str[4])), Long.valueOf(str[5]).longValue()); //creating the object
            mapdata.get(flight.getFlightID()); //getting the flight data
            if (mapdata.containsKey(flight.getFlightID())) { //checking if the data for the oject contains hash key Flightdata
                mapdata.get(flight.getFlightID()).add(flight);
            } else {
                ArrayList<FlightData> noID = new ArrayList<>(); //creating an array for noID
                noID.add(flight);
                mapdata.put(flight.getFlightID(), noID);
            }
            System.out.println(mapdata);

        }

        ArrayList<Reducer> reducerArrayList = new ArrayList<>();


        System.out.println(" \n please select a job \n");
        System.out.println("1: Number of flights per airport \n");
        System.out.println("2: flight details \n");
        System.out.println("3: number of pasengers per flight \n");

        Scanner jobselection = new Scanner(System.in);

         job = jobselection.nextInt();

        if (job == 3) {
            for (String key : mapdata.keySet()) {
                Reducer job1 = new Reducer(key, mapdata.get(key));
                job1.start();
                reducerArrayList.add(job1);
                job1.numPassengers(key, flightDataHashMap);
            }

            for (Reducer R1 : reducerArrayList) {
                try {
                    R1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }else if (job == 2) {
            for (String key : mapdata.keySet()) {
                Reducer job2 = new Reducer(key, mapdata.get(key));
                job2.start();
                reducerArrayList.add(job2);
                job2.getTheflight(theFlight);
            }

            for (Reducer R2 : reducerArrayList) {
                try {
                    R2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }

    return mapdata;

}

}

