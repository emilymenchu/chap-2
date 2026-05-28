import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Candy extends Actor
{
int velocidad = 4;

    GreenfootImage imagen;
    public Candy()
    {
    }
    public void addedToWorld(World world)
    {
        if(world instanceof MyWorld)
        {
            imagen =
            new GreenfootImage("candy.png");
            imagen.scale(20, 40);
    
        } 
        if(world instanceof Jungle)
        {
            imagen =
            new GreenfootImage("banana.png");
            imagen.scale(30, 15);
    
        }
        imagen.scale(20, 40);
        setImage(imagen);
    }

    public void act()
    {
        caer();

         if(getWorld() == null)
            {
                return;
            }

        tocarGato();
    }

    public void caer()
    {
        setLocation(getX(), getY() + velocidad);

        if(getY() > getWorld().getHeight()-50)
        {
            getWorld().removeObject(this);
            return;
        }
    }

    public void tocarGato()
    {
        if(isTouching(Cat.class))
        {
            Cat gato = (Cat)getOneIntersectingObject(Cat.class);

            gato.perder();

            getWorld().removeObject(this);
        }
    }
}
