package Correccion;

/*
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "R" (piedra), "P" (papel)
 *   o "S" (tijera).
 * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
 */
import java.util.Scanner;

public class piedrapapel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int player1Rounds = 0;
        int player2Rounds = 0;
        int rounds = 3;

        System.out.print("\nR (piedra), P (papel) o S (tijera)");
        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRound " + i + ":");
            System.out.print("Player 1 (R/P/S): ");
            String player1 = scanner.nextLine();
            System.out.print("Player 2 (R/P/S): ");
            String player2 = scanner.nextLine();

            if (player1.equals(player2)) {
                System.out.println("Tie");
            } else if (
                    (player1.equals("R") && player2.equals("S")) ||
                            (player1.equals("P") && player2.equals("R")) ||
                            (player1.equals("S") && player2.equals("P"))
            ) {
                System.out.println("Player 1 wins this round.");
                player1Rounds++;
            } else {
                System.out.println("Player 2 wins this round.");
                player2Rounds++;
            }

            if (player1Rounds == 2 || player2Rounds == 2) {
                break;
            }
        }

        System.out.println("\nThe winner is:");
        if (player1Rounds > player2Rounds) {
            System.out.println("Player 1");
        } else if (player2Rounds > player1Rounds) {
            System.out.println("Player 2");
        } else {
            System.out.println("Tie");
        }

        scanner.close();
    }
}