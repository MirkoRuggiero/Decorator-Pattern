package patterns.structural.adapter.client;

import patterns.structural.adapter.adaptee.ConsulenteSviluppatore;
import patterns.structural.adapter.adaptee.ConsulenteManager;
import patterns.structural.adapter.adapter.ImpiegatiAdapter;
import patterns.structural.adapter.target.objects.CalcolaStipendi;
import patterns.structural.adapter.target.objects.Manager;
import patterns.structural.adapter.target.objects.Sviluppatore;

public class AdapterTest {

    public static void main(String[] args) {
        CalcolaStipendi calcolaStipendi = new CalcolaStipendi();
        //target objects
        calcolaStipendi.aggiungiImpiegato(new Sviluppatore());
        calcolaStipendi.aggiungiImpiegato(new Manager());
        //adaptee objects
        calcolaStipendi.aggiungiImpiegato(new ImpiegatiAdapter(new ConsulenteManager("Project1")));
        calcolaStipendi.aggiungiImpiegato(new ImpiegatiAdapter(new ConsulenteSviluppatore()));

        calcolaStipendi.calcola();
    }
}
