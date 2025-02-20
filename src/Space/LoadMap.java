package Space;

import javax.tools.JavaFileManager;
import javax.xml.stream.Location;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LoadMap {
    public boolean loadMap(){
        try (BufferedReader br = new BufferedReader(new FileReader("mapa.csv"))){
            String line;
            while ((line = br.readLine()) !=null){
                String[] lines = line.split(";");
                Location location = new Location(
                        lines[1],
                        Integer.parseInt(lines[0]),
                        Arrays.copyOfRange(lines,2,5)
                );
                world.put(Integer.valueOf(lines[0]),location);
            }
            return true;
        }catch (IOException e){
            return false;
        }

    }
}
