import java.util.Scanner;

public class pruebaCalculadora{
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
              int opcion;
                do {

                    System.out.println("Seleccione una operacion:");
                    System.out.println("1. Suma");
                    System.out.println("0. Salir");
                    opcion = scanner.nextInt();
                    System.out.print("Dime el primer numero: ");
                    
                    int num1 = scanner.nextInt();

                        System.out.print("Dime el segundo numero: ");
                        int num2 = scanner.nextInt();
                        Calculadora cal = new Calculadora(num1, num2); 
                        int resultado;

                    switch (opcion) {
                        case 1:
                            resultado = cal.suma();
                            System.out.println("El resultado de la suma es: " + resultado);
                            break;

                        default:
                            System.out.println("Opción inválida. Intente nuevamente.");
                            break;
                    }
                } while (opcion != 0);
    }
}