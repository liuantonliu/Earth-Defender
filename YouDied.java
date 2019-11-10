import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class YouDied here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouDied extends Text
{
    private Color white = Color.WHITE;
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Shield.score >= 100)
        {
            setImage (new GreenfootImage ("YOU DIED", 100, white, null));
        }
        else
        {
            setImage (new GreenfootImage ("YOU TRIED", 100, white, null));
        }
    }       
}
