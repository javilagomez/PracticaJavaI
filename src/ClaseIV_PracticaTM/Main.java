package ClaseIV_PracticaTM;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuardarRopa ropa = new GuardarRopa();
        ArrayList<Prenda> listaropa;

        for (int i = 0; i < 2; i++) {
            listaropa = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                System.out.println("Ingrese la marca: ");
                String marca = scan.next();
                System.out.println("Ingrese el modelo: ");
                String modelo = scan.next();
                listaropa.add(new Prenda(marca, modelo));
            }
            ropa.guardarPrendas(listaropa);
        }
        ropa.mostrarPrendas();
        ropa.devolverPrendas(1);
        System.out.println("Se devolvió el grupo de prendas 1");
        ropa.mostrarPrendas();
    }
}
