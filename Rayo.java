import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rayo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rayo extends Enemigo
{
    private int x = 3;
    private int y = 3;
    private int direccion = 1;
    
    public Rayo()
    {
        fantasma = null;
    }
    
    public void act() 
    {
        inicializaF(0);
        muevete();
       
    }  
    
    /**
     * Mueve la clase fantasma a la izquierda y a la derecha. 
     */
    public void muevete()
    {
            if(direccion == 1)
            {
                if(checa(1,"rayo2.png")==true)
                    setLocation(getX()+x,getY()+y);
                else
                    aparece();
            }
            
             if(direccion == 2)
            {
                if(checa(2,"rayo1.png")==true)
                    setLocation(getX()-x,getY()+y);
                else
                    aparece();
            }
        
    }
    
    /**
     * Aparece en frende del objeto de la clase fantasma que se encuentra en el mundo, con coordenadas especificas.
     */
    private void aparece()
    {
        if(fantasma.getDir()== 2)
        {
            setImage("rayo2.png");
            setLocation(fantasma.getX()+33,fantasma.getY()+50);
            direccion=1;
        }
        
        if(fantasma.getDir() == 1)
        {
            setImage("rayo1.png");
            setLocation(fantasma.getX()-33,fantasma.getY()+50);
            direccion=2;
        }
        
    }
}