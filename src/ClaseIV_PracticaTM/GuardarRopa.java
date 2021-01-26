package ClaseIV_PracticaTM;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GuardarRopa {
    private int contador;
    private HashMap<Integer, ArrayList<Prenda>> listaRopa;

    public GuardarRopa(){
        contador = 1;
        listaRopa = new HashMap<>();
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setListaRopa(Integer contador, ArrayList<Prenda> listaRopa) {
        this.listaRopa.put(contador, listaRopa);
    }

    public int getContador() {
        return contador;
    }

    public HashMap<Integer, ArrayList<Prenda>> getListaRopa() {
        return listaRopa;
    }

    public Integer guardarPrendas(ArrayList<Prenda> listaDePrenda){
        setListaRopa(getContador(), listaDePrenda);
        setContador(contador+1);
        return getContador();
    }

    public void mostrarPrendas(){
        for (HashMap.Entry<Integer, ArrayList<Prenda>> entry:listaRopa.entrySet()) {
            System.out.println(entry.getKey());
            for (Prenda x:entry.getValue()) {
                System.out.println("   "+x.getMarca()+", "+x.getModelo());
            }
        }
    }

    public ArrayList<Prenda> devolverPrendas(Integer numero){
        return listaRopa.remove(numero);
    }
}
