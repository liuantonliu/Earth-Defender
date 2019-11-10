import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asterSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AsterSmall extends Collisions
{
    /**
     * Act - do whatever the asterSmall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (EarthDefender.class.isInstance(getWorld()))
        {
            turnTowards(450, 300);
            move((Shield.score/300.0)+2);
        }
        else if(Instructions.class.isInstance(getWorld()))
        {
            turn(2);
        }
        else if (Menu.class.isInstance(getWorld()))
        {
            setLocation(getX() + 2, getY());
        }  
    }
}
