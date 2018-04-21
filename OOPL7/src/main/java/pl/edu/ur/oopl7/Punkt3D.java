package pl.edu.ur.oopl7;

public class Punkt3D extends Punkt2D {

    private int znaczenieZ;

    public Punkt3D(int znaczenieX, int znaczenieY, int znaczenieZ)
    {
        super(znaczenieX, znaczenieY);
        this.setZnaczenieX(znaczenieX);
        this.setZnaczenieY(znaczenieY);
        this.znaczenieZ = znaczenieZ;
    }

    public Punkt3D()
    {
        this.setZnaczenieX(0);
        this.setZnaczenieY(0);
        this.znaczenieZ = 0;
    }


    public void Losowanie()
    {
        super.Losowanie();
        this.znaczenieZ = random.nextInt(21) - 10;
    }


    public String toString()
    {
        System.out.println(this.znaczenieZ);
        return super.toString() + "    this.Z = " + this.znaczenieZ;
    }
}
