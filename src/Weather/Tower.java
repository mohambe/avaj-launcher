package Weather;

import crafts.Flyable;

import java.util.ArrayList;

public abstract class Tower {

    private ArrayList<Flyable> observers = new ArrayList<>();

    public void register(Flyable flyable) //once above certain point call this
    {
        observers.add(flyable);
    }

      /**
     * UnRegisters the flyable if it exists
     * @param flyable - Is the flyable that will be unregistered from the weather tower
     */

    public void unregister(Flyable flyable) //once below certain point call this
    {
        observers.remove(flyable);
    }

    protected void conditionsChanged()
    {
        for (int i = 0; i < observers.size(); i++)
        {
            observers.get(i).updateConditions();
        }
    }
}
