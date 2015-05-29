import greenfoot.*;
import java.util.*;
import java.awt.Color; 

/**
 * La clase muro se mueve de isquierda a derecha y este va cambiando de imagen de modo que simule que el muro crece y decrece.
 * 
 * 
 */
public class Muro extends Obstaculo
{
    private World m2;
    private GreenfootImage img1=new GreenfootImage("pared1.png");
    private GreenfootImage img2=new GreenfootImage("pared2.png");
    private int cont;
    
    public Muro()
    {
        m2=getWorld();
    }
    
    /**
     * Act - do whatever the roca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mueveObstaculo("pared1.png",-1);
        
        
        if(isTouching(Scooby.class))
        {
            removeTouching(Scooby.class);
            cambiaMundo(m2);
        }
        
        creceMuro();
    } 
    /**
     * Se encarga de cambiar el mundo es tocado por la clase Scooby.
     */
    public void cambiaMundo(World w)
    {
             Greenfoot.setWorld(new Final(1));
    }
    
    /**
     *  Se encaraga de crecer el muro en un tiempo determinado.
     */
    public void creceMuro()
    {
       int num = Greenfoot.getRandomNumber(100); 
       if(num==2) 
            setImage("pared2.png");
       if(num==1)
            setImage("pared1.png");
    }
      
     
      
    
}
