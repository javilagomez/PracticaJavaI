package ClaseII_PracticaJavaTT_EjII;

public class Rectangulo extends FiguraGeometrica{
    double alto, ancho;

    public Rectangulo(){}

    public Rectangulo(double alto, double ancho){
        setAlto(alto);
        setAncho(ancho);
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    @Override
    public double area() {
        return getAlto()*getAncho();
    }
}
