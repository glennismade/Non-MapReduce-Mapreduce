/**
 * Created by glennhealy on 22/02/2018.
 */

//regex for passengerID [A-Z]{3}[0-9]{4}[A-Z]{2}[0-9]{1}
import java.util.regex.*;

public class Validation {

    public boolean isValid;
    public String regexResult;

    public static Matcher validate(String theReg, String str2Check) {
        // TODO impliment better validation, as this one sucks

        final Pattern PtnPassenger = Pattern.compile(theReg);
        final Pattern PtnFlight = Pattern.compile(theReg);
        final Pattern PtnFrom = Pattern.compile(theReg);
        final Pattern PtnToo = Pattern.compile(theReg);

        Matcher regexMatcher = PtnPassenger.matcher(str2Check);

        while(regexMatcher.find()) {
            if(regexMatcher.group().length() != 0) {
                return regexMatcher;
            }
           // else

        }

        return regexMatcher;
    }

}
