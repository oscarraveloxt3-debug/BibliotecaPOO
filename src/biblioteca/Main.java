package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenidos al sistema de Bilioteca!");
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor del lbro: ");
        String autor = sc.nextLine();
        Libro libro = new Libro(titulo, autor);

        System.out.println("\nOpciones: ");
        System.out.println("1. Prestar Libro");
        System.out.println("2. Devolver Libro");
        System.out.println("3. Mostrar Informacion");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opcion: ");
        try{
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    libro.prestar();
                    break;
                case 2:
                    libro.devolver();
                    break;
                case 3:
                    libro.mostrarInfo();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingrese el numero válido.");
        }
        sc.close();


    }
}
