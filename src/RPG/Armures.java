package RPG;

import java.util.Random;

public class Armures extends Objets {

    private String piece;
    private String nom;
    private int defence;

    public Armures() {
    }

    ;

    public Armures(String piece, String nom, int defence) {

        this.piece = piece;
        this.nom = nom;
        this.defence = defence;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String type) {
        this.piece = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getdefence() {
        return defence;
    }

    public void setDefence(int defence) {
        Random rand = new Random();
        this.defence = this.getLvl()*rand.nextInt(1,3);
    }


}













