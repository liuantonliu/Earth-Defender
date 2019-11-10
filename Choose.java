import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class YouDied here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Choose extends Text
{
    private Color white = Color.WHITE;
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage (new GreenfootImage ("<------------------------- Choose a mode ------------------------->", 25, white, null));
    }       
}
