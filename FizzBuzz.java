package Correccion;
 /*
 Escribe un programa que muestre por consola (con un print) los
 números de 1 a 100 (ambos incluidos y con un salto de línea entre
 cada impresión), sustituyendo los siguientes:
 Múltiplos de 3 por la palabra "fizz".
 Múltiplos de 5 por la palabra "buzz".
 Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String result = "";

            if (i % 3 == 0) {
                result += "fizz";
            }

            if (i % 5 == 0) {
                result += "buzz";
            }

            if (result.isEmpty()) {
                result = String.valueOf(i);
            }

            System.out.println(result);
        }
    }
}