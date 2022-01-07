package RPG;

import java.util.Random;

public abstract class Objets {

    private String nom;
    private int lvl;
    private String type;
    private int prix;

    public Objets(){};

    public Objets(String nom, int lvl, String type, int prix
    ) {
        this.nom = nom;
        this.lvl = lvl;
        this.type = type;
        this.prix = prix;
    }

    public String getNom(){return nom;}

    public int getLvl(){return lvl;}

    public void setNom(String nom){this.nom = nom;}

    public void setLvl(int lvl){this.lvl = lvl;}

    public String getType(){return type;}

    public void setType(String type){
        this.type = type;
    }
    public int getPrix(){return prix;}

    public void setPrix(){
        Random rand = new Random();
        this.prix = this.getLvl()* rand.nextInt(1,4);}


}
