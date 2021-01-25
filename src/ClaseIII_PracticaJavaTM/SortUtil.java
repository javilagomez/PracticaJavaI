package ClaseIII_PracticaJavaTM;

public class SortUtil {
    public static <T> void ordenar(Precedable<T> arr[]){
        Precedable<T> aux;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j+1].precedeA((T) arr[j]) > 0){
                    aux = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
