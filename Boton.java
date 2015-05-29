import greenfoot.*;

/**
 * Write a description of class Boton here.
 * 
 * Es la clase padre de todos los botones.
 */
public abstract class Boton extends Actor
{
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   abstract public void mouseSobreObjecto(World w);
   abstract public void cambiaMundo( World w);
}
