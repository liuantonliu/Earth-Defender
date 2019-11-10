import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{

    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        if (Mode.mode == 0 || Mode.mode == 2)
        {
            Mode.mode = 0;
        }
        else
        {
            Mode.mode = 1;
        }
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Earth earth = new Earth();
        addObject(earth, 150, 150);
        Shield shield = new Shield();
        addObject(shield, 750, 150);
        AsterMed astermed = new AsterMed();
        addObject(astermed, 320, 440);
        AsterBig asterbig = new AsterBig();
        addObject(asterbig, 500, 440);
        AsterSmall astersmall = new AsterSmall();
        addObject(astersmall, 170, 440);
        Comet comet = new Comet();
        addObject(comet, 700, 440);
        InsObjects insobjects = new InsObjects();
        addObject(insobjects, 450, 550);
        InsShield insshield = new InsShield();
        addObject(insshield, 450, 300);
        BackToMenu backtomenu = new BackToMenu();
        addObject(backtomenu, 450, 100);
        BackText backtext = new BackText();
        addObject(backtext, 450, 200);
        InsShieldControl insshieldcontrol = new InsShieldControl();
        addObject(insshieldcontrol, 450, 340);
    }
}
