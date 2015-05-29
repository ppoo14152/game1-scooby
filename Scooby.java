import greenfoot.*;

/**
 * Write a description of class scooby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scooby extends Actor
{
    private int velocidad;
    private int salto;
    protected Nube nube;
    private int direccion;
    /**
     * Act - do whatever the Scooby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Scooby()
    {
        velocidad = 10;
        salto = 134;
        nube=null;
        direccion=0;
    }
    public void act() 
    {
       inicializaN(0);
       String tecla = Greenfoot.getKey();
       
        
       // setLocation(nube.getX(),nube.getY());
        if(tecla=="down")
        {
           baja();
        }
        
        if(tecla=="up")
            salta();
            
        
        
        if(tecla=="left")
        {
            if(checa(2) == true)
            {
                mueveIzquierda();
                direccion = 1;
            }
        }
        
        if(tecla=="right")
        {   
            if(checa(1) == true)
            {
                mueveDerecha();
                direccion = 2;
            }
        }
        
        pierdeVida();
        
        if(isTouching(Nube.class)==true)
        {
            if(checa(1) == true)
                setLocation(nube.getX(),nube.getY()-50);
            else
                baja();
          }
       
       
    }    
    
    /**
     * Mueve a la derecha a Scooby
     */
    public void mueveDerecha()
    {
        setImage("ScoobyD.png");
        move(velocidad);
    }
    
    /**
     * Mueve a la izquierda a Scooby
     */
    public void mueveIzquierda()
    {
        setImage("ScoobyI.png");
        move(-velocidad);
    }
    /**
     * Hace a Scooby bajar de la nube
     */
    public void baja()
    {
        setLocation(getX(),537);
    }
    
    /**
     * Hace brincar a Scooby 
     */
    public void salta()
    {  
       
        
              setLocation(getX(),getY()-salto);
             
              
            
        
    }
    
    /**
     * Checa que Scooby no sobrepase los limites del mundo
     */
    public boolean checa(int unaDireccion)
    {
        boolean c = false;
        int aux;
        Jugar m = new Jugar(0);
        GreenfootImage i = new GreenfootImage("ScoobyD.png");
        aux = i.getWidth()/2;
        
       if(unaDireccion == 1)
       {
           if(getX()+aux<m.getWidth())
                 c = true;
           else
                 c = false;
       }
       
       if(unaDireccion == 2)
       {
           if(getX()-aux>0)
                c = true;
           else
                c=false;
           }
            
        return c;
    }
    
    /**
     * Inicializa el objeto de la clase nube
     */
       protected void inicializaN(int numeroObjeto)
    {
        if(nube==null)
        {
            if(!this.getWorld().getObjects(Nube.class).isEmpty())
            {
                nube=(Nube)this.getWorld().getObjects(Nube.class).get(numeroObjeto);
            }
        }
    }
    
    /**
     * Envía la dirección en la que va Scooby a las demás clases
     */
    public int getDir()
    {
        return direccion;
    }
    
    /**
     * Regresa falso o verdadero dependiendo si toca un objeto de la clase nube.
     */
    public boolean tocaNube()
    {
        return isTouching(Nube.class);
    }
    
    /**
     * Regresa falso o verdadero dependiendo si lo toca un objeto de las demás clases.
     */
     public void pierdeVida()
    {
       if(isTouching(Rayo.class))
           Greenfoot.setWorld(new Final(1));
       
    }
}
