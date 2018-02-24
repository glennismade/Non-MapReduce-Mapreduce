import com.sun.tools.javac.util.ArrayUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by glennhealy on 27/01/2018.
 */
public class mymapper {

        public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new FileReader("/Users/glennhealy/Dropbox/Uni/Reducer Year/Advanced Computing/Courswork/AComp_Passenger_data_no_error.csv"));
//            BufferedReader br = new BufferedReader(new FileReader("/Users/glennhealy/Dropbox/Uni/Reducer Year/Advanced Computing/Courswork/AComp_Passenger_data.csv"));

            String line = null;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                if (values[0] == ", ,"){
                    System.out.println("this entry is null");

                }
                for (String str : values) {
                   // System.out.println(str);

                }
            }
            br.close();

        }
    }



