import greenfoot.*;

/**
 * Se encarga de validar cuando se tiene que cambiar de nivel.
 * 
 * 
 */
public class Scoobygalletas extends Actor
{
    private World m2;
    private World m;
    private Jugar j;
    private Jugador jugador;
    private Records records;
    private int ni;
    private int rec=0;
    public Scoobygalletas(int n,Jugador jug,Records rec)
    {
        m2=getWorld();
        m=getWorld();
        jugador = jug;
        records = rec;
        ni = n;
       
       
    }
    
    /**
     * Act - do whatever the scoobygalletas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Scooby.class))
        {
           rec = rec +20;
           records.guardaRecords(rec);
           jugador.setScore(1000);
            cambiaMundo(m2);
            removeTouching(Scooby.class);
        }   
    }
    
    /**
     * Si es tocada por un objeto de la clase Scooby se encaraga de cambiar el nivel del juego.
     */
     public void cambiaMundo(World w)
    {
        int e=ni;
        if(e==4){
            
            j=(Jugar)this.getWorld();
            j.adiosMusica();
            w= new Final(0);
            Greenfoot.setWorld(w);}
        else
        {
            w= new Jugar(e);
            Greenfoot.setWorld(w);
        }
    }   
}
    
    

