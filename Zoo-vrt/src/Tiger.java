public class Tiger extends Cat{
    public Tiger(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }
    // ne nudi po defaultu implementaciju ove metode kao kod Cat klase, ali posto nasledjuje Tiger -> Cat klasu mi mozemo sami da Override-ujemo
    @Override
    void move (){

    }


}
