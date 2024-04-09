public class Profesor extends Person{
    //objekat ove klase, objekat Profesor moze a nasledi sve iz klase Person
//    String ime;
//    String prezime;
    String predmet;     //tipa koji predmet profesor predaje, samo njegova promenljiva

    public Profesor(String ime, String prezime, String matematika) {
        super(ime, prezime);    // SUPER kljucna rec, pozivamo konstruktor iz Klase Person
        this.predmet = predmet;
    }


}


