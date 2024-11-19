import java.util.Scanner;

public class CalculatriceConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        System.out.println("Bienvenue dans la calculatrice console !");

        while (continuer) {
            System.out.println("Veuillez choisir une opération :");
            System.out.println("1. Addition (+)");
            System.out.println("2. Soustraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Quitter");

            int choix = scanner.nextInt();

            if (choix == 5) {
                System.out.println("Merci d'avoir utilisé la calculatrice. À bientôt !");
                continuer = false;
                continue;
            }

            System.out.print("Entrez le premier nombre : ");
            double nombre1 = scanner.nextDouble();

            System.out.print("Entrez le deuxième nombre : ");
            double nombre2 = scanner.nextDouble();

            double resultat;

            switch (choix) {
                case 1:
                    resultat = nombre1 + nombre2;
                    System.out.println("Résultat : " + nombre1 + " + " + nombre2 + " = " + resultat);
                    break;
                case 2:
                    resultat = nombre1 - nombre2;
                    System.out.println("Résultat : " + nombre1 + " - " + nombre2 + " = " + resultat);
                    break;
                case 3:
                    resultat = nombre1 * nombre2;
                    System.out.println("Résultat : " + nombre1 + " * " + nombre2 + " = " + resultat);
                    break;
                case 4:
                    if (nombre2 != 0) {
                        resultat = nombre1 / nombre2;
                        System.out.println("Résultat : " + nombre1 + " / " + nombre2 + " = " + resultat);
                    } else {
                        System.out.println("Erreur : division par zéro !");
                    }
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
