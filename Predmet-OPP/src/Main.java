import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Predmet!");
        Krug krug = new Krug();
        krug.setR(10);
        krug.povrsina();  //koristimo metodu povrsina gde moramo da koristimo ser r

        krug.povrsina(10); //metoda gde u zagradama unesemo vrednost double r

        Kvadrat kvadrat = new Kvadrat();
        kvadrat.x = 11;
        kvadrat.povrsina();

        kvadrat.povrsina(10);

        Predmet krug1 = new Krug();
        krug1.povrsina();   //poziva povrsinu iz kruga

        Predmet predmet = new Predmet();
        predmet.povrsina();         //poziva onu opovrsinu iz predmeta

        Pravougaonik pravougaonik = new Pravougaonik();

        //kao ih sve staviti u niz:  // polymorohyc array

        Predmet[] niz= {krug1, kvadrat, pravougaonik};

        List <Predmet> list = List.of(krug1,pravougaonik, kvadrat);  //lista isto lista pipova podataka Predmet





    }
}