import greenfoot.*;

public class Wald extends World
{
    public Wald() {    
        super(720, 600, 1); 
        Greenfoot.setSpeed(50);
        addObject(new Spieler(), getWidth()/2, getHeight()/2);
    }

    public void act() {
        erzeugeObjekte();
    }

    private int randX() {
        return Greenfoot.getRandomNumber(getWidth());
    }

    private int randY() {
        return Greenfoot.getRandomNumber(getHeight());
    }

    private void erzeugeObjekte() {
        int zufall;
        zufall = Greenfoot.getRandomNumber(400);
        if(zufall == 0)
            addObject(new Vogel(), randX(), randY());
        zufall = Greenfoot.getRandomNumber(400);
        if(zufall == 0)
            addObject(new Wildschwein(), randX(), randY());
        zufall = Greenfoot.getRandomNumber(200);
        if(zufall == 0)
            addObject(new Tierschuetzer(), randX(), randY());
        zufall = Greenfoot.getRandomNumber(300);
        if(zufall == 0)
            addObject(new Rehe(), randX(), randY());
        zufall = Greenfoot.getRandomNumber(250);
        if(zufall == 0)
            addObject(new Schlangen(), randX(), randY());
    }
}
