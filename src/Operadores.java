public class Operadores {
        // Operadores
        //Atributos (Se me olvido que era una clase)
        int a,b;
        //Constructor
        public Operadores(int a, int b) {
            this.a = a;
            this.b = b;
            realizarOperaciones();
        }

    public void realizarOperaciones() {
        // Aritméticos: +, -, *, /, %
        int Suma = a + b;
        System.out.println("Suma: " + Suma);
        int Resta = a - b;
        System.out.println("Resta: " + Resta);
        int Mult = a * b;
        System.out.println("Multiplicación: " + Mult);
        int Div = a / b;
        System.out.println("División: " + Div);
        int Mod = a % b;
        System.out.println("Módulo: " + Mod)

        // Relacionales: ==, !=, >, <, >=, <=
        boolean Igual = a == b;
        System.out.println("Igual: " + Igual);
        boolean Diferente = a != b;
        System.out.println("Diferente: " + Diferente);
        boolean Mayor = a > b;
        System.out.println("Mayor: " + Mayor);
        boolean Menor = a < b;
        System.out.println("Menor: " + Menor);
        boolean MayorIgual = a >= b;
        System.out.println("Mayor Igual: " + MayorIgual);
        boolean MenorIgual = a <= b;
        System.out.println("Menor Igual: " + MenorIgual);

        // Lógicos: &&, ||, !
        boolean And = (a < b) && (b > a);
        System.out.println("Operador AND: " + And);
        boolean Or = (a != 0) || (b == 0);
        System.out.println("Operador OR: " + Or);
        boolean Negacion = (a != 0) && !(b == 0);
        System.out.println("Operador NOT: " + Negacion);
    }
}
