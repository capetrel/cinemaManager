package SalleCinema;

/**
 * Created by capetrel on 26/04/2016.
 */
public class TestSalleCinema {
    public static void main(String[] args){
        SalleCinoche salle1;
        salle1 = new SalleCinoche("Seul sur Mars 3D", 120, 8.5);
        salle1.vendrePlace(4, true);
        System.out.println(salle1);


        SalleCinoche salle2;
        salle2 = new SalleCinoche("007", 70, 8.5);
        salle1.vendrePlace(2, false);
        System.out.println(salle2);

        //SalleCinoche remiseAZero;

    }
}
