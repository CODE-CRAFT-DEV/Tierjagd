import greenfoot.*;

public class Wildschwein extends Tier
{  
    public Wildschwein() {
        setSpeed(1);
    }

    @Override
    public void lautMachen() {
        Greenfoot.playSound("wildschwein.mp3");
    }
}
