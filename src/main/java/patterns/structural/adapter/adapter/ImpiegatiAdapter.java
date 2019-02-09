package patterns.structural.adapter.adapter;

import patterns.structural.adapter.adaptee.Consulente;
import patterns.structural.adapter.adaptee.ConsulenteManager;
import patterns.structural.adapter.adaptee.ConsulenteSviluppatore;
import patterns.structural.adapter.target.objects.Impiegato;

public class ImpiegatiAdapter implements Impiegato {

    private Consulente adaptee;

    public ImpiegatiAdapter(Consulente adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void stampaDescrizionePosizione() {
        adaptee.stampaRuolo();
    }

    @Override
    public String senorityNecessaria() {
        if (adaptee instanceof ConsulenteManager) {
            return "2 anni + laurea";
        } else if (adaptee instanceof ConsulenteSviluppatore) {
            return "8 anni";
        } else {
            return "Unknown object";
        }
    }

    @Override
    public int stipendio() {
        return (int) Math.round(adaptee.stipendio());
    }
}
