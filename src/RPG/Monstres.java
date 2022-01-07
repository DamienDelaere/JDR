package RPG;

import java.util.Random;
import java.util.Scanner;

public class Monstres extends Personnage {

    public Monstres(String nom){
        super(nom);
    }

    public void dropLoot(Monstres monstres, Personnage personnage){
        Random rand = new Random();
        int n = rand.nextInt(10);
        Random gold = new Random();
        int g = gold.nextInt(5);
        if(monstres.getPdv() <= 0){
            System.out.println(monstres.getNom() + " est mort, il laisse au sol un objet et de l'or");
            if(n < 3) {
                personnage.setGold(personnage.getGold() + g);
                System.out.println("En fouillant les restes vous trouvez une arme et " + g + " pièces d'or");
                Armes armes = new Armes();
                System.out.println("Voulez vous ramasser cet arme? oui/non");
                Scanner sc = new Scanner(System.in);
                String choix = sc.nextLine();
                switch (choix) {
                    case "oui" -> {
                        personnage.getBag().add(armes);
                        System.out.println("Vous avez ramassé l'arme et mis dans l'inventaire");
                    }
                    case "non" -> System.out.println("Vous laissez l'arme au sol");
                }
            }else{
                System.out.println("En fouillant les restes, vous trouvez une armure et " + g + " pièces d'or");
                personnage.setGold(personnage.getGold() + g);
                Armures armures = new Armures();
                System.out.println("Voulez vous ramasser cet armure? oui/non");
                Scanner sc = new Scanner(System.in);
                String choix = sc.nextLine();
                switch (choix) {
                    case "oui" -> {
                        personnage.getBag().add(armures);
                        System.out.println("Vous avez ramassé l'armure et mis dans l'inventaire");
                    }
                    case "non" -> System.out.println("Vous laissez l'armure au sol");
                }
            }
        }
    }
}
