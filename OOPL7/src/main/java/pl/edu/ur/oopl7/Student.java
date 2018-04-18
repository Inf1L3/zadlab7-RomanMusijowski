package pl.edu.ur.oopl7;

public class Student extends Osoba{
    private int nrIndeksu;
    private String typStudiuw;
    private String kierunek;
    private int rokStudiuw;

    public Student(String imie, String nazwisko, int dataurodzenia, String plec, int nrIndeksu, String typStudiuw, String kierunek, int rokStudiuw) {
        super(imie, nazwisko, dataurodzenia, plec);
        this.nrIndeksu = nrIndeksu;
        this.typStudiuw = typStudiuw;
        this.kierunek = kierunek;
        this.rokStudiuw = rokStudiuw;
    }


    public void dane(){
        System.out.println(this.nrIndeksu);
        System.out.println(this.typStudiuw);
        System.out.println(this.kierunek);
        System.out.println(this.rokStudiuw);
    }

}
