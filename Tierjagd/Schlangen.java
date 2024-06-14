import greenfoot.*;

public class Schlangen extends Tier
{   
    public Schlangen() {
        setSpeed(1);
    }

    @Override
    public void lautMachen() {
        Greenfoot.playSound("schlange.mp3");
    }
}
