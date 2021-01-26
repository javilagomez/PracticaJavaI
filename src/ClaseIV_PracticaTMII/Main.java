package ClaseIV_PracticaTMII;

public class Main {
    public static void main(String[] args) {
        Carrera nascar = new Carrera(3, 100,
                "Nascar", 5);
        for (int i = 0; i < 3; i++) {
            nascar.darDeAltaAuto(100+i,3,30,"AAA-111");
        }
    }
}
