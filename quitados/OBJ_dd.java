package object;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;


public class OBJ_dd extends SuperObject{
    public OBJ_dd(){
        name="dd";
    try{        
    image= ImageIO.read(new File("C:\\Users\\USUARIO\\Desktop\\USIL-POO2-2221281\\GamePoo2\\res\\Objects\\casco.png"));
    }
    catch(IOException e){

    }
    collision=true;

}
}
