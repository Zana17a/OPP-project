public abstract class Animal {
    //abstrakt - krovna klasa sablon za ostale sub klase, tipa Tiger klasa, Eagle klasa
    // abstraktka klasa ne moze da se instancira, ne moze da se napravi objekat abstraktne klase,
    // moze biti samo tip podatka, Animal animal = new Cat();
    protected  String animalSpecies;
    protected int age;
    protected String gender;
    protected double weight;

    public Animal(String animalSpecies, int age, String gender, double weight) {
        this.animalSpecies = animalSpecies;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    //metoda da bude implementirana u sve child klase, abstraktna metoda nema telo, i ne moze da si pravi u klasam koje nisu abstraktne
    abstract void move();

    void eat (){
        System.out.println("Eating....");
    }






}
