public class Kvadrat extends Predmet{


    @Override
    public void povrsina(){
        super.povrsina();
        System.out.println("Kvadrat " + Math.pow(x,2));     //Math klasa, pow x^2

    }

    public void povrsina(double x){
        System.out.println("Kvadrat " + Math.pow(x,2));     //Math klasa, pow x^2
    }

}
