package crafts;
import Weather.Coordinates;


public class Aircraft {

    protected long id;
    protected   String name;
    protected Coordinates coordinates; //create object
    private static  long idCounter = 0;

    /**
     * This constructor assigns the specific name and coordinates to the aircraft.
     * @param name - name of aircraft(i.e name-B1)
     * @param coordinates- aircraft coordinates(i.e coordinates-Lat:10-Long:12-Height:21)
    */
    protected Aircraft(String name, Coordinates coordinate)
    {
        this.id = nextId();//create new unique id
        this.name=name;
        this.coordinates=coordinate;
    }

     /**
     * This generates a unique ID that will be assigned to the flight
     * @return - idCounter incremented.
     */

    private long nextId(){
        idCounter++;

        return idCounter;
    }
}
