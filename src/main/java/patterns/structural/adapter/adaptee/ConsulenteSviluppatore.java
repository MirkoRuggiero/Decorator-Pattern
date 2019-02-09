package patterns.structural.adapter.adaptee;

public class ConsulenteSviluppatore implements Consulente {

    @Override
    public String turni() {
        return "lun-mar-mer-gio-ven";
    }

    @Override
    public double stipendio() {
        return 1000;
    }

    @Override
    public void stampaRuolo() {
        System.out.println("Affianca gli sviluppatori durante la fase di implementazione");
    }
}
