import greenfoot.*;

public class Tierschuetzer extends Tier
{
    public Tierschuetzer() {
        setSpeed(1);
    }

    @Override
    public void lautMachen() {
        Greenfoot.playSound("police.mp3");
    }
}
