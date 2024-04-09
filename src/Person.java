public class Person {

    //modifikatori pristupa:
    //pubilc - vidljiva u celom projektu, svim paketima u src-u (souce-src))
    //protected - vidi se u glavnoj klasi i u svim chiled klasama, pa u Main moze objekat iz child klase da koristi
    //private - vidljivo u okviru kalse gde je i napravljeno
    //default - u okviru paketa variable, konstruktori i metode

    private String ime;         //zajedinicko za studenta i profesora //private ne mogu da koristim u Main metodi student.ime ne radi, ali moze preko GET i SET
    public String prezime;     //zajedinicko za studenta i profesora

    protected Person() {};

    public Person(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;}

    void ispis() {
        System.out.println("Ime:" + ime +" "+ "Prezime: " + prezime);

        }

    public String getIme() {            //get, za private ime varijablu
        return ime;
    }

    public void setIme(String ime) {         //set, za private ime varijablu, ova je void ne vraca vrednost
        this.ime = ime;
    }

}

