package enemigo;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import math.Vector2D;


public class enemy  {

    private ArrayList<Vector2D> path;
    private Vector2D currentNode;
    private boolean following;

    private long fireRate;


    public enemy(Vector2D position, Vector2D velocity, double maxVel, BufferedImage texture,
               ArrayList<Vector2D> path) {

        this.path = path;

        following = true;
        fireRate = 0;

    }


}
