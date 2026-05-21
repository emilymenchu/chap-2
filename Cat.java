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

    public Cat()
    {
        GreenfootImage imagen = getImage();
        imagen.scale(50, 60); 
        setImage(imagen);
    }
    public void act()
    {
        mover();
        aplicarGravedad();
    }
    public void mover()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4, getY());
        }

        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4, getY());
        }

        if(Greenfoot.isKeyDown("space") && puedeSaltar())
        {
            velocidadY = salto;
        }
    }

    public void aplicarGravedad1()
    {
        velocidadY += gravedad;

    setLocation(getX(), getY() + velocidadY);

    int suelo = getWorld().getHeight() - 50;

    if(getY() >= suelo - getImage().getHeight()/2)
    {
        setLocation(getX(), suelo - getImage().getHeight()/2);

        velocidadY = 0;
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
}
