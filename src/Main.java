public class Main {
    public static void main(String[] args) {

        System.out.println("OPP-project");
        //nasledjivanje - child klasa nasledjuje metode, konstruktor (super-kljucna rec) i varijable iz mama klase (ime, prezime)
        //enkapsulacija -
        //apstrakcija -
        //polimorfizam -

        Student student = new Student("Pera", "Peric", "117");
//        student.ime = "Marko";          //ne moze da se koristi zato sto je u klasi Person ovo private
        student.setIme("Marko");        //ali moze metodom set ime
        System.out.println("Get-ovano ime: " + student.getIme());   //metodom get ime izimamo to ime i printamo //zbog set i get promenio ime Pera u Marko

        student.prezime = "Markovuc";   // prezime promenio u Markovic


        Profesor profesor = new Profesor("Mika","Mikic", "Java");
        student.ispis();    //objektom student pozivam ispis iz nad klase Person
        profesor.ispis();




    }
}