package RPG;

public class Pretre extends Humain{

    private int volonte;

    public Pretre(String nom, int age, String sex){
        super(nom, age, sex);
        this.volonte = 10;
        this.intel = 15;
        this.force = 5;
        this.def =-2;
        this.pdv = 19;
        this.pdvMax=19;

    }

    public int getVolonte() {
        return volonte;
    }

    public void setVolonte(int endurance) {
        this.volonte = volonte;
    }

    public void Heal(Pretre pretre){
        int heal = (pretre.getIntel() * this.volonte)/100;
        int newPdv;
        System.out.println(pretre.getNom() + "se soigne de " + heal + " PDV");
        System.out.println(pretre.getNom() + "avait " + pretre.getPdv());
        newPdv = Math.min(pretre.getPdv() + heal, pretre.getPdvMax());
        pretre.setPdv(newPdv);
        pretre.setVolonte(pretre.getVolonte()-3);
        System.out.println(pretre.getNom() + "a mainteant " + newPdv);

    }




}
