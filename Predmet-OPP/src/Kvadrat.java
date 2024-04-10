public class Kvadrat extends Predmet{


    @Override
    public void povrsina(){
        super.povrsina();       //povuce iz nad klase metodu povrsina a to je ov linija: "Povrsina predmeta" i onda dodam ovu liniju ispod
        System.out.println("Kvadrat " + Math.pow(x,2));     //Math klasa - ugradjena klasa u javi, pow x^2

    }

    public void povrsina(double x){
        System.out.println("Kvadrat " + Math.pow(x,2));     //Math klasa, pow x^2
    }

}
