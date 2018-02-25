import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class FlightData {

    //variables to be assinged to each object type.

    private String passengerID;
    private String flightID;
    private char[] fromID = new char[3];
    private char[] tooID = new char[3];
    public Date departTime;
    public long flightTimeMins;
    public Date arrivalTime;

//Constucter;
    public FlightData(String passengerID, String flightID, char[] fromID, char[] tooID, Date departTime, long flightTimeMins) {
        //data objects (elements in the file)
        setPassengerID(passengerID);
        setFlightID(flightID);
        setFromID(fromID);
        setTooID(tooID);
        setFlightTimeMins(flightTimeMins);
        setDepartTime(departTime);
        setArrivalTime(arrivalTime);

    }


    //Getters & Setters
    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public char[] getFromID() {
        return fromID;
    }

    public void setFromID(char[] fromID) {
        this.fromID = fromID;
    }

    public char[] getTooID() {
        return tooID;
    }

    public void setTooID(char[] tooID) {
        this.tooID = tooID;
    }

    public void setFlightTimeMins(long flightTimeMins) {
        this.flightTimeMins = flightTimeMins;
    }

    public Date getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    public long getFlightTimeMins() {
        return flightTimeMins;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;

      // arrivalTime = departTime + flightTimeMins * 60;
    }
}
