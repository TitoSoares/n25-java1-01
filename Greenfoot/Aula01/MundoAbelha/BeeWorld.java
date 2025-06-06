import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da Classe BeeWorld.
 * 
 * @author Kristopher
 * @version 2025-06-04
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,32,33);
        Abelha abelha = new Abelha();
        addObject(abelha,45,152);
        Mosca mosca = new Mosca();
        addObject(mosca,398,141);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,80,270);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,196,274);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,271,262);
        mosca.setLocation(47,373);
        mosca2.setLocation(38,264);
        mosca3.setLocation(91,320);
        mosca4.setLocation(100,256);
        mosca3.setLocation(636,107);
        mosca4.setLocation(515,449);
        mosca.setLocation(240,332);
        mosca2.setLocation(236,103);
        aranha.setLocation(412,103);
        abelha.setLocation(107,515);
    }
}
