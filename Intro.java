import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    GreenfootSound musica = new GreenfootSound("suspense.mp3");

    int frame = 1;

    int timer = 0;

    public Intro()
    {
        super(900, 600, 1);
        musica.playLoop();
        setBackground("intro/1.png");
    }

    public void act()
    {
        timer++;

        if(timer >= 8)
        {
            frame++;

            timer = 0;

            if(frame <= 35)
            {
                
                setBackground("intro/" + frame + ".png");
                if (frame == 17 || frame == 18 || frame == 35) {
                    Greenfoot.delay(300);
                }
            }
            else
            {
                musica.stop();
                Greenfoot.setWorld(new MyWorld());
            }
        }
    }
}
