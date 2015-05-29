import greenfoot.*;

/**
 *Esta clase muestra la ayuda.
 */
public class Bayuda extends Boton
{
    /**
     * Act - do whatever the Icoau wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private World m2;
    public Bayuda()
    {
        m2=getWorld();
    }
    
    public void act() 
    {
        mouseSobreObjecto(m2);
        cambiaMundo(m2);
    } 
    
    /**
     * Detecta si el objeto es tocado por el mouse.
     */
    public void mouseSobreObjecto(World w)
    {
          if(Greenfoot.mouseMoved(this))
        {
            setImage("ICO4.2.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("ICO4.png");
        }
    }
    
    /**
     * Cambia el mundo si es tocado por el objeto.
     */
    public void cambiaMundo(World w)
    {
        if(Greenfoot.mouseClicked(this))
        {
            w= new Ayuda();
            Greenfoot.setWorld(w);
        } 
    }
}

