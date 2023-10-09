package object;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public class OBJ_Puntos extends SuperObject{
    public OBJ_Puntos(){
        name="dd";
        try{
            image= ImageIO.read(getClass().getResourceAsStream("/tiles/cora.png"));
        }
        catch(IOException e){

        }
    }
}
