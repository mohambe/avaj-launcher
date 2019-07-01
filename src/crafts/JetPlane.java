package crafts;

import Weather.Coordinates;
import Weather.WeatherTower;

public class JetPlane  extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    public JetPlane(String name, Coordinates coordinates)
    {
        super(name,coordinates);

    }
   
    public void updateConditions() {
         String weather = weatherTower.getWeather(coordinates);
        if (weather.equals("SUN"))
        {
            LogMessage.addString(LogMessage.formatStringJetPlane(this, "This is some nice weather we are having. Nice clear blue skies could do with a drink"));
            this.coordinates = new Coordinates(coordinates.getLongitude() + 10, coordinates.getLatitude(), coordinates.getHeight() + 2);
        }
        else if (weatherTower.equals("RAIN"))
        {
            LogMessage.addString(LogMessage.formatStringJetPlane(this, "Flaws here! This weather is taking a turn for the worst, Bring it on!"));
            this.coordinates = new Coordinates(coordinates.getLongitude() + 5, coordinates.getLatitude(), coordinates.getHeight());
        }
        else if (weatherTower.equals("FOG"))
        {
            LogMessage.addString(LogMessage.formatStringJetPlane(this, "JetPlane to WeatherTower, we can't see a thing over here!"));
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 1, coordinates.getHeight());

        }
        else if (weatherTower.equals("SNOW"))
        {
            LogMessage.addString(LogMessage.formatStringJetPlane(this, "Command, JetPlane Flaws! Reporting sightings of beautiful women below"));
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 7);
        }

        if (coordinates.getHeight() <= 0)
        {
            LogMessage.addString(LogMessage.formatStringJetPlane(this, "is crash landing brace yourself! MAYDAY!MAYDAY!"));
            weatherTower.unregister(this);
        }

    }

    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
        weatherTower.register(this);
        LogMessage.addString(LogMessage.formatStringTowerJetPlane(this, "registered to weather."));
    }
}
