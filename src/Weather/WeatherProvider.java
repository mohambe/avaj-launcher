package Weather;

import java.util.Random;

public class WeatherProvider {

    private static String[] weather;
    private static WeatherProvider weatherProvider;

    private  WeatherProvider()
    {
        this.weather  = new String[]{"RAIN","FOG","SUN","SNOW"};
    }

    public static WeatherProvider getProvider(){
        if (WeatherProvider.weatherProvider == null) {
            WeatherProvider.weatherProvider = new WeatherProvider();
        }
        return WeatherProvider.weatherProvider;
    }

    public  String getCurrentWeather(Coordinates coordinates)
    {
        Random rand = new Random();
        int n = rand.nextInt(4);
        return  weather[n];
    }

}
