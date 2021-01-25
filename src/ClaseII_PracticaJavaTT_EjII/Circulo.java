package ClaseII_PracticaJavaTT_EjII;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(){}

    public Circulo(double radio){
        setRadio(radio);
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(getRadio(),2);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
}
