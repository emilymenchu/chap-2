import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TransparentPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvisiblePlatform extends Platform
{
    public InvisiblePlatform()
    {
        getImage().setTransparency(0);
        GreenfootImage imagen = getImage();
        imagen.scale(190, 40); 
        setImage(imagen);
    }
    /**
     * Act - do whatever the TransparentPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
