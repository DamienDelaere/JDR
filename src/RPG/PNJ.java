package RPG;

import java.util.Scanner;

public class PNJ extends Humain {
    private String metier;

    public PNJ(String nom, int age, String sex, String metier){
        super(nom, age, sex);
        this.metier = metier;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public void recontre(Personnage personnage, PNJ pnj){
        boolean error = false;
        System.out.println("Bonjour "+personnage.getNom() + " le " + personnage.getClass()+ " et bienvenu dans ma boutique, je suis "+ pnj.getNom() + " le " + pnj.getMetier());
        for (int i = 0; i < pnj.getBag().size() ; i++) {
            System.out.println(i+1 + " - " + pnj.getBag().get(i) + " price ?");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(" 0 - Rien et quitter");
        System.out.println("Vous possedez actuellement "+ personnage.getGold()+" Gold");
        //trasnfer d'item du bag du pnj au bag du personnage

        do {
            System.out.println("Que voulez vous achetez ?");
            int choix = sc.nextInt();
            Objets obj = pnj.getBag().get(choix - 1);
            try {
                if (choix != 0) {
                    if(obj.getPrix() > personnage.getGold()){
                        System.out.println("Vous n'avez pas asser de gold pour acheter cette objet");
                        error = true;
                    }else {
                        personnage.getBag().add(obj);
                        System.out.println(pnj.getNom() + ": Merci pour votre achat et a bientot");
                        personnage.setGold(personnage.getGold()-obj.getPrix());
                        error = false;
                    }
                } else {
                    System.out.println(pnj.getNom() + ": A une prochaine fois\n vous quittez la boutique");
                    error = false;
                }

            } catch (Exception e) {
                System.out.println("vous n'avez pas rentrez un numero correct");
                error = true;
            }
        }while (error);


    }
}
