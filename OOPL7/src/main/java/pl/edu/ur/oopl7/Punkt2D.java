package pl.edu.ur.oopl7;
import java.util.Random;

public class Punkt2D {

    Random random = new Random();
    private int znaczenieX;
    private int znaczenieY;

    public Punkt2D(int znaczenieX, int znaczenieY) {
        this.znaczenieX = znaczenieX;
        this.znaczenieY = znaczenieY;
    }

    public Punkt2D() {
        this.znaczenieX = 0;
        this.znaczenieY = 0;
    }


    public void setZnaczenieX(int znaczenieX) {
        this.znaczenieX = znaczenieX;
    }

    public void setZnaczenieY(int znaczenieY) {
        this.znaczenieY = znaczenieY;
    }

    public int getZnaczenieX() {
        return znaczenieX;
    }

    public int getZnaczenieY() {
        return znaczenieY;
    }

    public void Losowanie()
    {
            this.znaczenieX = random.nextInt(21) - 10;
            this.znaczenieY= random.nextInt(21) - 10;
    }

    public int ran(){
                int x = random.nextInt(21)-10;
                return x;
            }

    public String toString(){
        System.out.println(this.znaczenieX);
        System.out.println(this.znaczenieY);

        return "This.X = "+this.znaczenieX+"     This.Y  = "+this.znaczenieY;
    }




}
