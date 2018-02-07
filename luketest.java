import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/**
 * Created by glennhealy on 03/02/2018.
 */
public class luketest {

    public static void main(String[] args) {

        //file reading - here.

        Scanner filePathInput = new Scanner(System.in);
        String filePath = filePathInput.nextLine();
        File file = new File(filePath);


        if (file.isFile()) {
            Scanner fileInput = null;
            try {
                fileInput = new Scanner(file);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return;
            }

            ArrayList<String> lineBuffer = new ArrayList<>();

            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
              //  char ch = line.charAt(0);
                lineBuffer.add(line);

                //String[] values = line.split(",");
               // Map<String, Integer> reducer = new HashMap<String, Integer>();
                // parse the line here
                //System.out.println(values);
            }
            HashMap<String, ArrayList<FlightData>> test = mapper(lineBuffer);

        }

}
    public static HashMap<String, ArrayList<FlightData>> mapper(ArrayList<String> lineBuffer) {

        HashMap<String, ArrayList<FlightData>> mapdata = new HashMap<>();

        for (String flightData: lineBuffer) {
            String[] str = flightData.split(",");
            FlightData flight = new FlightData(str[0], str[1], str[2].toCharArray(),str[3].toCharArray(), new Date(Long.valueOf(str[4])), Long.valueOf(str[5]).longValue());
            mapdata.get(flight.getFlightID());
            if(mapdata.containsKey(flight.getFlightID())){
                mapdata.get(flight.getFlightID()).add(flight);
            }
            else {
                ArrayList<FlightData> noID = new ArrayList<>();
                noID.add(flight);
                mapdata.put(flight.getFlightID(), noID);
            }

        }
      //  System.out.println(mapdata);

        return mapdata;

    }


}

