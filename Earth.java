import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earth extends Collisions
{
    /**
     * Act - do whatever the Earth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor AsterSmall = getOneIntersectingObject(AsterSmall.class);
        Actor AsterMed = getOneIntersectingObject(AsterMed.class);
        Actor AsterBig = getOneIntersectingObject(AsterBig.class);
        Actor Comet = getOneIntersectingObject(Comet.class);
        if (AsterSmall != null)
        {
            if (isVisuallyIntersecting(AsterSmall))
            {
                getWorld().removeObject(AsterSmall);
                Greenfoot.setWorld(new Death());
            }
        }
        if (AsterMed != null)
        {
            if (isVisuallyIntersecting(AsterMed))
            {
                getWorld().removeObject(AsterMed);
                Greenfoot.setWorld(new Death());
            }
        }
        if (AsterBig != null)
        {
            if (isVisuallyIntersecting(AsterBig))
            {
                getWorld().removeObject(AsterBig);
                Greenfoot.setWorld(new Death());
            }
        }
        if (Comet != null)
        {
            if (isVisuallyIntersecting(Comet))
            {
                getWorld().removeObject(Comet);
                Greenfoot.setWorld(new Death());                
            }
        }
    }    
}
