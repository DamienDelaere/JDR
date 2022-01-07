package RPG;

import java.util.*;

public abstract class Personnage {

    private String nom;
    private int xp;
    protected int level;
    private List<Objets> bag;
    protected int force;
    protected int intel;
    protected int pdv;
    protected int pdvMax;
    protected int def;

    protected int gold;
    private HashMap<String, Armes> arme;
    private HashMap<String, Armures> armures;

    public Personnage(String nom) {
        xp = 0;
        level = 1;
        force = 10;
        intel = 10;
        pdv = 20;
        pdvMax = 20;
        def = 0;
        bag = new ArrayList<>();
        arme = new HashMap<>();
        armures = new HashMap<>();
        this.nom = nom;
    }

    //region GETTERS SETTERS

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Objets> getBag() {
        return bag;
    }

    public void setBag(List<Objets> bag) {
        this.bag = bag;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getPdv() {
        return pdv;
    }

    public void setPdv(int pdv) {
        this.pdv = pdv;
    }

    public int getPdvMax() {
        return pdvMax;
    }

    public void setPdvMax(int pdvMax) {
        this.pdvMax = pdvMax;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public HashMap<String, Armes> getArme() {
        return arme;
    }

    public void setArme(HashMap<String, Armes> arme) {
        this.arme = arme;
    }

    public HashMap<String, Armures> getArmures() {
        return armures;
    }

    public void setArmures(HashMap<String, Armures> armures) {
        this.armures = armures;
    }

    //endregion

    public String direBonjour() {
        return "Bonjour, je suis " + this.nom;
    }

    public void frapper(Monstres cible) {
        cible.setPdv(cible.getPdv() - (this.force - cible.getDef()));
    }

    public void deplacer() {
        Random rand = new Random();


    }

    public void fuir() {

    }

    public void mort(Personnage personnage) {
        if (personnage.getPdv() <= 0) {
            System.out.println("Le personnage " + personnage.getNom() + " est mort.");
        }
    }

    public void equiper(Objets obj, Personnage personnage) {
        if (personnage.getBag().contains(obj)) {

            if (obj.getType().equalsIgnoreCase("armure")) {

                Armures armInv = (Armures) obj;

                if (personnage.getArmures().containsKey(armInv.getPiece())) {
                    Armures arm = personnage.getArmures().get(armInv.getPiece());
                    System.out.println("Il y a deja un(e) " + armInv.getPiece() + " équipé.");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Souhaitez vous changer de piece ?");
                    System.out.println("Ancienne piéce : " + arm.getNom() + " Type : " + arm.getPiece() + " Def : " + arm.getdefence() + " Level : " + arm.getLvl());
                    System.out.println("Nouvelle piéce : " + armInv.getNom() + " Type : " + armInv.getPiece() + " Def : " + armInv.getdefence() + " Level : " + armInv.getLvl());
                    String choix = sc.nextLine();
                    if ("oui".equalsIgnoreCase(choix)) {
                        personnage.getBag().add(personnage.getArmures().get(armInv.getPiece()));
                        personnage.getArmures().replace(arm.getPiece(), (Armures) obj);
                        personnage.getBag().remove(obj);
                    }
                } else {
                    personnage.getArmures().put(armInv.getPiece(), (Armures) obj);
                }
            }

            if (obj.getType().equalsIgnoreCase("arme")) {

                Armes armesInv = (Armes) obj;

                if (personnage.getArme().containsKey(armesInv.getCatégorie())) {
                    Armes arme = personnage.getArme().get(armesInv.getCatégorie());

                    if (arme.getManiement() == 2) {
                        System.out.println("Déja équipé d'une arme à 2 mains");
                    }

                }

            }


        }
    }

}
