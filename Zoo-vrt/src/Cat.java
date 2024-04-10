public class Cat extends Animal {

    public Cat(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }

    @Override       //kad napravimo abstraktnu metodu u abstraktnoj klasi, ovde ponudi da je imlementiramo override-uje kao obicnu metodu i mozemo da dodamo telo
    void move() {
        System.out.println("Waiving tail...");
    }



}
