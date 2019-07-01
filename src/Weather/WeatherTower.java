package Weather;

public class WeatherTower extends  Tower {

    public String getWeather(Coordinates coordinates)
    {

        return WeatherProvider.getProvider().getCurrentWeather(coordinates); //come back check getProvider static
//        return ("Hello");
    }

    public void changeWeather()
    {
        this.conditionsChanged();
    }

}
