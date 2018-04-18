package pl.edu.ur.oopl7;

public class Wykladowca extends Osoba{
    private int ilosc_lat_w_pracy;
    private int szacunek;
    private int ilosc_pracy_tydzien;

    public Wykladowca(String imie, String nazwisko, int dataurodzenia, String plec, int ilosc_lat_w_pracy, int szacunek, int ilosc_pracy_tydzien) {
        super(imie, nazwisko, dataurodzenia, plec);
        this.ilosc_lat_w_pracy = ilosc_lat_w_pracy;
        this.szacunek= szacunek;
        this.ilosc_pracy_tydzien = ilosc_pracy_tydzien;
    }

    public void dane(){
        System.out.println(this.ilosc_lat_w_pracy);
        System.out.println(this.ilosc_pracy_tydzien);
        System.out.println(this.szacunek);
    }

}
