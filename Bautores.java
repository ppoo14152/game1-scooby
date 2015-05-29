import greenfoot.*;

/**
 * Esta clase te muestra los autores.
 */
public class Bautores extends Boton
{
    private World m2;
    public Bautores()
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
            setImage("ICO3.2.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("ICO3.png");
        }
    } 
    
    /**
     *Cambia el mundo si es tocado por el objeto 
     */
    public void cambiaMundo(World w)
    {
        if(Greenfoot.mouseClicked(this))
        {
            w=new Autor();
            Greenfoot.setWorld(w);
        } 
    }
}
