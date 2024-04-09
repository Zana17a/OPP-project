import java.text.DecimalFormat;

public class Krug extends Predmet {

    private double r;               //samo nam treba za krug r-poluprecnik
    private final static double PI = Math.PI;    //final- ne menja se vise nigde u programu, constante su uglavnom static,

    //overloading - polimorfizam (dve metode u jednoj klasi imaju isto ime)
    public void povrsina(double r ){        //ovde nam trazi da unesemo r    //r = lokalna promenljiva
        double rezultat = Math.pow(r,2)*PI;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");            //zelim broj a dve decimale
        System.out.println("Krug " + decimalFormat.format(rezultat));
    }

    //run time polimorfizanm
    @Override
    public void povrsina(){             //iz pravljenja objekta mora da dobije vrednost r
        double rezultat = Math.pow(r,2)*PI;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");            //zelim broj a dve decimale
        System.out.println("Krug " + decimalFormat.format(rezultat));
    }

    // get i set zbog povrsina metode gde moramo da definisemo r
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}

