import java.util.Scanner;
public class Parte2 {

    public static void main(String[] args) {
        
                        // Menu bucle 
                        Scanner entradamenu = new Scanner(System.in);
                        int menu;
                        do {
                            System.out.println("[1] Calcular el promedio ");
                            System.out.println("[2] Saludar por tu nombre ");
                            System.out.println("[3] Hola Mundo ");
                            System.out.println("[4] Salir ");
                            System.out.print("Elige una opcion: ");
                            menu = entradamenu.nextInt();
                
                            // Menu de opciones
                            switch (menu) {
                                case 1:
                                    // Calcular el promedio 
                                    System.out.print("Ingrese la cantidad de numeros que deseas: ");
                                    int cantidad = entradamenu.nextInt();
                                    int suma = 0;
                                    for (int i = 0; i < cantidad; i++) {
                                        System.out.print("Ingrese el numero " + (i + 1) + ": ");
                                        int numero = entradamenu.nextInt();
                                        suma += numero;
                                    }
                                    double promedio = (double) suma / cantidad;
                                    System.out.println("El promedio es: " + promedio);
                                    break;
                
                                case 2:
                                    // Saludar por tu nombre
                                    System.out.println("Hola, ingresa tu nombre: ");
                                    int nombre = entradamenu.nextInt();
                                    System.out.println("Hola " + nombre + ", ¡Qué tal Amigo :)!");
                                    break;
                
                                case 3:
                                    // Hola Mundo
                                    System.out.println("¡Hola Mundo!");
                                    break;
                
                                case 4:
                                    // Salir
                                    System.out.println("Saliendo del programa...");
                                    break;
                
                                default:
                                    System.out.println("Opción no válida. Intenta de nuevo.");
                                    break;
                            }
                        } while (menu != 4);
                
                        
                    }
                }
          
