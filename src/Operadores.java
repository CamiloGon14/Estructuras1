public class Operadores {
    //Operadores
    int a=8;
    int b=2;
    //Aritmeticos: +, -, *, /, %
        int Suma=a+b;
        int resta=a-b;
        int Mult=a*b;
        int Div=a/b;
        int Mod=a%b;
    //Relacionales: ==, !=, >, <, >=, <= estos de aqui se manejan con el tipo de dato booleano
        boolean Igual=a==b;
        boolean Diferente=a!=b;
        boolean Mayor=a>b;
        boolean Menor=a<b;
        boolean MayorIgual=a>=b;
        boolean MenorIgual=a<=b;
    //Logicos: &&, ||, !
        boolean And=(a<b)&&(b>a);
        boolean Or=(a!=0)||(b==0);
        boolean Negacion=(a!=0)&&!(b==0);

}
