package RPG;

public class Guerrier extends Humain{

    private int endurance;

    public Guerrier(String nom, String sex, int age){
        super(nom, age, sex);
        this.endurance = 10;
        this.intel = 5;
        this.force = 15;
        this.def =2;
        this.pdv = 22;
        this.pdvMax=22;

        }
    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void Tourbillon(Monstres monstres, Guerrier guerrier){
        System.out.println(monstres.getNom() + "se fait attaquer");
        System.out.println(guerrier.getNom() + "lance une boule de glace");
        System.out.println(guerrier.getNom() + "inflige" + ((guerrier.getForce() * this.endurance)/100)*2 + "dégats");
        monstres.setPdv(monstres.getPdv()-((guerrier.getForce() * this.endurance)/100)*2);
        guerrier.setEndurance(guerrier.getEndurance()-4);
    }
}
