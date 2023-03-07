import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fichiers {
    private int numLines;
    private String[][] values;
    private int[][] valeursJeu;

    public fichiers() {
    }
    public int[][] getValeursJeu() {
        return valeursJeu;
    }

    public void setValeursJeu(int[][] valeursJeu) {
        this.valeursJeu = valeursJeu;
    }

    public String[][] getValues() {
        return values;
    }

    public void setValues(String[][] values) {
        this.values = values;
    }

    public String[][] lecture(String[][] values) {
        // create a scanner to read the file
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("info-cases.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // count the number of lines in the file
        int numLines = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            numLines++;
        }

        values = new String[numLines][2];

        // reset the scanner to the beginning of the file
        try {
            scanner = new Scanner(new File("info-cases.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // read each line of the file and split it into two values
        int index = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(";");
            values[index][0] = parts[0];
            values[index][1] = parts[1];
            index++;
        }

/*        // print the values in the 2D array
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }*/
        return values;
    }

    public String[][] Conditions(String[][] values) {
        for (int i = 0; values.length > i; i++) {
            if (values[i][1].equalsIgnoreCase("2D")) {
                //codename 2d = 101
                values[i][1] = "101";
            }
            if (values[i][1].equalsIgnoreCase("X2")) {
                //codename x2 = 102
                values[i][1] = "102";
            }
            if (values[i][1].equals("-1")) {
                //codename -1 = 103
                values[i][1] = "103";
            }
        }
//        for (int i = 0; i < values.length; i++) {
//            for (int j = 0; j < values[i].length; j++) {
//                System.out.print(values[i][j] + " ");
//            }
//            System.out.println();
//        }
        return values;
    }

    public int[][] stringToInt(String values[][], int valeursJeu[][]) {
        valeursJeu = new int[values.length][2];
        for (int i = 0; i < values.length; i++) {
            valeursJeu[i][0] = Integer.parseInt(values[i][0]);
            valeursJeu[i][1] = Integer.parseInt(values[i][1]);
        }
        for (int i = 0; i < valeursJeu.length; i++) {
            for (int j = 0; j < valeursJeu[i].length; j++) {
                System.out.print(valeursJeu[i][j] + " ");
            }
            System.out.println();
        }
        return valeursJeu;
    }
}

