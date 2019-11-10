import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Death here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Death extends World
{
    GreenfootSound death = new GreenfootSound("death.mp3");
    /**
     * Constructor for objects of class Death.
     * 
     */
    public Death()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
        death.setVolume(100);
        death.play();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Explosion explosion = new Explosion();
        addObject(explosion, 450, 350);
        Restart restart = new Restart();
        addObject(restart, 100, 450);
        BackToMenu backtomenu = new BackToMenu();
        addObject(backtomenu, 800, 450);
        RestartText x = new RestartText();
        addObject(x, 120, 550);
        BackText y = new BackText();
        addObject(y, 730,550);
        YouDied z = new YouDied();
        addObject(z, 450, 100);
        Score s = new Score();
        addObject(s, 780, 150);
        HighScore.high();
        HighScore highscore = new HighScore();
        addObject(highscore, 150, 150);
    }
}
