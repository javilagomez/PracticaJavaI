package ClaseI_IntroduccionJavaTM;

import java.util.Scanner;

public class Main {
    public static boolean esPar(int n){
        return n%2==0;
    }

    public static boolean esMultiplo(int numeros, int m){
        return numeros%m==0;
    }

    public static boolean esPrimo(int n){
        int contador = 2;
        boolean primo = true;

        while((primo) && (contador!=n)){
            if(n%contador == 0){
                primo = false;
            }
            contador++;
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // QUITA LOS COMENTARIOS DE ALGÚN EJERCICIO Y MIRA LA MAGIA!

        // EJERCICOI 1
        /*System.out.print("Ingresa un número: ");
        int n = scan.nextInt();

        int contador = 0;
        int numeros = 1;
        while(contador<n){
            if(esPar(numeros)){
                System.out.println(numeros);
                contador++;
            }
            numeros++;
        }*/

        // EJERCICIO 2
        /*System.out.println("Ingresar número n: ");
        int n = scan.nextInt();
        System.out.println("Ingresar número m: ");
        int m = scan.nextInt();

        int contador = 0;
        int numeros = 1;
        while(contador<n){
            if(esMultiplo(numeros,m)){
                System.out.println(numeros);
                contador++;
            }
            numeros++;
        }*/

        // EJERCICIO 3
        /*System.out.print("Ingresar número n: ");
        int n = scan.nextInt();

        if(esPrimo(n)==true){
            System.out.println(n+" es primo");
        }else {
            System.out.println(n+" no es primo");
        }*/

        // EJERCICIO 4
        /*System.out.print("Ingresar número n: ");
        int n = scan.nextInt();

        int contador = 0;
        int numeros = 2;
        while(contador<n){
            if(esPrimo(numeros)){
                System.out.println(numeros);
                contador++;
            }
            numeros++;
        }*/

        // EJERCICIO 5
        System.out.print("Ingresar la cantidad m que se repite el dígito d: ");
        int m = scan.nextInt();
        System.out.print("Ingresar el d dígito: ");
        int d = scan.next().charAt(0);
        System.out.print("Ingresar la cantidad n de números: ");
        int n = scan.nextInt();

        int contador = 0;
        int countNum = 0;
        int numero = 0;
        while (countNum < n){
            String numString = String.valueOf(numero);
            for (int i = 0; i < numString.length(); i++) {
                if (numString.charAt(i) == d){
                    contador++;
                }
                if (contador >= m) {
                    System.out.print(numero+" ");
                    contador = 0;
                    countNum++;
                }
            }
            contador = 0;
            numero++;
        }
    }
}
