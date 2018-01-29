import java.util.Scanner;

public class Ecker_Bowling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double player;
        double pricePerBowlingAlley;
        double bowlingAlleys;
        double games;
        double PlayerPerGamePrice;

        double pricePerGame;
        double pricePerHour;
        double subtrahend;

        System.out.println("Eingabe");
        System.out.println("-------");

        System.out.print("Anzahl der zahlenden Personen   : ");
        player = scanner.nextDouble();

        System.out.print("Gruppenpreis pro Bahn           : ");
        pricePerBowlingAlley = scanner.nextDouble();

        System.out.print("Anzahl der Bahnen               : ");
        bowlingAlleys = scanner.nextDouble();

        System.out.print("Anzahl der Spiele               : ");
        games = scanner.nextDouble();

        System.out.print("Preis pro Spiel für eine Person : ");
        PlayerPerGamePrice = scanner.nextDouble();

        pricePerHour = bowlingAlleys * pricePerBowlingAlley * games;
        pricePerGame = player * PlayerPerGamePrice * games;

        System.out.println();
        System.out.println("Ergebnis");
        System.out.println("--------");
        System.out.printf("Gesamtpreis für Preis / Bowlingstunde und Bahn = %.2f \n", pricePerHour);
        System.out.printf("Gesamtpreis für Preis pro Spiel und Person = %.2f \n", pricePerGame);

        if (pricePerHour > pricePerGame){
            subtrahend = pricePerHour - pricePerGame;
            System.out.printf("Die Variante 2 ist umd %.2f€ billiger als Variante 2", subtrahend);
        } else if (pricePerGame > pricePerHour){
            subtrahend = pricePerGame - pricePerHour;
            System.out.printf("Die Variante 1 ist um %f.2€ billiger als Variante 1", subtrahend);
        }
    }
}
