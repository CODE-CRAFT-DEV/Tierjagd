import greenfoot.*;

public class Spieler extends Actor
{
    int punkte;
    int leben;

    public Spieler() {
        punkte = 0;
        leben = 300;
    }

    public void act() {
        move();
        treffen();
        anzeigen();
        if(leben <= 0) {
            getWorld().showText("GAME OVER!" , 720/2, 600/2);
            Greenfoot.stop();
        }
    }    

    private void treffen() {
        if(isTouching(Wildschwein.class))
            getBeruehrung((Wildschwein) getOneIntersectingObject(Wildschwein.class));
        
        if(isTouching(Vogel.class))
            getBeruehrung((Vogel) getOneIntersectingObject(Vogel.class));
        
        if(isTouching(Rehe.class))
            getBeruehrung((Rehe) getOneIntersectingObject(Rehe.class));
        
        if(isTouching(Schlangen.class))
            getBeruehrung((Schlangen) getOneIntersectingObject(Schlangen.class));
        
        if(isTouching(Tierschuetzer.class))
            getBeruehrung((Tierschuetzer) getOneIntersectingObject(Tierschuetzer.class));
    }
    
    private void getBeruehrung(Tier tierObjekt) {
        tierObjekt.lautMachen();
        if (tierObjekt instanceof Tierschuetzer)
            leben--;
        else {
            punkte++;
            getWorld().removeObject(tierObjekt);
        }
    }
    
    public void move() {
        if(Greenfoot.isKeyDown("up"))
            setLocation(getX(), getY() - 2);
        if(Greenfoot.isKeyDown("right"))
            setLocation(getX() + 2, getY());
        if(Greenfoot.isKeyDown("down"))
            setLocation(getX(), getY() + 2);
        if(Greenfoot.isKeyDown("left"))
            setLocation(getX() - 2, getY());
    }

    private void anzeigen() {
        getWorld().showText("Punktestand: " + punkte , 110, 11);
        getWorld().showText("Leben: " + leben , 350, 11);
    }
}