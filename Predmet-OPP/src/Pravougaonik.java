public class Pravougaonik extends Predmet {

    @Override
    public void povrsina() {
        super.povrsina();
        System.out.println("Pravougaonik " + (x * y));
    }
}
