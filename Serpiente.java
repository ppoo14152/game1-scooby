import greenfoot.*;

/**
 * Write a description of class serpiente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Serpiente extends Enemigo
{
  
    /**
     * Act - do whatever the serpiente wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muevete();
    } 
    
    public void muevete()
    {
        if(checa()==true)
            move(-1);
        else
            setLocation(950,570);
    }
    
    /**
     * Checa si Serpiente ha sobrepasado los limites del mundo.
     */
    public boolean checa()
    {
        boolean c = false;
        int aux;
        Jugar m = new Jugar(0);
        GreenfootImage i = new GreenfootImage("serpiente2.png");
        aux = i.getWidth()/2;
        if(getX()-aux>5)
                 c = true;
        else
                 c = false;
        return c;
    }
}