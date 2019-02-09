package patterns.structural.facade.motore;

public class MotorinoAccensione {

    private Chiave chiave;
    private Serbatoio serbatoio;
    private Batteria batteria;

    public MotorinoAccensione(Chiave chiave, Serbatoio serbatoio, Batteria batteria) {
        this.chiave = chiave;
        this.serbatoio = serbatoio;
        this.batteria = batteria;
    }

    public boolean accendiAuto() {
        if (serbatoio.benzinaSufficiente() &&
                batteria.caricaSufficiente() &&
                chiave.isInserita()) {
            System.out.println("Motore avviato");
            return true;
        }
        return false;
    }
}
