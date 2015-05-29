import greenfoot.*;

/**
 * Proyecta la portada del juego el cual consiste en los botones jugar, puntaje, ayuda y autores.
 * 
 *
 */
public class Mundo extends World
{
  public int esena=0;
 
    /**
     * Constructor for objects of class mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Boton b1;//Boton Juego
        Boton b2;//Boton Autores
        Boton b3;
        Boton b4;
        
        b1=new Bjuega();
        b2=new Bautores();
        b3=new Bayuda();
        b4=new Brecord();
        
        
        addObject(b1,600,200);//Agrega el Boton Jugar
        addObject(b2,600,400);//Agrega el Boton Autores 
        addObject(b3,700,300);//Agrega el Boton Autores
        addObject(b4,700,500);
    }
  
    
}
