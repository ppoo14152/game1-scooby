import greenfoot.*;

/**
 * Es la clase que proyecta el menú.
 * 
 *
 */
public class Bmenu extends Actor
{
     private World w;
    /**
     * Act - do whatever the Bmenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            w=new Mundo();
            Greenfoot.setWorld(w);
        }
    }    
}
