import greenfoot.*;

public class Vogel extends Tier
{  
    public Vogel() {
        setSpeed(2);
    }

    @Override
    public void lautMachen() {
        Greenfoot.playSound("vogel.mp3");
    }
}
