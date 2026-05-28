import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Platform extends Actor
{

    /**
     * 
     */
    public Platform()
    {
        GreenfootImage imagen = getImage();
        imagen.scale(150, 40);
        setImage(imagen);
    }

    int velocidadX = 0;
    int velocidadY = 0;

    int limiteMin;
    int limiteMax;

    boolean vertical = false;
    GreenfootImage imagen;
    public void addedToWorld(World world)
    {
        if(world instanceof MyWorld)
        {
            imagen =
            new GreenfootImage("platform.png");
    
        } 
        if(world instanceof Jungle)
        {
            imagen =
            new GreenfootImage("2platform.png");
    
        }
        imagen.scale(150, 40);
        setImage(imagen);
    }
    public void act()
    {
        if(getWorld() instanceof MyWorld)
        {
            MyWorld mundo = (MyWorld)getWorld();
        
            if(!mundo.juegoIniciado)
            {
                return;
            }
        }
        mover();
    }

    public void mover()
    {
        if(vertical)
        {
            setLocation(getX(), getY() + velocidadY);

            if(getY() >= limiteMax || getY() <= limiteMin)
            {
                velocidadY = -velocidadY;
            }
        }

        else
        {
            setLocation(getX() + velocidadX, getY());

            if(getX() >= limiteMax || getX() <= limiteMin)
            {
                velocidadX = -velocidadX;
            }
        }
    }
}
