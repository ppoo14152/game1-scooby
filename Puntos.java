import greenfoot.*;

/**
 * Proyecta los puntos cuando es presionado el boton puntaje.
 * 
 * 
 */
public class Puntos extends World
{

    public Puntos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Boton r;
        r=new Return();
        addObject(r,400,80);
        Jug score=new Jug(300, 350);
       addObject(score, 400, 343);
    }
}
