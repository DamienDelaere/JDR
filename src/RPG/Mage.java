package RPG;

public class Mage extends Humain {

    private int mana;

    public Mage(String nom, int age, String sex){
        super(nom, age, sex);
        this.mana = 10;
        this.intel = 15;
        this.force = 5;
        this.def =-1;
        this.pdv = 18;
        this.pdvMax=18;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int endurance) {
        this.mana = mana;
    }

    public void bouleDeFeu(Monstres monstres, Mage mage){
        System.out.println(monstres.getNom() + "se fait attaquer");
        System.out.println(mage.getNom() + "lance une boule de glace");
        System.out.println(mage.getNom() + "inflige" + (mage.getIntel() * this.mana)/100 + "dégats");
        monstres.setPdv(monstres.getPdv()-(mage.getIntel() * this.mana)/100);
        mage.setMana(mage.getMana()-3);
    }


}
