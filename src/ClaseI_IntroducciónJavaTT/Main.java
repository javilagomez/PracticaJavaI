package ClaseI_IntroducciónJavaTT;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    // Paso 1
    /*public static void arrayString(int iArr[]){
        String sArr[] = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            sArr[i] = String.valueOf(iArr[i]);
        }
    }*/

    // Paso 2
    /*public static String ceroString(String sArr[]){

    }*/

    public static void main(String[] args) {
        int iArr[] = {4,28,132,3,61,5};

        // PASO 1
        String sArr[] = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            sArr[i] = String.valueOf(iArr[i]);
        }

        // PASO 2
        int numMayor = 0;
        for (int i = 0; i < iArr.length; i++) {
            if(iArr[i]>numMayor){
                numMayor = iArr[i];
            }
        }
        int cifraMayor = String.valueOf(numMayor).length();
        String ceros = "";
        String sArrCeros[] = new String[iArr.length];
        for (int i = 0; i < (iArr.length); i++) {
            for (int j = 0; j < (cifraMayor - sArr[i].length()); j++) {
                ceros = ceros+'0';
            }
            sArrCeros[i] = ceros+sArr[i];
            ceros = "";
        }

        // PASO 3
        String cubo[] = new String[10];
        for (int i = 0; i < iArr.length; i++) {
            int indices = sArrCeros[i].charAt(sArrCeros[i].length()-1);
        }
    }
}
