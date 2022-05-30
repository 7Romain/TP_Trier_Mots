package fr.oz;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    static String nbrMots;
    static String reponse;
    static int taille;
    static String[] tableau;
    static String resultat;

    static void afficher(String[] aAfficher) {

        resultat = "";
        for (int i = 0; i < taille; i++) {
            resultat = resultat + (tableau[i] + " " + " | ");
        }
        JOptionPane.showMessageDialog(null, "| " + resultat, " Mots ",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        while (taille <= 0) {
            reponse = JOptionPane.showInputDialog(null, "Veuillez saisir le nombre de mots SVP", "Nombre de mots ?",
                    JOptionPane.QUESTION_MESSAGE);
            try {
                taille = Integer.parseInt(reponse);
                if (taille <= 0)
                    throw new NumberFormatException();

            } catch (NumberFormatException ex) {
                System.out.println("The number is not an integer ");
                JOptionPane.showMessageDialog(null,
                        "Veuillez entrer un nombre supérieur à zéro",
                        "Attention!", JOptionPane.INFORMATION_MESSAGE);

            }

        }
        tableau = new String[taille];
        for (int i = 0; i < taille; i++) {
            tableau[i] = JOptionPane.showInputDialog(null, "Veuillez saisir le premier mot SVP", "Mots ?",
                    JOptionPane.QUESTION_MESSAGE);
        }
        afficher(tableau);
        Arrays.sort(tableau);
        afficher(tableau);

    }

}
