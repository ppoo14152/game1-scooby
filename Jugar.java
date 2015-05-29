import greenfoot.*;
import java.util.*;
import java.awt.Color;


/**
 * Write a description of class Jugar here.
 * 
 * Maneja toda la logica del juego. Aquí se valida cuando se tiene que cambiar de nivel y se proyectan todos los objetos al mundo.
 */
public class Jugar extends World
{
    final int bosque=1;
    final int cementerio=2;
    final int ciudad=3;
    final int fin=4;
    public int d;
    private int n;
    private int nivel;
    private SimpleTimer timer;
    private int rango;
    private GreenfootSound musica;
    private int contadorG = 0;
    private int contadorL = 0;
    private Jugador j;
    private Records r;
   
    public Jugar(int escenario)
    {  
        super(996, 600, 1); 
        
        j = new Jugador();
        r = new Records();
        if(escenario==bosque)
        {
            musica=new GreenfootSound("Scooby.mp3");
            musica.playLoop();
            musica.setVolume(100);
            nivel = 2;
            Fantasma f1 = new Fantasma();
            Rayo r1 = new Rayo();
            Muro m1 = new Muro();
            d=1;
            setBackground("bosque.jpg");
            Letrero b=new Letrero("NIVEL 1",Color.RED);
            addObject(b,400,20);
            addObject(f1,400,100);
            addObject(r1,433,150);
            addObject(m1,966,534);
        }
        else if(escenario==cementerio)
        {
            nivel = 3;
            d=2;
            setBackground("Cementerio.jpg");
            Roca r1 = new Roca();
            Serpiente s1 = new Serpiente();
            Vampiro v1 = new Vampiro();
            Vampiro v2 = new Vampiro();
            Letrero c=new Letrero("NIVEL 2",Color.BLUE);
            addObject(s1,943,568);
            addObject(c,400,20);
            addObject(v1,100,100);
            addObject(v2,900,100);
            addObject(r1,450,50);
        }
        else if(escenario==ciudad)
        {
            nivel = 4;
            d=3;
            setBackground("ciudad.jpg");
            Arbol a1 = new Arbol();
            Letrero ci=new Letrero("NIVEL 3",Color.GREEN);
            Vampiro v1 = new Vampiro();
            Serpiente s1 = new Serpiente();
            Fantasma f1 = new Fantasma();
            Rayo r1 = new Rayo();
            addObject(s1,943,568);
            addObject(ci,400,20);
            addObject(f1,400,100);
            addObject(v1,200,100);
            addObject(r1,433,150);
            addObject(a1,750,523);
        }
       
        n=1;
        Scooby s1=new Scooby();
        Nube n1=new Nube();
        
        addObject(s1,300,532);
        addObject(n1,52,418);
        timer=new SimpleTimer();
        rango=Greenfoot.getRandomNumber(351)+50;
       
  }
  
  /**
   * Todos los objetos entran en acción.
   */
  public void act()
  {
      apareceGalleta();
  }
  
  /**
   * Aparece la ScoobyGalleta en un tiempo determinado.
   */
  public void apareceGalleta()
  {
      Scoobygalletas sg = new Scoobygalletas(nivel,j,r);
      contadorG++;
      if(contadorG==100)
        {
                addObject(sg,900,550);
                
        }
  }
  
  /**
   * Silencia musica 
   */
  public void adiosMusica()
  {
      musica.stop();
  }
    
  
    
}