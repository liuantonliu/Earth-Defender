import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private int delay = 0;
    private int random = 0;
    private int rotation = 0;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1, false); 
        Mode.mode = 2;
        prepare();
    }

    public void act()
    {
        move();
        setPaintOrder(Title.class, Start.class, InsButton.class, Hard.class, Easy.class, Choose.class, Comet.class, AsterSmall.class, AsterMed.class, AsterBig.class);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Title title = new Title();
        addObject(title, 450, 150);
        Start start = new Start();
        addObject(start, 450, 420);
        InsButton insbutton = new InsButton();
        addObject(insbutton, 450, 550);
        Hard hard = new Hard();
        addObject(hard, 750, 320);
        Easy easy = new Easy();
        addObject(easy, 150, 320);
        Choose choose = new Choose();
        addObject(choose, 450, 320);
    }

    private void move()
    {
        delay = Greenfoot.getRandomNumber(9996);
        random = Greenfoot.getRandomNumber(600);
        rotation = Greenfoot.getRandomNumber(359);
        AsterSmall aS = new AsterSmall();
        AsterMed aM = new AsterMed();
        AsterBig aB = new AsterBig();
        Comet c = new Comet();
        if (delay % 100 == 0)
        {
            addObject(aS, 0, random);
            aS.setRotation(rotation);
        }
        else if (delay % 400 == 1)
        {
            addObject(aM, 0, random);
            aM.setRotation(rotation);
        }
        else if (delay % 1000 == 3)
        {
            addObject(aB, 0, random);
            aB.setRotation(rotation);
        }
        else if (delay == 9995)
        {
            addObject(c, 0, random);
        }
    }
}
