package RPG;

public class MonstreGuerrier extends Monstres{
    private int endurance;

    public MonstreGuerrier(String nom){
        super(nom);
        this.endurance = 10;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void mettreUneChasse(Personnage personnage, Monstres monstres){
        System.out.println(personnage.getNom() + "se fait attaquer");
        System.out.println(monstres.getNom() + "met une chasse");
        System.out.println(monstres.getNom() + "inflige" + (monstres.getForce() * this.endurance)/100 + "dégats");
        personnage.setPdv(personnage.getPdv() - (monstres.getIntel() * this.endurance)/100);
    }
}
