package crafts;

import Weather.WeatherTower;

public interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower weatherTower); //Weather will return a Weather object
}
