import greenfoot.*;

/**
 * 
 * Esta clase te muestra los records.
 * 
 */
public class Brecord extends Boton
{
    private World m2;
    
    public Brecord()
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
            setImage("ICO2.2.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("ICO2.png");
        }
    }
    /**
     * Cambia el mundo si es tocado este objeto.
     */
    public void cambiaMundo(World w)
    {
        if(Greenfoot.mouseClicked(this))
        {
            w=new Puntos();
            Greenfoot.setWorld(w);
        } 
    }  
}
