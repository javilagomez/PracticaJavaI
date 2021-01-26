package ClaseIV_PracticaTMII;

public class Vehiculo {
    private double velocidad;
    private double aceleracion;
    private double anguloDeGiro;
    private String patente;
    private double peso;
    private int ruedas;

    public Vehiculo(double velocidad, double aceleracion, double anguloDeGiro,
                    String patente, double peso, int ruedas){
        setVelocidad(velocidad);
        setAceleracion(aceleracion);
        setAnguloDeGiro(anguloDeGiro);
        setPatente(patente);
        setPeso(peso);
        setRuedas(ruedas);

    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPatente() {
        return patente;
    }

    public double getPeso() {
        return peso;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public void setAnguloDeGiro(double anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
