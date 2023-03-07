import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        fichiers r = new fichiers();
        r.setValues(r.lecture(r.getValues()));
        r.setValues(r.Conditions(r.getValues()));
        r.setValeursJeu(r.stringToInt(r.getValues(), r.getValeursJeu()));
        r.setValues(r.lecture(r.getValues()));
        Jeu se = new Jeu();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu de Serpents et Échelles !");

        // Demander le nombre de joueurs
        System.out.print("Combien de joueurs participent (max = 5)? ");
        int nbJoueurs = scanner.nextInt();
        while (nbJoueurs > 5) {
            System.out.print("Reesayez, max 5 joueurs");
            nbJoueurs = scanner.nextInt();
        }

        // Créer les joueurs
        CaseDeJeu[] joueurs = new CaseDeJeu[nbJoueurs];
        for (int i = 0; i < nbJoueurs; i++) {
            System.out.print("Nom du joueur " + (i + 1) + " : ");
            String nom = scanner.next();
            joueurs[i] = new CaseDeJeu();
        }
        Jeu plateau = new Jeu();
        se.afficher();
        // Boucle principale du jeu
        while (true) {
            // Pour chaque joueur
            for (int i = 0; i < nbJoueurs; i++) {
                // Demander le jet de dé
                System.out.print(joueurs[i].getJoueurPresent() + ", appuyez sur Entrée pour lancer le dé...");
                scanner.nextLine();
                Random random = new Random();
                int valeurDe = random.nextInt(6) + 1;
                System.out.println("Vous avez obtenu " + valeurDe + " !");
                // Déplacer le joueur
                int ancienneCase = joueurs[i].getNumeroCase();
                joueurs[i].setDestination(ancienneCase + valeurDe);
            }
        }
    }
}
