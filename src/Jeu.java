public class Jeu {
    private CaseDeJeu[][] cases;
    public Jeu() {
        initialiserCases();
        initialiserPlateau();
    }
    private void initialiserCases() {
        cases = new CaseDeJeu[10][10];
        int numeroCase = 10 * 10;
    }
    private void initialiserPlateau() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int numeroCase = ((10- i - 1) * 10) + j + 1;
                String joueurPresent = "";
                int destination = 0;
                String conditionJeu = "";
                CaseDeJeu caseDeJeu = new CaseDeJeu(numeroCase, conditionJeu, joueurPresent, destination);
                cases[i][j] = caseDeJeu;
            }
            }
        }
    public int afficher() {
        String ligneHorizontale = "********";
        String coin = "*";

        System.out.print(coin);
        for (int i = 0; i < 10; i++) {
            System.out.print(ligneHorizontale);
            if (i != 9) {
                System.out.print(coin);
            }
        }
        System.out.println(coin);
        for (int i = 9; i >= 0; i--) {
            System.out.print(coin);
            for (int j = 0; j < 10; j++) {
                int numeroCase = cases[i][j].getNumeroCase();
                String affichageCase = String.format("%-4d", numeroCase);
                if (cases[i][j].getConditionJeu() != null) {
                    affichageCase = cases[i][j].getConditionJeu() + "  ";
                } else if (cases[i][j].getDestination() > 0) {
                    int destination = cases[i][j].getDestination();
                    affichageCase = String.format("%-4d", destination);
                }
                System.out.print("  " + affichageCase + "  ");
                System.out.print(coin);
            }
            System.out.println();
            System.out.println();
        }

        System.out.print(coin);
        for (int i = 0; i < 10; i++) {
            System.out.print(ligneHorizontale);
            if (i != 9) {
                System.out.print(coin);
            }
        }
        System.out.println(coin);
        return 0;
    }



}
