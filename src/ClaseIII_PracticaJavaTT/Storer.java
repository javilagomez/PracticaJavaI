package ClaseIII_PracticaJavaTT;

import java.util.Comparator;

public interface Storer<T> {
    public abstract void sort(T arr[], Comparator<T> c, int izq, int der);
}
