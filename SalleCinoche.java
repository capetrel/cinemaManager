package SalleCinema;

/**
 * Created by capetrel on 26/04/2016.
 */
public class SalleCinoche {

    private String titreFilm;
    private int nbplaces;
    private double prixNormalPlace;
    private int placeVenduenormal;
    private int placeVendueReduit;

    public SalleCinoche(String titreFilm, int nbplaces, double prixNormalPlace) {
        this.titreFilm = titreFilm;
        this.nbplaces = nbplaces;
        this.prixNormalPlace = prixNormalPlace;
        placeVenduenormal = 0;
        placeVendueReduit = 0;
    }

    /**
     * Calcule des places restantes
     * */
    public int nbPlaceDispo (){
        return nbplaces - (placeVenduenormal+placeVendueReduit);
    }

    /**
     * affiche le prix des places en fonction de la réduction.
     * incrémente le nombre de place en fonction du tarif.
     * */
    public void vendrePlace (int nombre, boolean tarifReduit){
        if(nbPlaceDispo() >= nombre){
            if(tarifReduit) {
                placeVendueReduit += nombre;
                System.out.println("Le prix est : "+ (prixNormalPlace * 0.8) * nombre +" €");
            }else {
                placeVenduenormal += nombre;
                System.out.println("Le prix est :" + prixNormalPlace * nombre + " €");
            }
        }else{
            System.out.println("La salle est pleine !");
        }
    }

    public void remiseAZero(){
        placeVenduenormal = 0;
        placeVendueReduit = 0;
    }
    /**
     * calcul du chiffre d'affaire totale en fonction de la réduction.
     * */
    public double chiffreAffaire(){
        double caReduit = (placeVendueReduit * prixNormalPlace) * 0.8;
        double caNormal = placeVenduenormal * prixNormalPlace;
        return caNormal+caReduit;
    }

    public double tauxremplissage (){
        return ((placeVendueReduit+placeVenduenormal)/nbplaces) * 100.0;
    }

    @Override
    public String toString() {
        return "Film joué : "+ titreFilm + " \n" +
                "Nombre de places dans la salle : "+ nbplaces + " \n" +
                "Prix d'une place : "+ prixNormalPlace + " €\n" +
                placeVenduenormal + " places vendues au tarif normal \n" +
                placeVendueReduit + " places vendues au tarif réduit \n";
    }

    public String getTitreFilm() {
        return titreFilm;
    }

    public int getNbplaces() {
        return nbplaces;
    }

    public double getPrixNormalPlace() {
        return prixNormalPlace;
    }

    public int getPlaceVenduenormal() {
        return placeVenduenormal;
    }

    public int getPlaceVendueReduit() {
        return placeVendueReduit;
    }



}
