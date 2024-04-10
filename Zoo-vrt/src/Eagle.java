public class Eagle extends Bird{
    public Eagle(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }
    // ne nudi po defaultu implementaciju ove metode kao kod Bird klase, ali posto nasledjuje Eagle--> Bird klasu mi mozemo sami da Override-ujemo
    @Override
    void move(){
        System.out.println("Flapping wings eagle...");
    }
}

//eagle vidi interfejs zato sto je njegova nad klasa Bird