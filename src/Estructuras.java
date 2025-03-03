public class Estructuras {
    //Estructuras de Control
        //Condicionales
            //if -else
    public void verificarEdad(int edad) {
        if (edad >= 18) {
            System.out.println("usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }
            //switch
            public void seleccionarOpcion() {
                int Opc=3;
                switch(Opc){
                    case 1:
                        System.out.println("Opcion 1");
                        break;
                    case 2:
                        System.out.println("Opcion 2");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            }
        //Bucles o ciclos
            //ciclo for
        public void ejecutarFor() {
            for (int i = 0; i < 5; i++) {
                System.out.println("->" + i);
            }
        }
            //ciclo while
            public void ejecutarWhile() {
                int j = 5;
                while (j < 5) {
                    System.out.println("->" + j);
                    j++;
                }
            }
}
