package fr.oz;

public class Maillon {
    String valeur;
    Maillon maillonSuivant;
    Maillon maillonPrecedent;

    public Maillon(String valeur) {
        this.valeur = valeur;
        this.maillonSuivant = null;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Maillon getMaillonSuivant() {
        return maillonSuivant;
    }

    public void setMaillonSuivant(Maillon maillonSuivant) {
        this.maillonSuivant = maillonSuivant;
    }

    public void setMaillonPrecedent(Maillon maillonPrecedent) {
        this.maillonPrecedent = maillonPrecedent;
    }

    public Maillon getMaillonPrecedent() {
        return maillonPrecedent;
    }

}
