import greenfoot.*;

/**
 * Write a description of class vampiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vampiro extends Enemigo
{
    private int x;
    private int y;
    private World m2;
    
    
    public Vampiro()
    {
        x=1;
        y=1;
    }
    
    /**
     * Act - do whatever the vampiro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muevete();
        choque();
       
    }  
    
    /**
     * Mueve al objeto vampiro por todo el mundo
     */
    public void muevete()
    {
        boolean c = false;
        int aux;
        Jugar m = new Jugar(0);
        GreenfootImage i = new GreenfootImage("vampiro2.png");
        aux = i.getWidth()/2;
        setLocation(getX()+x,getY()+y);
           if(getX()+aux>m.getWidth()-30)
                x=x*-1;
                
           if(getX()<50)
                x=x*-1;
               
           if(getY()+aux>m.getHeight()-30)
               y=y*-1;
            
           if( getY()<50)
                y=y*-1;
    }
    
    /**
     * Valida si Vampiro es tocado por un objeto de la clase Scooby
     */
    private void choque()
    {
        if(this.isTouching(Scooby.class))
        {
            cambiaMundo(m2);
            removeTouching(Scooby.class);
        }
         
            
    }
    
    
    
   
}
