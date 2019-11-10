import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class RestartText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestartText extends Button
{
    private Color white = Color.WHITE;
    /**
     * Act - do whatever the RestartText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage (new GreenfootImage ("RESTART", 50, white, null));
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new EarthDefender());
        }
    } 
}
