package ClaseIV_PracticaTMII;

public class SocorristaMoto extends Motos{
    public SocorristaMoto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente);
    }

    public void socorrerMoto(Motos moto){
        System.out.println("Socorriendo moto:   "+moto.getPatente());
    }
}
