import greenfoot.*;
import java.util.*;
import java.util.List;

/**
 * Write a description of class fantasma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fantasma extends Enemigo
{
    private int direccion;
    
    public Fantasma()
    {
        scooby=null; 
    }
       
    /**
     * Act - do whatever the fantasma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        inicializaS(0);
        muevete();
    }   
    
    /**
     * Mueve al fantasma de acuerdo a las coordenadas de Scooby
     */
    public void muevete()
    {
       
        if(scooby.getX()<getX() && scooby.getDir()==1)
        {
            if(this.checa(2,"fantasma2.png")==true)
            {
                setImage("fantasma2.png");
                move(-1);
                direccion = 1;
            }
        }
        
        if(scooby.getX()>getX() && scooby.getDir()==2)
        {
            if(checa(1,"fantasma1.png")==true)
            {
                setImage("fantasma1.png");
                move(1);
                direccion = 2;
            }
        }   
    }
    /**
     * Envia si el objeto se dirige a la izquierda o a la derecha
     */
    public int getDir()
    {
        return direccion;
    }
}