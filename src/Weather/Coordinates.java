package Weather;

public class Coordinates {

    private int longitude;
    private int latitude;
    private int height;

     /**
     * This will initialize the longitude, latitude, height based on passed parameters
     * @param longitude - positive longitude to be initialized
     * @param latitude - positive latitude to be initialized
     * @param height - Height in the range of 0-100 to be initialized.
     */
    public  Coordinates( int longitude, int latitude, int height)
    {
        if(longitude < 0)
            longitude = 0;
        else if (latitude <0)
            latitude = 0;
        else if(height < 0)
            height =0;
        else if(height > 100)
            height =100;

        this.longitude = longitude;
        this.latitude = latitude;
        this.height =height;
    }

    public int getLongitude()
    {
        return this.longitude;
    }

    public int getHeight()
    {
        return this.height;
    }

    public int getLatitude()
    {
        return this.latitude;
    }
}
