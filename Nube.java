import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase se encarga de ayudar a Scooby a desplzarse en el mundo. Si estas dos clases se intersectan Scooby adopta el movimiento de Nube.
 * 
 * 
 */
public class Nube extends Actor
{
     GreenfootImage i;
    /**
     * Act - do whatever the Nube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mueve();
    }
    
    /**
     * Se encarga de mover a la nube
     */
    public void mueve()
    {
        if(checa()==true)
            move(5);
        else
            setLocation(52,418);
    }
    
    /**
     * checha si la nube sobrepasa los limites del mundo
     */
    public boolean checa()
    {
        boolean c = false;
        int aux;
        Jugar m = new Jugar(0);
        i = new GreenfootImage("nube.png");
        aux = i.getWidth()/2;
        if(getX()+aux<m.getWidth())
                 c = true;
        else
                 c = false;
      
            
        return c;
    }
}
