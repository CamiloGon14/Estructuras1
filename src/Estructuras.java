public class Estructuras {
    //Estructuras de Control
        //Condicionales
            //if -else
            int edad=18;
            if (edad>=18){
                System.out.println("usted es mayor de edad");
            }else{
                System.out.println("Usted es menor de edad");
            }
            //switch
            int Opc =3;
            swicht(Opc){
                case 1:
                    System.out.println("Opcion 1");
                case 2:
                    System.out.println("Opcion 2");
                default :
                    System.out.println("Opcion invalida");
            }
        //Bucles o ciclos
            //ciclo for
            for(int i=0;i<5;i++){
                System.out.println("->"+i);
            }
            //ciclo while
            int j=5;
            while(j<5){
                System.out.println("->"+j);
                j++;
            }

}
