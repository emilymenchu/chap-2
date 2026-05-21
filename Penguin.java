import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Penguin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Penguin extends Actor
{
    /**
     * Act - do whatever the Penguin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int velocidadX = 0;
    int velocidadY = 0;

    int limiteMin;
    int limiteMax;

    boolean vertical = false;
    public Penguin()
    {
        GreenfootImage imagen = getImage();
        imagen.scale(50, 60);
        setImage(imagen);
    }
    public void act()
    {
        mover();
    }
    public void mover()
    {
        // movimiento vertical
        if(vertical)
        {
            setLocation(getX(), getY() + velocidadY);

            if(getY() >= limiteMax || getY() <= limiteMin)
            {
                velocidadY = -velocidadY;
            }
        }

        // movimiento horizontal
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
