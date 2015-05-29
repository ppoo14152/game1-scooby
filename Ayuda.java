import greenfoot.*;

/**
 * Proyecta una breve explicacion al usuario de como manejar el juego al ser presionado el boton ayuda.
 * 
 * 
 */
public class Ayuda extends World
{
    /**
     * Construye las caracteristicas iniciales de la ventana de ayuda
     * 
     * @param music una musica de la clase GreenfootSound
     */
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Boton r;
        r=new Return();
        addObject(r,58,542);
    }
}

