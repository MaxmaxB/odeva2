/**
 * Created by Antho on 14/11/16.
 */

/**********************************************************************
 ****************l'interface Certificat*********************************
 Un certificat est associé à un problème.
 la taille d'un certificat doit être bornée polynomialement par rapport au problème
 **********************************************************************/

public interface Certificat {
 /*retournera vrai SSi le certificat est bien correct pour le pb auquel il est associé - l'algorithme A du cours  */

    public boolean estCorrect();

    //pour pouvoir enumérer les certificats, on définit un ordre sur les certificats
    //le certificat passe au suivant dans l'ordre choisi
    public void suivant();
    //le certificat est le dernier dans l'ordre choisi
    public boolean estDernier();

    //le certificat prend une valeur alétaoire
    public void alea();

    public void affiche();
}

