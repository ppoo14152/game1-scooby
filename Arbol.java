import greenfoot.*;

/**
 * Write a description of class arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbol extends Obstaculo
{
    private World m2;
    public Arbol()
    {
        m2=getWorld();
    }
    /**
     * Act - do whatever the roca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Scooby.class))
        {
            cambiaMundo(m2);
            removeTouching(Scooby.class);
        }
      
        }
        
      public void cambiaMundo(World w)
      {
        /* int e=1;
         
            w= new Final(e);
            Greenfoot.setWorld(w);*/
    
             Greenfoot.setWorld(new Final(1));
        
    }
    
}
