package patterns.structural.facade.client;

import patterns.structural.facade.motore.MotorinoAccensione;
import patterns.structural.facade.motore.Batteria;
import patterns.structural.facade.motore.Chiave;
import patterns.structural.facade.motore.Serbatoio;

public class Tu {
    public static void main(String[] args) {
        Chiave chiave = new Chiave(true);
        Serbatoio serbatoio = new Serbatoio(20d);
        Batteria batteria = new Batteria(1);

        MotorinoAccensione motorinoAccensione = new MotorinoAccensione(chiave, serbatoio, batteria);
        motorinoAccensione.accendiAuto();
    }
}
