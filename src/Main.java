import Weather.WeatherTower;
import crafts.AircraftFactory;
import crafts.Flyable;
import crafts.LogMessage;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;




public class Main
{

    public static void main(String[] arg) {

        ArrayList<Flyable> f = new ArrayList<>();
        WeatherTower tower = new WeatherTower();
        Flyable flyable;

        try{
            File file = new File(arg[0]);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String Readline = reader.readLine();
            int longitude ;
            int cycle = Integer.parseInt(Readline);
            System.out.println(cycle);

            if(Readline != null)
            {
                System.out.println("hello");
            }
            while((Readline = reader.readLine()) != null )
            {
                String[] holder;
                holder = Readline.split(" ");
                int longt = Integer.parseInt(holder[2]);
                int lat = Integer.parseInt(holder[3]);//holder[3] = lat;
                int height = Integer.parseInt(holder[4]);//holder[4] = height;
                flyable = AircraftFactory.newAircraft(holder[0], holder[1], longt, lat, height);
                flyable.registerTower(tower);
            }
            reader.close();
                for (int count = 0; count <= cycle; count++)
                {
                    tower.changeWeather();
                }
                LogMessage.printInTxt();
            }
        catch( IIOException | FileNotFoundException e )
        {
            System.out.println(e);
        }
        catch( IOException  e )
        {
            e.printStackTrace();
        }
        catch( Exception e)
        {
            System.out.println(e);
        }
    }
}
