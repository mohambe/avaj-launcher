package crafts;

import Weather.Coordinates;

public abstract class AircraftFactory {


    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) { //make lower case
        Coordinates coordinates = new Coordinates(longitude, latitude, height);
        if (type.equals("JetPlane")) {
            return new JetPlane(name, coordinates);
        }
        else if (type.equals("Baloon")) {
            return new Baloon(name, coordinates);
        }
        else if (type.equals("Helicopter"))  {
            return new Helicopter(name, coordinates);
        }
        return null;
    }
}
