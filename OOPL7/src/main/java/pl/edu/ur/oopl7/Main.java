package pl.edu.ur.oopl7;

public class Main {
    public static void main(String[] args) {


        //Zadanie 1

//        Osoba roma = new Student("Roman","musij",1998,"M",1111,"Denny","informatyka",1);
//        roma.dane();
//
//        System.out.println();
//
//        Osoba czlowiek = new Osoba("Roma","Musij", 1998,"M");
//        czlowiek.dane();
//
//        System.out.println();
//
//        Osoba ticzer = new Wykladowca("imie ","Nazw",1900,"M",3,9,3);
//        ticzer.dane();


        //Zadanie 2

        Punkt2D kropka = new Punkt2D(4,2);

        kropka.toString();

        System.out.println();

        Punkt3D kropka3D = new Punkt3D(1,4,8);

        kropka3D.toString();


        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];


        for (int i =0;i<100;i++){

            array2D[i] = new Punkt2D(kropka.ran(),kropka.ran());
        }

        for (int j = 0; j<100;j++){
            array3D[j] = new Punkt3D(kropka.ran(),kropka.ran(),kropka.ran());
        }

        for (int i =0;i<100;i++){
            int x = array2D[i].getZnaczenieX();
            int y = array2D[i].getZnaczenieY();
            for (int j = 0 ;j<100;j++) {
                int xj = array3D[j].getZnaczenieX();
                int yj = array3D[j].getZnaczenieY();
                if (x == xj && y == yj) {
                    System.out.println();
                    System.out.println("te punkty maja takie same wspolrzedne");
                    System.out.println("2D ["+i+"] : "+array2D[i].toString());
                    System.out.println("3D ["+i+"] : "+array3D[j].toString());
                }
            }
        }





    }
}
