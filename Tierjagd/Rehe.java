import greenfoot.*;

public class Rehe extends Tier
{ 
    public Rehe() {
        setSpeed(1);
    }
    
    @Override
    public void lautMachen() {
        Greenfoot.playSound("reh.mp3");
    }
}
