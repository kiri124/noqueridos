package enemigo;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


import main.GameObject;
import math.Vector2D;


public abstract class MovingObject extends GameObject {

    protected Vector2D velocity;
    protected AffineTransform at;
    protected double angle;
    protected double maxVel;
    protected int width;
    protected int height;
    protected boolean Dead;

    public MovingObject(Vector2D position, Vector2D velocity, double maxVel, BufferedImage texture) {
        super(position, texture);
        this.velocity = velocity;
        this.maxVel = maxVel;

        width = texture.getWidth();
        height = texture.getHeight();
        angle = 0;

        Dead = false;
    }
    /*

    protected void collidesWith(){

        ArrayList<MovingObject> movingObjects = gameState.getMovingObjects();

        for(int i = 0; i < movingObjects.size(); i++){

            MovingObject m  = movingObjects.get(i);

            if(m.equals(this))
                continue;

            double distance = m.getCenter().subtract(getCenter()).getMagnitude();

            if(distance < m.width/2 + width/2 && movingObjects.contains(this) && !m.Dead && !Dead){
                objectCollision(this, m);
            }
        }
    }

     private void objectCollision(MovingObject a, MovingObject b) {

        Player p = null;

        if(a instanceof Player)
            p = (Player)a;
        else if(b instanceof Player)
            p = (Player)b;

        if(p != null && p.isSpawning())
            return;

        if(a instanceof Meteor && b instanceof Meteor)
            return;

        if(!(a instanceof PowerUp || b instanceof PowerUp)){
            a.Destroy();
            b.Destroy();
            return;
        }

        if(p != null){
            if(a instanceof Player){
                ((PowerUp)b).executeAction();
                b.Destroy();
            }else if(b instanceof Player){
                ((PowerUp)a).executeAction();
                a.Destroy();
            }
        }

    }

*/
    protected Vector2D getCenter(){
        return new Vector2D(position.getX() + width/2, position.getY() + height/2);
    }

    public boolean isDead() {return Dead;}

}