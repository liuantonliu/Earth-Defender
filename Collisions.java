import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Collisions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collisions extends objects
{
    /**
     * Act - do whatever the Collisions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean isVisuallyIntersecting(Actor actor)  
    {  
        // get width and height of images  
        int wA = getImage().getWidth();  
        int hA = getImage().getHeight();
        int wB = actor.getImage().getWidth();  
        int hB = actor.getImage().getHeight();
        // get world coordinates of origin point (0, 0) of images  
        int xAw = getX()-wA/2;  
        int yAw = getY()-hA/2;  
        int xBw = actor.getX()-wB/2;  
        int yBw = actor.getY()-hB/2;  
        // determine (x, y) on each image to begin checking from  
        // and dimensions of area to check  
        int xA = 0, yA = 0, xB = 0, yB = 0; // initialize start coord fields  
        int w = 0, h = 0; // initialize scan dimension fields  
        // determine values for fields just initialized  
        if (xAw > xBw)  
        {  
            xB = xAw-xBw;  
            if (xAw+wA > xBw+wB) w = wB-xB; else w = wA;  
        }  
        else 
        {  
            xA = xBw-xAw;  
            if (xBw+wB > xAw+wA) w = wA-xA; else w = wB;  
        }  
        if (yAw > yBw)  
        {  
            yB = yAw-yBw;  
            if (yAw+hA > yBw+hB) h = hB-yB; else h = hA;  
        }  
        else 
        {  
            yA = yBw-yAw;  
            if (yBw+hB > yAw+hA) h = hA-yA; else h = hB;  
        }  
        // perform checking  
        java.awt.Color trans = new java.awt.Color(0, 0, 0, 0);
        GreenfootImage compare = new GreenfootImage(getImage());
        compare.rotate(getRotation());
        for (int x=0; x<w; x++) for (int y=0; y<h; y++)  
            {
                if (!trans.equals(compare.getColorAt(xA+x, yA+y)) &&  
                !trans.equals(actor.getImage().getColorAt(xB+x, yB+y))) 
                    return true;
        }
        return false;  
    }   
}
