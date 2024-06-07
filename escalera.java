package Correccion;
/*
 * Crea una función que dibuje una escalera según su número de escalones.
 * - Si el número es positivo, será ascendente de izquiera a derecha.
 * - Si el número es negativo, será descendente de izquiera a derecha.
 * - Si el número es cero, se dibujarán dos guiones bajos (__).
 *
 * Ejemplo: 4
 *         _
 *       _|
 *     _|
 *   _|
 * _|
 *
 */
import java.util.Scanner;

public class escalera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF STEPS: ");
        int steps = scanner.nextInt();

        if (steps == 0) {
            System.out.println("__");
        } else if (steps > 0) {
            for (int i = 0; i < steps; i++) {
                for (int j = 0; j < steps - i - 1; j++) {
                    System.out.print("  ");
                }
                System.out.println("_|");
            }
        } else {
            for (int i = 0; i < -steps; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                System.out.println("|_");
            }
        }
        scanner.close();
    }
}