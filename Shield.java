import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class shield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shield extends Collisions
{
    public static int score = 0;
    GreenfootSound blast1 = new GreenfootSound("blast1.mp3");
    /**
     * Act - do whatever the shield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        control();
        hit();        
    }
    public void control()
    {
        if(Mode.mode == 0 || Mode.mode == 3)
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(null != mouse)
            {
                turnTowards(mouse.getX(),mouse.getY());
            }
        }
        else if (Mode.mode == 1)
        {
            if(Greenfoot.isKeyDown("left"))
            {
                setRotation(getRotation()-10);
            }
            if(Greenfoot.isKeyDown("right"))
            {
                setRotation(getRotation()+10);
            }
        }
    }
    public void hit()
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
                score += 10;
                blast1.stop();
                blast1.setVolume(20);
                blast1.play();
            }
        }
        if (AsterMed != null)
        {
            if (isVisuallyIntersecting(AsterMed))
            {
                getWorld().removeObject(AsterMed);
                score += 20;
                blast1.stop();
                blast1.setVolume(30);
                blast1.play();
            }
        }
        if (AsterBig != null)
        {
            if (isVisuallyIntersecting(AsterBig))
            {
                getWorld().removeObject(AsterBig);
                score += 50;
                blast1.stop();
                blast1.setVolume(40);
                blast1.play();
            }
        }
        if (Comet != null)
        {
            if (isVisuallyIntersecting(Comet))
            {
                getWorld().removeObject(Comet);
                score += 100;
                blast1.stop();
                blast1.setVolume(50);
                blast1.play();
            }
        }
    }
}

