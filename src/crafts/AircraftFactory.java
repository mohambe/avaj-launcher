package crafts;

import Weather.Coordinates;
import utils.IllegalType;
import utils.AircraftException;

public abstract class AircraftFactory {

     /**
     * Aircraft Factory creates an aircraft instance based on what is passed to it and throws a custom exception if invali.
     * @param type - Type of aircraft to be created.
     * @param name - Name of aircraft to be created.
     * @param longitude - The longitude of the aircraft.
     * @param latitude - The latitude of the aircraft.
     * @param height - The height of the aircraft
     * @return - returns an instance of the aircraft if valid parameters are passed.
     */


    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) { //make lower case
        Coordinates coordinates = new Coordinates(longitude, latitude, height);
        if(longitude < 0 || latitude < 0)
        {
            throw new IllegalType("incorrect aircratf parameters");
        }
        if (type.equals("JetPlane")) {
            
            return new JetPlane(name, coordinates);
        }
        else if (type.equals("Baloon")) {
            return new Baloon(name, coordinates);
        }
        else if (type.equals("Helicopter"))  {
            return new Helicopter(name, coordinates);
        }
        else if ( (!type.equals("Helicopter")) || (!type.equals("Baloon")) || (!type.equals("JetPlane")) ) {
            throw new AircraftException("incorrect aircratf type");
        }
        return null;
    }
}
