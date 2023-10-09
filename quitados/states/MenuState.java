package states;
import java.awt.Graphics;
import java.util.ArrayList;


public abstract class MenuState extends state {
    private ArrayList<Button> buttons;

    public MenuState(){
        buttons = new ArrayList<Button>();
        buttons.add(new Button

    public void update() {
        // Lógica de actualización del menú
    }

    public void draw(Graphics g) {
        // Dibuja el menú en la pantalla
    }
}
