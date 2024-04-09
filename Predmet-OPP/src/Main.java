public class Main {
    public static void main(String[] args) {

        System.out.println("Predmet!");
        Krug krug = new Krug();
        krug.setR(10);
        krug.povrsina();  //koristimo metodu povrsina gde moramo da koristimo ser r

        krug.povrsina(10); //metoda gde u zagradama unesemo vrednost double r

        Kvadrat kvadrat = new Kvadrat();
        kvadrat.povrsina();
        kvadrat.povrsina(10);



    }
}