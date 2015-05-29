import greenfoot.*;

/**
 * Esta clase te permite iniciar el juego.
 */
public class Bjuega extends Boton
{
    private World m2;
    public Bjuega()
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
            setImage("ICO1.2.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("ICO1.png");
        }
    }
    
    /**
     * Cambia el mundo si es tocado por este objeto.
     */
    public void cambiaMundo(World w)
    {
        if(Greenfoot.mouseClicked(this))
        {
            w=new Jugar(1);
            Greenfoot.setWorld(w);
        } 
    }
}
