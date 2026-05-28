import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    GreenfootImage imagen;
    GreenfootImage happy;
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bear(){
    }
    public void addedToWorld(World world)
    {
        if(world instanceof MyWorld)
        {
            imagen =
            new GreenfootImage("bear.png");
            imagen.scale(60, 70);
            happy = new GreenfootImage("happy-bear.png");
    
        } 
        if(world instanceof Jungle)
        {
            imagen =
            new GreenfootImage("jaguar.png");
            imagen.scale(90, 100);
            happy = new GreenfootImage("happy-jaguar.png");
    
        }
        
        setImage(imagen);
    }
    public void act()
    {
        
    }
    public void ganar()
    {
        happy.scale(60, 70);
        setImage(happy);
    }
}
