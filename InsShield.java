import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class InsShield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsShield extends Text
{
    private Color white = Color.WHITE;
    /**
     * Act - do whatever the RestartText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage (new GreenfootImage ("Control your shield to block the projectiles to protect Earth!", 30, white, null));
    }     
}
