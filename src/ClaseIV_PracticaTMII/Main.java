package ClaseIV_PracticaTMII;

public class Main {
    public static void main(String[] args) {
        Carrera nascar = new Carrera(3, 100,
                "Nascar", 5);
        for (int i = 0; i < 3; i++) {
            nascar.darDeAltaAuto(100+i,3,30,"AAA-123"+i);
        }
        for (int i = 0; i<2; i++)
        {
            nascar.darDeAltaMoto(80*1, 2+1,54-i, "Moto-"+i);
        }

        System.out.println("Eliminando vehiculo 0");
        nascar.eliminarVehiculos(nascar.getListaDeVehiculos().get(0));
        System.out.println("Eliminando vehiculo con patente Moto-1");
        nascar.eliminarVehiculoConPatente("Moto-1");

        System.out.println("El ganador es: " + nascar.esGanador());

        System.out.println("socorrer vehiculos de la carrera");
        nascar.socorrerMoto("Moto-0");
        nascar.socorrerAuto("AAA-1231");
    }
}
