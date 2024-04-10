public class Main_Zoo {

    public static void moveAnimals(Animal animal) {   //poxivom ove metode samo upisemo u () objekat koji hocemo: cat, tiger, koje smo napravili ispod
        animal.move();

    }

    public static void main(String[] args) {
        System.out.println("Zoo vrt!");

//        Animal animal = new Animal();  ovo ne moze, abstraktka klasa ne moze da se instancira, ne moze da se napravi objekat abstraktne klase

        Animal cat = new Cat("Lion", 15, "M", 100.00);      //ovo moze, i ovako zove posle metodu "move" iz Cat klase
        Animal bird = new Bird("Hawk", 15, "M", 50.00);
        Tiger tiger = new Tiger("Bengal", 15, "M", 200.00);
        Bird eagle = new Bird("neki eagle", 15, "F", 15.00);
        Eagle eagle1 = new Eagle("neki eagle", 5, "F", 5.00);


        eagle.move();  //posto nema svoju metodu move, uzima onu iz Bird // ovaj objekat iz klase Bird
        eagle1.move();  // ovaj eagle1 objekat iz klase Eagle

        tiger.move();  //move je prazan u lasi Tiger pa nista ne ispisuje

        moveAnimals(bird);

        Animal[] animals = {cat, bird, tiger};
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
//       cat.move();   //for petlja
//       bird.move();
//       tiger.move();

        moveAnimals1(animals);  //sada nudi dve metode, dali da ubacim niz ili jednu zivotinju
    }

    //        moveAnimals(); kako sa ovom metodom da ispisemo ovaj ispis kao za for
    public static void moveAnimals1(Animal[] animals) {          //ovo napravljeni gore kao i moveAnimal samo ovde da vidim lepse
        for (int i = 0; i < animals.length; i++) { animals[i].move();}
    }



}