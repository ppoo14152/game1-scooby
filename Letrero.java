import greenfoot.*;
import java.awt.*;


/**
 * Write a description of class Letrero here.
 * 
 * Dibuja los letreros en el mundo.
 */
public class Letrero extends Actor
{
    /**
     * Act - hace lo que Letrero quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    GreenfootImage texto;
    public Letrero(String unTexto,Color color)
    {
        texto=new GreenfootImage(unTexto,50,color,null);
        setImage(texto);
    }
    
    public void modificaLetrero(String unTexto,Color color)
    {
        texto.clear();
        texto=new GreenfootImage(unTexto,50,color,null);
        setImage(texto);
    } 
}
