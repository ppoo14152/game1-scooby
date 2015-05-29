
import greenfoot.*;
import java.awt.Color;

/**
 * Esta clase es llamada cuando un obstaculo, un enemigo o la ScoobyGalleta toca a la clase Scooby.
 * 
 * 
 */
public class Final extends World
{
    private GreenfootImage imagenfinal;
    private Letrero nombre;
    private Letrero score;
    private Letrero nombreM;
    private Letrero scoreM;
    private Letrero jugador;
    private Bmenu bm;

    /**
     * Constructor for objects of class Final.
     * 
     */
    
    public Final(int x)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        if(x==1)
        {
            imagenfinal=new GreenfootImage("GAMEOVER.jpg");
        }
        if(x==0)
        {
            imagenfinal=new GreenfootImage("WINNER.jpg");
        }
        setBackground(imagenfinal);
       /* //nombre=new Letrero(jug.getNombre()+":",Color.YELLOW);
        addObject(nombre,455,298);
        //score=new Letrero(""+jug.getScore(),Color.GREEN);
        addObject(score,600,299);*/
        //nombreM=new Letrero("NOMBRE",Color.RED);
        //addObject(nombreM,448,266);
        //scoreM=new Letrero("JUGADOR",Color.RED);
        //addObject(scoreM,602,365);
        bm=new Bmenu();
        addObject(bm,400,550);
    }
    
    
}
