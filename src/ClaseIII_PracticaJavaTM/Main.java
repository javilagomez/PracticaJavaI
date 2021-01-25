package ClaseIII_PracticaJavaTM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Persona arr[] = new Persona[5];
        Celular arr[] = new Celular[5];
        for (int i = 0; i < 5; i++) {
            String dni;
            String nom = new String("");
            System.out.println("Ingresar dni: ");
            dni = scan.next();
            System.out.println("Ingresar nombre:");
            nom = scan.next();
            //Persona p = new Persona(nom, dni);
            Celular c = new Celular(nom, dni);
            arr[i] = c;
        }

        SortUtil.ordenar(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
