import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Tier extends Actor {
    private int speed;

    public Tier() {
        setSpeed(1);
    }

    public void act() {
        move();
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public void move() {
        int zufallszahl = Greenfoot.getRandomNumber(100);
        if(zufallszahl == 0) 
            setRotation(getRotation() + Greenfoot.getRandomNumber(180));
        move(speed);        
    }

    public abstract void lautMachen();
}
