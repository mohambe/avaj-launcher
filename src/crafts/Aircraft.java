package crafts;
import Weather.Coordinates;


public class Aircraft {


    protected long id;
    protected   String name;
    protected Coordinates coordinates; //create object
    private static  long idCounter = 0;

    protected Aircraft(String name, Coordinates coordinate)
    {
        this.id = nextId();//create new unique id
        this.name=name;
        this.coordinates=coordinate;
    }

    private long nextId(){
        idCounter++;

        return idCounter;
    }
}
