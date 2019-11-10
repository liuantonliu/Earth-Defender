import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceInvaders here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EarthDefender extends World
{
    private double randomY1;
    private double randomX1;
    private int delayRandom;
    private int spawn;
    /**
     * Constructor for objects of class SpaceInvaders.
     * 
     */
    public EarthDefender()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1, false); 
        prepare();
        Shield.score = 0;
    }

    public void act()
    {
        spawn();
    }
    
    private void spawn()
    {
        spawn = Greenfoot.getRandomNumber(5);
        delayRandom = Greenfoot.getRandomNumber(9996);
        randomY1 = Greenfoot.getRandomNumber(580);
        randomX1 = Greenfoot.getRandomNumber(880);
        AsterSmall aS = new AsterSmall();
        AsterMed aM = new AsterMed();
        AsterBig aB = new AsterBig();
        Comet c = new Comet();
        if (delayRandom % 100 == 0)
        {
            if (spawn == 1)
            {
                addObject(aS, 1000, (int)randomY1+10);
            }
            else if (spawn == 2)
            {
                addObject(aS, 0, (int)randomY1+10);
            }
            else if (spawn == 3)
            {
                addObject(aS,(int)randomY1+10, 600);
            }
            else if (spawn == 4)
            {
                addObject(aS, (int)randomY1+10, 0);
            }
        }
        else if (delayRandom % 400 == 1)
        {
            if (spawn == 1)
            {
                addObject(aM, 1000, (int)randomY1+10);
            }
            else if (spawn == 2)
            {
                addObject(aM, 0, (int)randomY1+10);
            }
            else if (spawn == 3)
            {
                addObject(aM,(int)randomY1+10, 600);
            }
            else if (spawn == 4)
            {
                addObject(aM, (int)randomY1+10, 0);
            }
        }
        else if (delayRandom % 1000 == 3)
        {
            if (spawn == 1)
            {
                addObject(aB, 1000, (int)randomY1+10);
            }
            else if (spawn == 2)
            {
                addObject(aB, 0, (int)randomY1+10);
            }
            else if (spawn == 3)
            {
                addObject(aB,(int)randomY1+10, 600);
            }
            else if (spawn == 4)
            {
                addObject(aB, (int)randomY1+10, 0);
            }
        }
        else if (delayRandom == 9995)
        {
            if (spawn == 1)
            {
                addObject(c, 1000, (int)randomY1+10);
            }
            else if (spawn == 2)
            {
                addObject(c, 0, (int)randomY1+10);
            }
            else if (spawn == 3)
            {
                addObject(c,(int)randomY1+10, 600);
            }
            else if (spawn == 4)
            {
                addObject(c, (int)randomY1+10, 0);
            }
        }
    }
    private void prepare()
    {
        Earth earth = new Earth();
        addObject(earth, 450, 300);
        Shield shield = new Shield();
        addObject(shield, 450, 300);
        Score score = new Score();
        addObject(score, 60, 25);
    }
}
