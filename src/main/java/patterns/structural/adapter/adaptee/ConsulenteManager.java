package patterns.structural.adapter.adaptee;

public class ConsulenteManager implements Consulente {

    private final String team;

    public ConsulenteManager(String team) {
        this.team = team;
    }

    @Override
    public String turni() {
        return "lun-mar-ven";
    }

    @Override
    public double stipendio() {
        return 2000;
    }

    @Override
    public void stampaRuolo() {
        System.out.println("Al manager consulente gli vengono assegnati piccoli team in carico di progetti di secondari");
    }
}
