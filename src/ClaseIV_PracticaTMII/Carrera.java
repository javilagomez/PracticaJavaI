package ClaseIV_PracticaTMII;

import java.util.ArrayList;

public class Carrera implements Ganador{
    private double distancia;
    private double premioEnDolares;
    private String nombre;
    private int cantidadDeVehiculosPermitidos;
    private ArrayList<Vehiculo> listaDeVehiculos = new ArrayList<>();
    private SocorristaAuto autoS;
    private SocorristaMoto motoS;

    public Carrera(double distancia, double premioEnDolares, String nombre,
                   int cantidadDeVehiculosPermitidos){
        setCantidadDeVehiculosPermitidos(cantidadDeVehiculosPermitidos);
        setDistancia(distancia);
        setNombre(nombre);
        setPremioEnDolares(premioEnDolares);
        autoS = new SocorristaAuto(70,10, 23,
                "MKE-700");
        motoS = new SocorristaMoto(90,10, 45,
                "HRR-66G");
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setPremioEnDolares(double premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadDeVehiculosPermitidos(int cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPremioEnDolares() {
        return premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public ArrayList<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void darDeAltaAuto(double velocidad, double aceleracion,
                              double anguloDeGiro, String patente){
        if (listaDeVehiculos.size() == getCantidadDeVehiculosPermitidos()){
            return;
        }
        listaDeVehiculos.add(new Autos(velocidad, aceleracion,
                anguloDeGiro, patente));
    }

    public void darDeAltaMoto(double velocidad, double aceleracion,
                              double anguloDeGiro, String patente){
        if (listaDeVehiculos.size() == getCantidadDeVehiculosPermitidos()){
            return;
        }
        listaDeVehiculos.add(new Motos(velocidad, aceleracion,
                anguloDeGiro, patente));
    }

    public void eliminarVehiculos(Vehiculo vehiculo){
        listaDeVehiculos.remove(listaDeVehiculos.indexOf(vehiculo));
    }

    private int buscarPorPatente(String unaPatente){
        for (int i = 0; i < listaDeVehiculos.size(); i++) {
            if (unaPatente == listaDeVehiculos.get(i).getPatente()){
                return i;
            }
        }
        return 0;
    }

    public void eliminarVehiculoConPatente(String unaPatente){
        int index = buscarPorPatente(unaPatente);
        listaDeVehiculos.remove(index);
    }

    @Override
    public double getPorcentaje(Vehiculo vehiculo) {
        double vel = vehiculo.getVelocidad();
        double ac = vehiculo.getAceleracion();
        double peso = vehiculo.getPeso();
        double ruedas = vehiculo.getRuedas();
        double giro = vehiculo.getAnguloDeGiro();
        return vel*(ac*(2*giro*(peso-(ruedas*100))));
    }

    public Vehiculo esGanador(){
        double maxP = 0;
        int index = 0;
        for (int i = 0; i < listaDeVehiculos.size(); i++) {
            if(getPorcentaje(listaDeVehiculos.get(i)) > maxP){
                maxP = getPorcentaje(listaDeVehiculos.get(i));
                index = i;
            }
        }
        return listaDeVehiculos.get(index);
    }

    public void socorrerAuto(String patente){
        int autoDañado = buscarPorPatente(patente);
        autoS.socorrerauto((Autos) listaDeVehiculos.get(autoDañado));
    }

    public void socorrerMoto(String patente){
        int motoDañada = buscarPorPatente(patente);
        motoS.socorrerMoto((Motos) listaDeVehiculos.get(motoDañada));
    }
}
