import java.util.Scanner;

public class Periodo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Resuelve Lasuma de un numero  y su triple 

        System.out.print("Ingrese un numero: ");
        int x = scanner.nextInt();
        int Resultado =(x + (3*x));
        System.out.println("La suma de un numero y su triple es: " + Resultado);
       

        // Resuelve el doble de un numero menos 5 

        System.out.print("Ingrese el numero 5   : ");
        int x1 = scanner.nextInt();
        int Resultado1 = (2*x1 -x1);
        System.out.println("El doble de un numero menos 5 es: " + Resultado1);

        // Resuelve la mitad de un numero mas su cuadrado 

       
        System.out.print(" Ingresa el valor de x : ");
        int x2 = scanner.nextInt();
        int Resultado2 = ((x2/2) + (x2*x2));
        System.out.println("La mitad de un numero mas su cuadrado es: " + Resultado2);

        // Resuelve la suma de un numeoro su doble y su triple 
        System.out.print(" Ingresa el valor de x :");
        int x3 = scanner.nextInt();
        int Resultado3 = (x3 + (2*x3) + (3*x3));
        System.out.println(" La suma de un numero su doble y su triple es: " + Resultado3);

    }}
