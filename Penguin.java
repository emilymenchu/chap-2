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
    int timer = 0;
    
    boolean derrotado = false;
    int velocidadCaida = 5;


    boolean vertical = false;
    GreenfootImage imagen;
    public Penguin()
    {
    }
    public void addedToWorld(World world)
    {
        if(world instanceof MyWorld)
        {
            imagen =
            new GreenfootImage("penguin.png");
            imagen.scale(50, 60);
    
        } 
        if(world instanceof Jungle)
        {
            imagen =
            new GreenfootImage("monkey.png");
            imagen.scale(90, 100);
    
        }
        
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
        if(derrotado)
        {
            caer();
        }
        else
        {
            mover();
            lanzarDulces();
        }
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

    public void lanzarDulces()
    {
        timer++;

        if(timer >= 80)
        {
            Candy dulce = new Candy();

            getWorld().addObject
            (
                dulce,
                getX(),
                getY() + 20
            );

            timer = 0;
        }
    }
    public void derrotar()
    {
        derrotado = true;
    }
    public void caer()
    {
        setLocation(getX(), getY() + velocidadCaida);
    
        setRotation(getRotation() + 10);
    
        if(getY() > getWorld().getHeight())
        {
            getWorld().removeObject(this);
        }
    }
}
