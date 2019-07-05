package crafts;

import Weather.WeatherTower;

    /**
     * Interface methods that will be implemented by classes
     */

public interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower weatherTower); //Weather will return a Weather object
}
