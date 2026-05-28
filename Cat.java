import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int velocidadY = 0;
    int gravedad = 1;
    int salto = -15;
    
    boolean cayendo = false;

    int timerCaida = 0;
    
    GreenfootImage defaultImg = new GreenfootImage("cat.png");
    GreenfootImage rightImg = new GreenfootImage("cat-right.png");
    GreenfootImage leftImg = new GreenfootImage("cat-left.png");
    public Cat()
    {
        defaultImg.scale(50, 60); 
        setImage(defaultImg);
    }
    public void act()
    {
        MyWorld mundo = (MyWorld)getWorld();

        if(!mundo.juegoIniciado)
        {
            return;
        }
         if(cayendo)
        {
            caerDerrotado();
        }
        else
        {
            mover();
            aplicarGravedad();
            verificarPinguino();
            verificarVictoria();
        }
        
    }
    public void mover()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4, getY());
            leftImg.scale(70, 60);
            setImage(leftImg);
        }

        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4, getY());
            rightImg.scale(70, 60);
            setImage(rightImg);
        }

        if(Greenfoot.isKeyDown("up") && puedeSaltar())
        {
            velocidadY = salto;
        }
        if(!Greenfoot.isKeyDown("left") &&
           !Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("space"))
        {
            setImage(defaultImg);
        }
    }
    
    public void aplicarGravedad()
{
    velocidadY += gravedad;

    setLocation(getX(), getY() + velocidadY);

    Actor plataforma = getOneObjectAtOffset
    (
        0,
        getImage().getHeight()/2,
        Platform.class
    );

    if(plataforma != null && velocidadY >= 0)
    {
        int nuevaY = plataforma.getY()
        - plataforma.getImage().getHeight()/2
        - getImage().getHeight()/2;

        setLocation(getX(), nuevaY);

        velocidadY = 0;

        Platform p = (Platform) plataforma;

        if(!p.vertical)
        {
            setLocation(getX() + p.velocidadX, getY());
        }

        if(p.vertical)
        {
            setLocation(getX(), getY() + p.velocidadY);
        }
    }

    int suelo = getWorld().getHeight() - 50;

    if(getY() >= suelo - getImage().getHeight()/2)
    {
        setLocation(getX(), suelo - getImage().getHeight()/2);

        velocidadY = 0;
    }
}
    public boolean estaEnPlataforma()
    {
        Actor plataforma = getOneObjectAtOffset
        (
            0,
            getImage().getHeight()/2 + 2,
            Platform.class
        );

        return plataforma != null;
    }
    
    public boolean puedeSaltar()
    {
        Actor plataforma = getOneObjectAtOffset
        (
            0,
            getImage().getHeight()/2 + 2,
            Platform.class
        );
    
        int suelo = getWorld().getHeight() - 50;
    
        boolean enSuelo = getY() >= suelo - getImage().getHeight()/2;
    
        return plataforma != null || enSuelo;
    }
    public void verificarVictoria()
    {
        if(isTouching(Dispenser.class))
        {
            Bear bear = (Bear)getWorld().getObjects(Bear.class).get(0);
            Greenfoot.delay(60);
            bear.ganar();
            Greenfoot.delay(60);
            getWorld().showText
            (
                "¡FELICIDADES! AYUDASTE A TU AMIGO EL OSO POLAR",
                getWorld().getWidth()/2,
                50
            );

            Greenfoot.stop();
        }
    }
    public void perder()
    {
        cayendo = true;

        velocidadY = 12;
    }
    public void caerDerrotado()
    {
        timerCaida++;
    
        setLocation(getX(), getY() + velocidadY);
    
        setRotation(getRotation() + 10);
    
        if(timerCaida > 60)
        {
            setLocation(100, 500);
    
            setRotation(0);
    
            cayendo = false;
    
            timerCaida = 0;
        }
    }
    public void verificarPinguino()
    {
        if(isTouching(Penguin.class))
        {
            Penguin p = (Penguin)getOneIntersectingObject(Penguin.class);
    
            p.derrotar();
        }
    }
}
