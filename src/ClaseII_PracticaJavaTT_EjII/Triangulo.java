package ClaseII_PracticaJavaTT_EjII;

public class Triangulo extends FiguraGeometrica{
    double base, altura;

    public Triangulo(){}

    public Triangulo(double base, double altura){
        setBase(base);
        setAltura(altura);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double area() {
        return (getBase()*getAltura())/2;
    }
}
