import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vine extends Actor
{
    GreenfootImage defaultImg = new GreenfootImage("Vine.png");
    public Vine()
    {
        defaultImg.scale(45, 50); 
        setImage(defaultImg);
    }
    
    int velocidadX = 0;
    int velocidadY = 0;

    int limiteMin;
    int limiteMax;

    boolean vertical = false;

    public void act()
    {
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
