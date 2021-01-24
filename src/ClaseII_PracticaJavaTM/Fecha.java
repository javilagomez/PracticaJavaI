package ClaseII_PracticaJavaTM;

import java.util.GregorianCalendar;

public class Fecha {
    GregorianCalendar calendar;

    public Fecha(int anio, int mes, int dia){
        calendar = new GregorianCalendar();
        setCalendar(anio, mes, dia);
    }

    public void setCalendar(int anio, int mes, int dia) {
        calendar.set(anio, mes, dia);
    }

    public int getYear() {
        return calendar.get(GregorianCalendar.YEAR);
    }
}
