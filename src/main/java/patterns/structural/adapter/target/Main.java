package patterns.structural.adapter.target;

import patterns.structural.adapter.target.objects.Manager;
import patterns.structural.adapter.target.objects.CalcolaStipendi;
import patterns.structural.adapter.target.objects.Sviluppatore;

public class Main {
    public static void main(String[] args) {
        CalcolaStipendi calcolaStipendi = new CalcolaStipendi();
        calcolaStipendi.aggiungiImpiegato(new Sviluppatore());
        calcolaStipendi.aggiungiImpiegato(new Manager());

        calcolaStipendi.calcola();
    }
}
