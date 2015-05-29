import greenfoot.*;

/**
 * Es la clase padre de todos los enemigos la cual hereda clases para que las subclases los puedan usar o sobreescribir.
 * 
 * 
 */
abstract class Enemigo extends Actor
{
    protected Scooby scooby;
    protected Fantasma fantasma;
    private Jugador jugador;
   
    public Enemigo()
    {
        
    }
    
    public void act() 
    {
        
    }  
    
    /**
     * checa si el obeto sobrepasa los limites del mundo.
     */
    public boolean checa(int unaDireccion, String unaFoto)
    {
        boolean c = false;
        int aux;
        Jugar m = new Jugar(0);
        GreenfootImage i = new GreenfootImage(unaFoto);
        aux = i.getWidth()/2;
        
       if(unaDireccion == 1)
       {
           if(getX()+aux<m.getWidth() && getY()+aux<m.getHeight())
                 c = true;
           else
                 c = false;
       }
       
       if(unaDireccion == 2)
       {
           if(getX()-aux>0  && getY()+aux<m.getHeight())
                c = true;
           else
                c=false;
           }
            
        return c;
    }
    
    /**
     * Inicializa el objeto de la clase Scooby
     */
    protected void inicializaS(int numeroObjeto)
    {
        if(scooby==null)
        {
            if(!this.getWorld().getObjects(Scooby.class).isEmpty())
            {
                scooby=(Scooby)this.getWorld().getObjects(Scooby.class).get(numeroObjeto);
            }
        }
    }
    
     /**
      * Inicializa el objeto fantasna que se encuentra en el mundo para que esta pueda tener control sobre él.
      */
    protected void inicializaF(int numeroObjeto)
    {
        if(fantasma==null)
        {
            if(!this.getWorld().getObjects(Fantasma.class).isEmpty())
            {
                fantasma=(Fantasma)this.getWorld().getObjects(Fantasma.class).get(numeroObjeto);
            }
        }
    }
    
    /**
     * Método abstracto usado para el movimiento de las subclses de la clase enmigo.
     */
    abstract void muevete();
    
    /**
     * Es llamada para llamar al mundo final e indicar que el juego ha acabado.
     */
    public void cambiaMundo(World w)
    {
        Greenfoot.setWorld(new Final(1));
    }
    
}
