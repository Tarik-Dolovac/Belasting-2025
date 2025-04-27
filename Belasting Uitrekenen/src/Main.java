import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Voor 2025.");

        Scanner scanner = new Scanner(System.in);
        double bruto;
        double netto;
        double betalen;

        System.out.print("Hoeveel verdien je per jaar?: ");
        bruto = scanner.nextDouble();

        if (bruto < 38441) {
            betalen = bruto * 0.3582;
            netto = bruto - betalen;
            System.out.printf("Je zult €%.2f moeten betalen.\n", betalen);
            System.out.printf("Je houdt €%.2f over.\n", netto);
        }

        else if (bruto >= 38441) {
            if (bruto > 76817) {
                double a = bruto - 76817;
                betalen = a * 0.4950 + 28152.891;
                netto = bruto - betalen;
                System.out.printf("Je zult €%.2f moeten betalen.\n", betalen);
                System.out.printf("Je houdt €%.2f over.\n", netto);
            }

            else {
                double b = bruto - 38441;
                betalen = b * 0.3748 + 13769.5662;
                netto = bruto - betalen;
                System.out.printf("Je zult €%.2f moeten betalen.\n", betalen);
                System.out.printf("Je houdt €%.2f over.\n", netto);
            }
        }

        scanner.close();
    }
}