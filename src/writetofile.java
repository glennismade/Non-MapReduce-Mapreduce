/**
 * Created by glennhealy on 25/02/2018.
 */

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class writetofile {

    Reducer1 reducewrite = new Reducer1();


    public writetofile() {

  //      reducewrite.getClass();
    }

    public static void R1Writer() {


        File file = new File("job1.csv");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
//        pw.append(Reducer1.reducerOne());
    }

}
