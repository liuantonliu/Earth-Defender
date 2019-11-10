import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asterMed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AsterMed extends Collisions
{
    private int rotation = 0;
        /**
     * Act - do whatever the asterMed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        rotation = Greenfoot.getRandomNumber(360);
        if (EarthDefender.class.isInstance(getWorld()))
        {
            turnTowards(450, 300);
            move((Shield.score/300.0)+3);
        }
        else if(Instructions.class.isInstance(getWorld()))
        {
            turn(3);
        }
        else if (Menu.class.isInstance(getWorld()))
        {
            setLocation(getX() + 3, getY());
        }  
    }    
}
