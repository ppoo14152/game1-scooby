import greenfoot.*;

/**
 *Esta clase se mueve de arriba a abajo y cuando toca la parte inferior del mundo se dibuja en la parte superior en una coordenada en X.
 * 
 * 
 */
public class Roca extends Obstaculo
{
    private World m2;
    private int velocidad;
    
    public Roca()
    {
        m2=getWorld();
        velocidad = 1;
    }
    
    /**
     * Act - do whatever the roca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         mueveRoca();
        
        if(isTouching(Scooby.class))
        {
           cambiaMundo(m2);
            removeTouching(Scooby.class);
        }
    }
    /**
    * Esta clase se encarga de cambiar el mundo si es tocada por un objeto d ela clase Scooby.
    */
    public void cambiaMundo(World w)
    {
             Greenfoot.setWorld(new Final(1));
    }
    
    /**
     * Se encarga de mover la roca de arriba a abajo.
     */
    private void mueveRoca()
    {
        if(this.checa("roca.png") == false)
            setLocation(getX(),getY()+velocidad);
        else
            setLocation(Greenfoot.getRandomNumber(950),50);
    }
    
    /**
     * Checa si Roca ha sobrepasado los limites del mundo.
     */
      private boolean checa(String unaFoto)
    {
        boolean c = false;
        int aux;
        Jugar m = new Jugar(0);
        GreenfootImage i = new GreenfootImage(unaFoto);
        aux = i.getWidth()/2;
        if(getY()+aux>m.getHeight())
                 c = true;
        return c;
    }
}
  