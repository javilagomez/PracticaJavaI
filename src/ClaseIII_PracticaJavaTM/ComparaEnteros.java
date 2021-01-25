package ClaseIII_PracticaJavaTM;

import java.util.Comparator;

public class ComparaEnteros implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return a-b;
    }
}
