public class CaseDeJeu {
    private int numeroCase;
    private String conditionJeu;
    private String joueurPresent;
    private int destination;

    public CaseDeJeu(int numeroCase, String conditionJeu, String joueurPresent, int destination) {
        this.numeroCase = this.numeroCase;
        this.conditionJeu = this.conditionJeu;
        this.joueurPresent = joueurPresent;
        this.destination = this.destination;
    }

    public CaseDeJeu() {

    }

    public int getNumeroCase() {
        return numeroCase;
    }

    public String getConditionJeu() {
        return conditionJeu;
    }

    public String getJoueurPresent() {
        return joueurPresent;
    }

    public void setJoueurPresent(String joueurPresent) {
        this.joueurPresent = joueurPresent;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }
    public void afficherCase() {
        System.out.print("|");
        System.out.printf("%-3d", numeroCase);
        System.out.print("|");
        System.out.printf("%-3s", conditionJeu);
        System.out.print("|");
        System.out.printf("%-3s", joueurPresent);
        System.out.print("|");
        System.out.printf("%-3d", destination);
        System.out.print("|");
        System.out.print("|\n");
    }
}
