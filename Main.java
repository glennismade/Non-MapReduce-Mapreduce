import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //file reading - here.

        Scanner filePathInput = new Scanner(System.in);

        String filePath = filePathInput.nextLine();

        File file = new File(filePath);

        if(file.isFile()){
            Scanner fileInput = null;
            try {
                fileInput = new Scanner(file);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return;
            }

            while(fileInput.hasNextLine()){
                String line = fileInput.nextLine();
                String[] values = line.split(",");
                Map<String,Integer> reducer = new HashMap<String, Integer>();
                // parse the line here
                //System.out.println(values);

                for (String str : values){
                    if ( str.isEmpty() ) {
                        str = "null";
                    }
                   else
                   System.out.println(str);

                    if(reducer.containsKey(str)) {
                        reducer.put(str,reducer.get(str) + 1);
                    }
                    else {
                        reducer.put(str, 1);
                    }
                }

                int count = 0;
                for(int repatCount : reducer.values()){
                    if(repatCount > 1) {
                        count++;
                    }
                }
              // System.out.println("Number of Strings repeated : " + reducer);
            }

            fileInput.close();

        }

    }

    public HashMap<String, Object> mapper() {


        return null;
    }

    //public KeyValue<String,>

}