package ClaseI_IntroducciónJavaTT;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Paso 1
    public static String[] arrayString(int iArr[]){
        String sArr[] = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            sArr[i] = String.valueOf(iArr[i]);
        }
        return sArr;
    }

    // Paso 2
    public static String[] ceroString(String sArr[]){
        int numMayor = 0;
        for (int i = 0; i < sArr.length; i++) {
            if(Integer.valueOf(sArr[i])>numMayor){
                numMayor = Integer.valueOf(sArr[i]);
            }
        }
        int cifraMayor = String.valueOf(numMayor).length();
        String ceros = "";

        String sArrCeros[] = new String[sArr.length];
        for (int i = 0; i < (sArr.length); i++) {
            for (int j = 0; j < (cifraMayor - sArr[i].length()); j++) {
                ceros = ceros+'0';
            }
            sArrCeros[i] = ceros+sArr[i];
            ceros = "";
        }
        return sArrCeros;
    }

    public static void main(String[] args) {
        int iArr[] = {4,24,28,132,3,61,5};

        // PASO 1
        String sArr[] = arrayString(iArr);

        // PASO 2
        String sArrCeros[] = ceroString(sArr);

        // PASO 3
        List<List<String>> cubeta = new ArrayList<List<String>>();
        for (int i = 0; i < 10; i++) {
            cubeta.add(new ArrayList<String>());
        }

        int conteo = 0;
        int bandera = 0;
        char clave[] = {'0','1','2','3','4','5','6','7','8','9'};
        char indice[] = new char[sArrCeros.length];

        while (conteo < 3){
            for (int i = 0; i < 10; i++) {
                cubeta.add(new ArrayList<String>());
            }

            // PASO 4
            for (int i = 0; i < sArrCeros.length; i++) {
                indice[i] = sArrCeros[i].charAt(sArrCeros[i].length()-(1+bandera));
            }
            bandera++;

            for (int i = 0; i < sArrCeros.length; i++) {
                for (int j = 0; j < cubeta.size(); j++) {
                    if (j == Character.getNumericValue(indice[i])){
                        cubeta.get(j).add(sArrCeros[i]);
                    }
                }
            }

            List<String> ListaAux = new ArrayList<String>();
            for (int i = 0; i < cubeta.size(); i++) {
                for (int j = 0; j < cubeta.get(i).size(); j++) {
                    ListaAux.add(cubeta.get(i).get(j));
                }
            }

            for (int i = 0; i < ListaAux.size(); i++) {
                sArrCeros[i] = ListaAux.get(i);
                System.out.println(sArrCeros[i]);
            }

            System.out.println("--");

            // PASO 5
            cubeta.removeAll(cubeta);
            conteo++;
        }

        /*List<List<String>> newArr = new ArrayList<List<String>>();
        cubeta.add(new ArrayList<String>());
        for (int i = 0; i < cubeta.size(); i++) {
            for (int j = 0; j < cubeta.get(i).size(); j++) {
                newArr.add(cubeta.get(i));
            }
        }
        System.out.println("");
        for (int i = 0; i < newArr.size(); i++) {
            for (int j = 0; j < newArr.get(i).size(); j++) {
                System.out.println(newArr.get(i).get(j));
            }
        }*/
    }
}
