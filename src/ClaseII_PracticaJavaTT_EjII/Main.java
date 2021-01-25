package ClaseII_PracticaJavaTT_EjII;

public class Main {
    public static double AreaPromedio(FiguraGeometrica arr[]) {
        double sum = 0;
    for(FiguraGeometrica fg:arr){
            sum+=fg.area();
        }
    return sum/arr.length;
    }

    public static void main(String[] args) {
        FiguraGeometrica arr[] = new FiguraGeometrica[3];
        arr[0] = new Circulo(10);
        arr[1] = new Triangulo(3,4);
        arr[2] = new Rectangulo(3,4);

        double areaPromedio = AreaPromedio(arr);

        System.out.println(areaPromedio);
    }
}
