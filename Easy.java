import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Mode
{
    private Color white = Color.WHITE;
    private String msg = "Mouse";
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(mode == 0){
            setImage (new GreenfootImage (msg, 25, new Color(112,176,249), null));
            return;
        }
        if (Greenfoot.mouseClicked(this))
        {
            mode = 0;
            setImage (new GreenfootImage (msg, 30, white, null));
            Greenfoot.delay(5);
        }
        else
        {
            setImage (new GreenfootImage (msg, 25, white, null));
        }
    }      
}
