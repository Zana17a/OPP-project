public class Bird extends Animal implements Flyable{   //implementiran interface, i odmah trazi dole metodu iz interfejsa, mogu telo da menjam
    public Bird(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }

    @Override
    void move() {
        System.out.println("Flapping wings....");

    }

    @Override
    public void fly() {
        System.out.println("Flying around...");

    }
}
