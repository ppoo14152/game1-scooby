import greenfoot.*;

/**
 * Proyecta el nombre de los autores del juego al ser presionado el boton autores.
 * 
 * 
 */
public class Autor extends World
{

    /**
     * Constructor for objects of class autor.
     * 
     */
    public Autor()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(800, 600, 1); 
        Boton r;
        r=new Return();
        addObject(r,58,542);
    }
}
