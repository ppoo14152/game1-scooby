import greenfoot.*;

/**
 * Es la clase padre de todos los obstáculos la cual les hereda métodos.
 * 
 */
public class Obstaculo extends Actor
{
    /**
     * Act - do whatever the obstaculo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    /**
     * checha si el obstaculo sobrepasa los limites del mundo
     */
    private boolean checa(String unaFoto)
    {
        boolean c = false;
        int aux;
        Jugar m = new Jugar(0);
        GreenfootImage i = new GreenfootImage(unaFoto);
        aux = i.getWidth()/2;
        if(getX()-aux<0)
                 c = true;
        return c;
    }
    
     /**
       * Método que mueve el obstáculo y lo redibuja cuando sobrepasa los limites del mundo
       */
      public void mueveObstaculo(String unaFoto, int unaVelocidad)
      {
          if(this.checa(unaFoto) == false)
            move(unaVelocidad);
          else
            setLocation(955,533);
          
      }
}
