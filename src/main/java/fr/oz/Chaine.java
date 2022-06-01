package fr.oz;

import javax.swing.JOptionPane;

public class Chaine {
    Maillon debutListe = null;
    Maillon finListe = null;

    public void setDebutListe(Maillon debutListe) {
        this.debutListe = debutListe;
    }

    public void setFinListe(Maillon finListe) {
        this.finListe = finListe;
    }

    void ajouterMaillon(String valeur) {
        Maillon maillonActuel = this.debutListe; // commence au début de la liste
        Maillon nouveauMaillon = new Maillon(valeur); // création du nouveau maillon
        if (maillonActuel == null) { // vérifie si le maillon existe
            this.debutListe = nouveauMaillon; // sinon
            nouveauMaillon.setMaillonPrecedent(null);
        } else {
            Maillon maillonCourant = debutListe; // commence au premier maillon
            while (maillonCourant.getMaillonSuivant() != null) { // tant qu'il existe un maillon suivant
                maillonCourant = maillonCourant.getMaillonSuivant(); // le maillon courant devient le maillon Suivant
            }
            maillonCourant.setMaillonSuivant(nouveauMaillon);// attribut la reference du maillon suivant (le nouveau
                                                             // maillon) au maillon courant
            nouveauMaillon.setMaillonPrecedent(maillonCourant);
            finListe = nouveauMaillon;

        }

    }

    String depiler() {
        Maillon maillonActuel = this.debutListe;// commence au beut de la chaine
        try {
            if (maillonActuel == null) {
                throw new IllegalArgumentException("Il n'y a rien ou plus rien à dépiler"); // test si chaine vide
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Il n'y a rien ou plus rien à dépiler");
        }

        while (maillonActuel.getMaillonSuivant().getMaillonSuivant() != null) {

            maillonActuel = maillonActuel.getMaillonSuivant();
        }
        String maillonEnleve = maillonActuel.getMaillonSuivant().getValeur();
        maillonActuel.setMaillonSuivant(null);
        return maillonEnleve;

    }

    void reinitialiser() {
        setDebutListe(null);

    }

    String afficherChaineRetour() {
        Maillon maillonActuelle = this.finListe;
        String affichage = " ";
        if (maillonActuelle == null) {
            JOptionPane.showMessageDialog(null, "Impossible d'afficher une pile vide", "Pile vide",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        Maillon maillonCourant = this.finListe;
        do {
            affichage = affichage + maillonCourant.getValeur() + " - ";
            maillonCourant = maillonCourant.maillonPrecedent;

        } while (maillonCourant != null);

        JOptionPane.showMessageDialog(null, "Voici le contenu de la pile : " + affichage, "Retour",
                JOptionPane.INFORMATION_MESSAGE);
        return affichage;
    }

    String afficherChaineAller() {
        Maillon maillonActuelle = this.debutListe;
        String affichage = "  ";
        if (maillonActuelle == null) {
            JOptionPane.showMessageDialog(null, "Impossible d'afficher une pile vide", "Pile vide",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        Maillon maillonCourant = this.debutListe;
        while (maillonCourant != null) {
            System.out.println(maillonCourant.getValeur());
            affichage = affichage + maillonCourant.getValeur() + " - ";
            maillonCourant = maillonCourant.maillonSuivant;

        }

        JOptionPane.showMessageDialog(null, "Voici le contenu de la pile : " + affichage, "Aller",
                JOptionPane.INFORMATION_MESSAGE);
        return affichage;
    }

    public static void afficherListe(Maillon debutListe) {
        // Le paramètre debutListe représente le début de la liste
        // soit l'adresse où est rangé le premier maillon.
        Maillon parcours = debutListe;
        for (parcours = debutListe; parcours != null; parcours = parcours.getMaillonSuivant()) {
            System.out.print(parcours.getValeur() + "-");
        }
    }
}
