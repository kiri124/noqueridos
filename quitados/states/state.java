package states;
import  java.awt.Graphics;
public abstract class state {

    private static state currentState = null;

    public static state getCurrentState() {
        return currentState;
    }

    public static void changestate(state newstate) {
        currentState = newstate;
    }
    public abstract void update();
    public abstract void draw(Graphics g);

}