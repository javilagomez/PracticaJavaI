package ClaseIV_PracticaTM;

import ClaseIII_PracticaJavaTM.Persona;

public class Prenda {
    private String marca;
    private String modelo;

    public Prenda(String marca, String modelo){
        setMarca(marca);
        setModelo(modelo);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
