package my_project.model;


/**
 * Repräsentiert eine Kugel (einen Kreis), der in eine Schlange eingefügt werden soll. Dabei muss jeder QueueBall immer
 * seinen Vorgänger kennen, damit er zu ihm Abstand halten kann.
 */
public class Fahrzeug{

    private int rad;
    private int typ;
    private int ps;

    public Fahrzeug(){
        rad = (int) (Math.random()*3)+2;
        typ = (int) (Math.random()*999)+1;
        ps = (int) (Math.random()*170)+30;
    }

    public int getPs() {
        return ps;
    }

    public int getRad() {
        return rad;
    }

    public int getTyp() {
        return typ;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    /**
     * Selbsterklärend: zeichnet den QueueBall. Wird vom Framework automatisch aufgerufen (jede Frame 1x).
     */


}
