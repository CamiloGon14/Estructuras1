import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Tipo de datos
        //Operadores
        Operadores op = new Operadores(8, 2);
        //Estructuras de control
        Estructuras estructuras = new Estructuras();

        estructuras.verificarEdad(18);
        estructuras.seleccionarOpcion(3);
        estructuras.ejecutarFor();
        estructuras.ejecutarWhile();
        //Calculadora
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
        int opcion; // Esta es la variable para almacenar la opción del usuario

        // Aca empezamos el bucle que muestra el menú hasta que el usuario elija salir
        do {
            System.out.println("\nCalculadora en Java");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potenciación");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Módulo");
            System.out.println("8. Conversión de Celsius a Fahrenheit");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt(); // Desde aca se puede leer la opción ingresada por el usuario

            // Estructura switch para manejar la opción seleccionada
            switch (opcion) {
                case 1:
                    realizarOperacion(scanner, "+"); // Llama al método para realizar suma
                    break;
                case 2:
                    realizarOperacion(scanner, "-"); // Llama al método para realizar resta
                    break;
                case 3:
                    realizarOperacion(scanner, "*"); // Llama al método para realizar multiplicación
                    break;
                case 4:
                    realizarOperacion(scanner, "/"); // Llama al método para realizar división
                    break;
                case 5:
                    realizarPotenciacion(scanner); // Llama al método para calcular potencia
                    break;
                case 6:
                    realizarRaizCuadrada(scanner); // Llama al método para calcular raíz cuadrada
                    break;
                case 7:
                    realizarOperacion(scanner, "%"); // Llama al método para calcular módulo
                    break;
                case 8:
                    convertirCelsiusAFahrenheit(scanner); // Llama al método para conversión de temperatura
                    break;
                case 9:
                    System.out.println("Saliendo..."); // Mensaje de salida
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo."); // Mensaje de error si la opción no es válida
            }
        } while (opcion != 9); // El bucle se repite hasta que el usuario elija salir

        scanner.close(); // Esta opcion es la que cierra el scanner
    }

    // Método para realizar operaciones básicas (+, -, *, /, %)
    private static void realizarOperacion(Scanner scanner, String operador) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble(); // Lee el primer número
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble(); // Lee el segundo número
        double resultado = 0;

        // Switch para realizar la operación seleccionada
        switch (operador) {
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero."); // Manejo de error para división entre cero
                    return;
                }
                break;
            case "%": resultado = num1 % num2; break;
        }

        System.out.println("Resultado: " + resultado); // Imprime el resultado
    }

    // Método para calcular la potencia de un número
    private static void realizarPotenciacion(Scanner scanner) {
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble(); // Lee la base
        System.out.print("Ingrese el exponente: ");
        double exponente = scanner.nextDouble(); // Lee el exponente
        double resultado = Math.pow(base, exponente); // Calcula la potencia
        System.out.println("Resultado: " + resultado); // Imprime el resultado
    }

    // Método para calcular la raíz cuadrada de un número
    private static void realizarRaizCuadrada(Scanner scanner) {
        System.out.print("Ingrese el número: ");
        double num = scanner.nextDouble(); // Lee el número
        if (num < 0) {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo."); // Manejo de error para números negativos
        } else {
            double resultado = Math.sqrt(num); // Calcula la raíz cuadrada
            System.out.println("Resultado: " + resultado); // Imprime el resultado
        }
    }

    // Método para convertir temperatura de Celsius a Fahrenheit
    private static void convertirCelsiusAFahrenheit(Scanner scanner) {
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble(); // Lee la temperatura en Celsius
        double fahrenheit = (celsius * 9/5) + 32; // Convierte a Fahrenheit
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit); // Imprime el resultado
    }
    }
}