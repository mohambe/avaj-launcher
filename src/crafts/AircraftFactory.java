package crafts;

import Weather.Coordinates;
import utils.IllegalType;
import utils.AircraftException;

public abstract class AircraftFactory {


    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) { //make lower case
        Coordinates coordinates = new Coordinates(longitude, latitude, height);
        if(longitude < 0 || latitude < 0)
        {
            System.out.println("ERRor");
            System.out.println(latitude);
             System.out.println(longitude);
            throw new IllegalType("incorrect aircratf parameters");
        }
        if (type.equals("JetPlane")) {
            
            return new JetPlane(name, coordinates);
        }
        else if (type.equals("Baloon")) {
            System.out.println(latitude);
             System.out.println(longitude);
                System.out.println(" BALOON ERRor");
            return new Baloon(name, coordinates);
        }
        else if (type.equals("Helicopter"))  {
            return new Helicopter(name, coordinates);
        }
        else if ( (!type.equals("Helicopter")) || (!type.equals("Baloon")) || (!type.equals("JetPlane")) ) {
            // System.out.println(type);
            // System.out.println(latitude);
            //  System.out.println(longitude);
            throw new AircraftException("incorrect aircratf type");

        }
        return null;
    }
}
