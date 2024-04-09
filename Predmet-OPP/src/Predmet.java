public class Predmet {
        protected double x;
        protected double y;

        protected void povrsina(){
            System.out.println("Povrsina predmeta");
        }

    @Override                       //metoda toString dolazi iz nad klase mama klase Object
    public String toString() {
        return "Predmet{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


