package ClaseII_PracticaJavaTT_EjII;

public abstract class FiguraGeometrica {
    public abstract double area();

    @Override
    public String toString(){
        return "Área: "+area();
    }
}
