package crafts;

import Weather.Coordinates;
import Weather.WeatherTower;

public class Baloon extends Aircraft implements  Flyable{

    private WeatherTower weatherTower;

     /**
     * Balloon constructor that gets name and coordinates from the base class
     * @param name - name to be assigned to the Balloon
     * @param coordinates - Coordinates to be assigned to the Balloon
     */

    public Baloon(String name, Coordinates coordinates)
    {
        super(name,coordinates);
    }

    /**
     * This will request the weather from the weatherTower and based on the
     * conditions, it will modify the coordinates
     * If the height of the flyable is 0 (meaning the flight has landed)
     * it will unregister it from the weatherTower
     */

    public void updateConditions()
    {
        String weather = weatherTower.getWeather(coordinates);
        if (weather.equals("SUN"))
        {
            LogMessage.addString(LogMessage.formatStringBaloon(this, "This is some nice weather we are having. Nice clear blue skies and nice views all over"));
            this.coordinates = new Coordinates(coordinates.getLongitude() + 2, coordinates.getLatitude(), coordinates.getHeight() + 4);
        }
        else if (weather.equals("RAIN"))
        {
            LogMessage.addString(LogMessage.formatStringBaloon(this, "Flaws here ! Put ur hand in the air!"));
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 5);
        }
        else if (weather.equals("FOG"))
        {
            LogMessage.addString(LogMessage.formatStringBaloon(this, "Balloon to WeatherTower, the air looks kinda weird or maybe i am just high"));
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 3);

        }
        else if (weather.equals("SNOW"))
        {
            LogMessage.addString(LogMessage.formatStringBaloon(this, "Balloon going down at a rapid pace"));
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 15);
        }

        if (coordinates.getHeight() <= 0)
        {
            LogMessage.addString(LogMessage.formatStringBaloon(this, "is crash landing brace yourself! MAYDAY!MAYDAY!"));
            weatherTower.unregister(this);
        }
    }

    /**
     * Registers this flyable(i.e Balloon to the weatherTower)
     * @param weatherTower - Registers the flyable to instance of weather tower.
     */

    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        LogMessage.addString(LogMessage.formatStringTowerBaloon(this, "registered to weather."));
    }
}
