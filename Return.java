import greenfoot.*;

/**
 * Esta clase te permite regresar al menú
 */
public class Return extends Boton
{
    private World m2;
    
    public Return()
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
            setImage("Return.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("Return.png");
        }
    }
    
    /**
     * Cambia el mundo si es tocado por el objeto.
     */
    public void cambiaMundo(World w)
    {
        if(Greenfoot.mouseClicked(this))
        {
            w=new Mundo();
            Greenfoot.setWorld(w);
        } 
    }
}
