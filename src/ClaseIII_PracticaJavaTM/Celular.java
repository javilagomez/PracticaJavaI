package ClaseIII_PracticaJavaTM;

public class Celular implements Precedable<Celular>{
    private String empresa;
    private String num;

    public Celular(String empresa, String numero){
        setEmpresa(empresa);
        setNum(numero);
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getNum() {
        return num;
    }

    @Override
    public int precedeA(Celular celular) {
        ComparaStrings st = new ComparaStrings();
        return st.compare(celular.getNum(), getNum());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "empresa='" + empresa + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
