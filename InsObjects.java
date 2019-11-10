import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class BackText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsObjects extends Text
{
    private Color white = Color.WHITE;
    /**
     * Act - do whatever the RestartText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage (new GreenfootImage ("10 points     20 points      50 points     100 points", 45, white, null));
    }      
}
