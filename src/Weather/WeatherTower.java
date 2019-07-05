package Weather;

public class WeatherTower extends  Tower {

    /**
     * This will request the current weather
     * @param coordinates - Gets the current weather 
     * @return - returns the current weather.
     */

    public String getWeather(Coordinates coordinates)
    {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates); //come back check getProvider static
    }

    /**
     * This notifies the weather tower that the weather conditions have changed
     */

    public void changeWeather()
    {
        this.conditionsChanged();
    }

}
