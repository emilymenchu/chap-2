import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(900, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dispenser dispenser =  new  Dispenser();
        addObject(dispenser, 720, 133);
        dispenser.setLocation(816, 164);
        Cat cat = new Cat();
        addObject(cat,40,484);
        cat.setLocation(26,520);

        InvisiblePlatform meta = new InvisiblePlatform();

        addObject(meta, 820, 220);

        Platform p1 = new Platform();
        p1.vertical = true;
        p1.velocidadY = 1;
        p1.limiteMin = 419;
        p1.limiteMax = 550;
        addObject(p1, 760, 420);

        Platform p2 = new Platform();
        p2.vertical = true;
        p2.velocidadY = -1;

        p2.limiteMin = 290;
        p2.limiteMax = 420;

        addObject(p2, 600, 420);

        Platform p3 = new Platform();

        p3.vertical = false;

        p3.velocidadX = 1;

        p3.limiteMin = 251;
        p3.limiteMax = 450;

        addObject(p3, 350, 350);

        Platform p4 = new Platform();

        p4.vertical = true;
        p4.velocidadY = -1;

        p4.limiteMin = 150;
        p4.limiteMax = 350;

        addObject(p4, 100, 250);

        Platform p5 = new Platform();

        p5.vertical = false;

        p5.velocidadX = -2;

        p5.limiteMin = 250;
        p5.limiteMax = 650;

        addObject(p5, 450, 150);
    }
}
