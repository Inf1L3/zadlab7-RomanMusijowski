package pl.edu.ur.oopl7;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int dataurodzenia;
    private String plec;


    public Osoba(String imie, String nazwisko, int dataurodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataurodzenia = dataurodzenia;
        this.plec = plec;
    }



    public void dane(){
        System.out.println(this.imie);
        System.out.println(this.nazwisko);
        System.out.println(this.dataurodzenia);
        System.out.println(this.plec);
    }
}
