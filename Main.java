import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Voiture v = new Voiture("Peugeot", 120.0, "Rouge");

        int choix = 0;

        do {
            System.out.println("========== MENU TP2 - VOITURE ==========");
            System.out.println("1) Afficher détails");
            System.out.println("2) Get Couleur Voiture");
            System.out.println("3) Quitter");
            System.out.println("========================================");
            System.out.print("Veuillez choisir une option (1-3) : ");

            if (scanner.hasNextInt()) {
                choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                        v.afficherDetails();
                        break;

                    case 2:
                        System.out.println("\n>>> Couleur de la voiture : " + v.getCouleur() + "\n");
                        break;

                    case 3:
                        System.out.println("\nFin du programme. Au revoir !");
                        break;

                    default:
                        System.out.println("\n[Erreur] Choix invalide ! Veuillez saisir un nombre entre 1 et 3.\n");
                }
            } else {
                System.out.println("\n[Erreur] Saisie incorrecte ! Veuillez entrer un nombre.\n");
                scanner.next(); 
            }

        } while (choix != 3);

        scanner.close();
    }
}