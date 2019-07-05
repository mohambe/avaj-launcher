package Weather;

import java.util.Random;

public class WeatherProvider {

    private static String[] weather;
    private static WeatherProvider weatherProvider;

    private  WeatherProvider()
    {
        this.weather  = new String[]{"RAIN","FOG","SUN","SNOW"};
    }

      /**
     * Create object only when weatherProvider is none, so only one
     * object instance can be created
     * @return - Weather Provider instance
     */

    public static WeatherProvider getProvider(){
        if (WeatherProvider.weatherProvider == null) {
            WeatherProvider.weatherProvider = new WeatherProvider();
        }
        return WeatherProvider.weatherProvider;
    }


    /**
     * The random weather generator
     * Checks weather the height will remain in the range 0-100;
     * @param coordinates - Are the coordinates that are passed to get the current weather
     * @return - returns the selected weather type.
     */

    public  String getCurrentWeather(Coordinates coordinates)
    {
        Random rand = new Random();
        int n = rand.nextInt(4);
        return  weather[n];
    }

}
