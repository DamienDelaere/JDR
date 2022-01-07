package RPG;

import java.util.Random;

public class Armes extends Objets {

    private String catégorie;
    private String nom;
    private int degats;
    private int maniement;

    public Armes() {
    }

    ;

    public Armes(String catégorie, String nom, int degats, int maniement) {
        this.catégorie = catégorie;
        this.nom = nom;
        this.degats = degats;
        this.maniement = maniement;

    }

    public String getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(String type) {
        this.catégorie = catégorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        Random rand = new Random();
        this.degats = this.getLvl()*(rand.nextInt(2,6));
    }

    public int getManiement() {
        return maniement;
    }

    public void setManiement(int maniement) {
        this.maniement = maniement;
    }


}
