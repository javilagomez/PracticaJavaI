package ClaseIV_PracticaTMII;

public class SocorristaAuto extends Autos{

    public SocorristaAuto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente);
    }

    public void socorrerauto(Autos auto){
        System.out.println("Socorriendo auto"+auto.getPatente());
    }
}
