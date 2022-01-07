package RPG;

public class MonstreMage extends Monstres{
    private int mana;

    public MonstreMage (String nom) {
        super(nom);
        this.mana = 10;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void bouleDeGlace(Personnage personnage, Monstres monstres){
        System.out.println(personnage.getNom() + "se fait attaquer");
        System.out.println(monstres.getNom() + "lance une boule de glace");
        System.out.println(monstres.getNom() + "inflige" + (monstres.getIntel() * this.mana)/100 + "dégats");
        personnage.setPdv(personnage.getPdv() - (monstres.getIntel() * this.mana)/100);
    }
}
