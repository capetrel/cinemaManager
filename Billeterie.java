package SalleCinema;

/**
 * Created by capetrel on 26/04/2016.
 */
public class Billeterie {


    public static void main(String[] args){

        /**
         * Il faut indiquer le nombre total de salle du cinéma
         * (à ne faire qu'une seul fois sauf si on casse le batiment tous les jours)
         * */

        int nbsalles = Saisie.saisirplace("Veuillez saisir le nombre de salles."); // definie la taille du tableau
        SalleCinoche[] salles = new SalleCinoche[nbsalles];

        /**
         * On rentre les info des salles
         * Le numero de la salle correspond à l'index du tableau
         * titre du film
         * @param titre
         * nombre total de place dans la salle
         * (on suppose qu'il peu y avoir des réservations)
         * @param totalplace
         * tarif normal d'une place
         * @param prixPlace
         * */

        // Pour chaque index du tableau on rentre un objet SalleCinoche avec les paramatres.

        for(int i = 0; i < nbsalles; i++ ) {
            String titre = Saisie.saisirLine("Veillez saisir le titre du film.");
            int totalPlace = Saisie.saisirplace("Veuillez entrer le nombre total de place dans la salle.");
            double prixPlace = Saisie.saisirPrix("Veuillez indiquer le tarif de base d'une place.");
            salles[i] = new SalleCinoche(titre, totalPlace, prixPlace);
        }

        /**
         * On ouvre le guichet et on commence la saisie
         * l'opérateur rentre le numéro de la salle
         * le programme affiche les attributs de la salle
         * */

        boolean venteTermine = false;
        while (venteTermine == false) {
            int numSalleBillet = Saisie.saisirplace("Veuillez entrez le numéro de la salle");
            if(numSalleBillet >= 0 && numSalleBillet < salles.length)   {
                SalleCinoche laSalle = salles[numSalleBillet];
               System.out.println(laSalle);
               int nbPlaceClient = Saisie.saisirplace("Combien places à vendre?");
               boolean PlaceReduit = Saisie.saisirReduction("Tapé true pour reduction, sinon false");
               //Calcule du montant total normal + réduit
               laSalle.vendrePlace(nbPlaceClient, PlaceReduit);
           }else{
               System.out.println("le numéro de salle ne correspond pas.");
           }
            //Continuer la vente ? oui/non
            boolean suiteVente = Saisie.saisirReduction("Voulez vous continuer la vente ? Tapez true pour oui ou false pour non");
            if( suiteVente == true){
                venteTermine = false;
            }else {
                venteTermine = true;
            }
        }

        double cumulca = 0;
        for (int j = 0; j < salles.length; j++){
            cumulca = cumulca + salles[j].chiffreAffaire();
        }
        System.out.println(cumulca);

        double cumulTauxRemplis = 0;
        for (int k = 0; k < salles.length; k++){
            cumulTauxRemplis = cumulTauxRemplis + salles[k].tauxremplissage();

        }
        System.out.println(cumulca);


        /**
         * Le guichetier fournit au programme le nombre de places que désire le client
         * on demande les reduc
         * si la demande peut etre satifaite on affiche le prix à payer
         * sinon il y a un problème
         * l'opérateur poursuit il la vente?
         * */

        /**
         * à la fin pour chaque salles
         * le programme affiche :
         * son taux d'occupation
         * le C.A. produit (prix reduit + prix normale)
         * */
    }
}
