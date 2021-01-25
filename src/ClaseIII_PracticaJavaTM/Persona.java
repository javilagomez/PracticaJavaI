package ClaseIII_PracticaJavaTM;

public class Persona implements Precedable<Persona>{
    private String nombre;
    private int dni;

    public Persona(){}

    @Override
    public int precedeA(Persona persona) {
        ComparaEnteros st = new ComparaEnteros();
        return st.compare(persona.getDni(), getDni());
    }

    public Persona(String nom, int id){
        setNombre(nom);
        setDni(id);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    /*@Override
    public int precedeA(Persona persona) {
        if (getDni() < persona.dni){
            return 1;
        }else {
            return -1;
        }
    }*/

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}
