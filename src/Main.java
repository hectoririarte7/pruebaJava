import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero = 0;
    int suma = 0;

        System.out.println("¡Hola mundo desde GitHub Codespaces! 👋");

        while (numero != 7) {
            System.out.println("Ingresa un número (escribe 7 para salir): ");
            numero = sc.nextInt();
            if (numero == 7) {
                break;
            }
            suma += numero;
        }

        System.out.println("La suma total es: " + suma);

        sc.close();
    }
}
