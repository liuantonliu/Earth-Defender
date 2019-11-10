import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScore extends Text
{
    private Color white = Color.WHITE;
    private static int high = 0;

    public static int high()
    {
        if (Shield.score > high)
        {
            high = Shield.score;
        }
        return high;
    }

    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage (new GreenfootImage ("High Score: " + high(), 25, white, null));
    }      
}
