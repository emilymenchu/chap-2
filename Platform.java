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

    public void act()
    {
        MyWorld mundo = (MyWorld)getWorld();

        if(!mundo.juegoIniciado)
        {
            return;
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
