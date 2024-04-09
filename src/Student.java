public class Student extends Person{
    //objekat ove klase, objekat Student moze a nasledi sve iz klase Person
    //    String ime;
    //    String prezime;
    String indexNum;     //ovo sada vazi samo za ovu klasu,samo student ima index

    public Student(String ime, String prezime, String indexNum){
        super(ime, prezime);  // SUPER kljucna rec, pozivamo konstruktor iz Klase Person
        this.indexNum = indexNum;   //ovo samo dodli, zato sto treba samo studentu
    }
}
